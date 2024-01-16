package fileactions;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.mycompany.magazinelectronice.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class LaptopFileActions {
    Laptop[] laptopArray = new Laptop[10];
    int index = 0;

    public static void setPropertyValue(Laptop laptop, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "marca":
                laptop.setMarca(propertyValue);
                break;
            case "model":
                laptop.setModel(propertyValue);
                break;
            case "cantitate":
                laptop.setCantitate(Integer.parseInt(propertyValue));
                break;
            case "anAparitie":
                laptop.setAnAparitie(Integer.parseInt(propertyValue));
                break;
            case "pret":
                laptop.setPret(Float.parseFloat(propertyValue));
                break;
            case "rezEcran":
                laptop.setRezEcran(propertyValue);
                break;
            case "tipEcran":
                laptop.setTipEcran(propertyValue);
                break;
            case "culoare":
                laptop.setCuloare(propertyValue);
                break;
            case "frecventaRam":
                laptop.setFrecventaRam(propertyValue);
                break;
            case "sistemDeOperare":
                laptop.setSistemDeOperare(propertyValue);
                break;
            case "tipPlacaVideo":
                laptop.setTipPlacaVideo(propertyValue);
                break;
            case "modelPlacaVideo":
                laptop.setModelPlacaVideo(propertyValue);
                break;
            case "tipPorturi":
                laptop.setTipPorturi(propertyValue);
                break;
            case "autonomieBat":
                laptop.setAutonomieBat(propertyValue);
                break;
            case "memorieRam":
                laptop.setMemorieRam(Integer.parseInt(propertyValue));
                break;
            case "nrCamere":
                laptop.setNrCamere(Integer.parseInt(propertyValue));
                break;
            case "rezCamere":
                laptop.setRezCamere(Integer.parseInt(propertyValue));
                break;
            case "marimeBat":
                laptop.setMarimeBat(Integer.parseInt(propertyValue));
                break;
            case "nrPorturi":
                laptop.setNrPorturi(Integer.parseInt(propertyValue));
                break;
            case "diagonalaEcran":
                laptop.setDiagonalaEcran(Float.parseFloat(propertyValue));
                break;
            case "greutate":
                laptop.setGreutate(Float.parseFloat(propertyValue));
                break;
            case "procesor":
                laptop.setProcesor(propertyValue);
                break;
            default: 
                break;
        }
    }

    public Laptop[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Laptop currentLaptop = new Laptop();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentLaptop, propertyName, propertyValue);
                    }
                } else {
                    laptopArray[index] = currentLaptop;
                    index++;
                    currentLaptop = new Laptop();
                }
            }

            laptopArray[index] = currentLaptop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return laptopArray;
    }
    
    public void writeToFile(String filePath,  List<Laptop> laptopArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Laptop laptop : laptopArray) {
                    writer.write("marca: " + laptop.getMarca());
                    writer.newLine();

                    writer.write("model: " + laptop.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + laptop.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + laptop.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + laptop.getPret());
                    writer.newLine();

                    writer.write("procesor: " + laptop.getProcesor());
                    writer.newLine();
                    
                    writer.write("tipEcran: " + laptop.getTipEcran());
                    writer.newLine();

                    writer.write("culoare: " + laptop.getCuloare());
                    writer.newLine();

                    writer.write("frecventaRam: " + laptop.getFrecventaRam());
                    writer.newLine();

                    writer.write("sistemDeOperare: " + laptop.getSistemDeOperare());
                    writer.newLine();

                    writer.write("tipPlacaVideo: " + laptop.getTipPlacaVideo());
                    writer.newLine();

                    writer.write("modelPlacaVideo: " + laptop.getModelPlacaVideo());
                    writer.newLine();

                    writer.write("tipPorturi: " + laptop.getTipPorturi());
                    writer.newLine();
                    
                    writer.write("autonomieBat: " + laptop.getAutonomieBat());
                    writer.newLine();

                    writer.write("memorieRam: " + laptop.getMemorieRam());
                    writer.newLine();
                    
                    writer.write("nrCamere: " + laptop.getNrCamere());
                    writer.newLine();
                    
                    writer.write("rezCamere: " + laptop.getRezCamere());
                    writer.newLine();
                    
                    writer.write("marimeBat: " + laptop.getMarimeBat());
                    writer.newLine();

                    writer.write("nrPorturi: " + laptop.getNrPorturi());
                    writer.newLine();

                    writer.write("greutate: " + laptop.getGreutate());
                    writer.newLine();
                    
                    writer.write("diagonalaEcran: " + laptop.getDiagonalaEcran());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
