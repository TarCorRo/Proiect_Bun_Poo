package fileactions;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.mycompany.magazinelectronice.*;

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
}
