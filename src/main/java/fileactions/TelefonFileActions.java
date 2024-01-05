package fileactions;

import com.mycompany.magazinelectronice.Telefon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author as577
 */
public class TelefonFileActions {
    Telefon[] telefonArray = new Telefon[10];
    int index = 0;

    public static void setPropertyValue(Telefon tel, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "marca":
                tel.setMarca(propertyValue);
                break;
            case "model":
                tel.setModel(propertyValue);
                break;
            case "cantitate":
                tel.setCantitate(Integer.parseInt(propertyValue));
                break;
            case "anAparitie":
                tel.setAnAparitie(Integer.parseInt(propertyValue));
                break;
            case "pret":
                tel.setPret(Float.parseFloat(propertyValue));
                break;
            case "procesor":
                tel.setProcesor(propertyValue);
                break;
            case "tipEcran":
                tel.setTipEcran(propertyValue);
                break;
            case "culoare":
                tel.setCuloare(propertyValue);
                break;
            case "frecventaAntena":
                tel.setFrecventaAntena(propertyValue);
                break;
            case "sisOpTel":
                tel.setSisOpTel(propertyValue);
                break;
            case "tipIncarcare":
                tel.setTipIncarcare(propertyValue);
                break;
            case "tipSim":
                tel.setTipSim(propertyValue);
                break;
            case "rezEcran":
                tel.setRezEcran(propertyValue);
                break;
            case "rezCamere":
                tel.setRezCamere(propertyValue);
                break;
            case "memorieROM":
                tel.setMemorieROM(Integer.parseInt(propertyValue));
                break;
            case "memorieRAM":
                tel.setmemorieRAM(Integer.parseInt(propertyValue));
                break;
            case "mrCamere":
                tel.setNrCamere(Integer.parseInt(propertyValue));
                break;
            case "marimeBat":
                tel.setMarimeBat(Integer.parseInt(propertyValue));
                break;
            case "diagonalaEcran":
                tel.setDiagonalaEcran(Float.parseFloat(propertyValue));
                break;
            default: 
                break;
        }
    }

    public Telefon[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Telefon currentTelefon = new Telefon();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentTelefon, propertyName, propertyValue);
                    }
                } else {
                    telefonArray[index] = currentTelefon;
                    index++;
                    currentTelefon = new Telefon();
                }
            }

            telefonArray[index] = currentTelefon;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return telefonArray;
    }
    
    public void writeToFile(String filePath, List<Telefon> desktopArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Telefon tel : telefonArray) {
                    writer.write("marca: " + tel.getMarca());
                    writer.newLine();

                    writer.write("model: " + tel.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + tel.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + tel.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + tel.getPret());
                    writer.newLine();

                    writer.write("procesor: " +tel.getProcesor());
                    writer.newLine();
                    
                    writer.write("tipEcran: " +tel.getTipEcran());
                    writer.newLine();

                    writer.write("culoare: " + tel.getCuloare());
                    writer.newLine();

                    writer.write("frecventaAntena: " + tel.getFrecventaAntena());
                    writer.newLine();

                    writer.write("sisOpTel: " + tel.getSisOpTel());
                    writer.newLine();

                    writer.write("tipIncarcare: " + tel.getTipIncarcare());
                    writer.newLine();

                    writer.write("tipSim: " + tel.getTipSim());
                    writer.newLine();

                    writer.write("rezEcran: " + tel.getRezEcran());
                    writer.newLine();

                    writer.write("memorieROM: " + tel.getMemorieROM());
                    writer.newLine();
                    
                    writer.write("memorieRAM: " + tel.getMemorieRAM());
                    writer.newLine();
                    
                    writer.write("nrCamere: " + tel.getNrCamere());
                    writer.newLine();

                    writer.write("marimeBat: " + tel.getMarimeBat());
                    writer.newLine();

                    writer.write("diagonalaEcran: " + tel.getDiagonalaEcran());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}