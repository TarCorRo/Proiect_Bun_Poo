package fileactions;

import com.mycompany.magazinelectronice.Tableta;
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
public class TabletaFileActions {
    Tableta[] tableteArray = new Tableta[10];
    int index = 0;

    public static void setPropertyValue(Tableta tab, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "marca":
                tab.setMarca(propertyValue);
                break;
            case "model":
                tab.setModel(propertyValue);
                break;
            case "cantitate":
                tab.setCantitate(Integer.parseInt(propertyValue));
                break;
            case "anAparitie":
                tab.setAnAparitie(Integer.parseInt(propertyValue));
                break;
            case "pret":
                tab.setPret(Float.parseFloat(propertyValue));
                break;
            case "procesor":
                tab.setProcesor(propertyValue);
                break;
            case "tipEcran":
                tab.setTipEcran(propertyValue);
                break;
            case "culoare":
                tab.setCuloare(propertyValue);
                break;
            case "frecventaAntena":
                tab.setFrecventaAntena(propertyValue);
                break;
            case "sisOpTab":
                tab.setSisOpTab(propertyValue);
                break;
            case "tipIncarcare":
                tab.setTipIncarcare(propertyValue);
                break;
            case "tipSim":
                tab.setTipSim(propertyValue);
                break;
            case "rezEcran":
                tab.setRezEcran(propertyValue);
                break;
            case "rezCamere":
                tab.setRezCamere(propertyValue);
                break;
            case "memorieROM":
                tab.setMemorieROM(Integer.parseInt(propertyValue));
                break;
            case "memorieRAM":
                tab.setmemorieRAM(Integer.parseInt(propertyValue));
                break;
            case "mrCamere":
                tab.setNrCamere(Integer.parseInt(propertyValue));
                break;
            case "marimeBat":
                tab.setMarimeBat(Integer.parseInt(propertyValue));
                break;
            case "diagonalaEcran":
                tab.setDiagonalaEcran(Float.parseFloat(propertyValue));
                break;
            default: 
                break;
        }
    }

    public Tableta[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Tableta currentTableta = new Tableta();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentTableta, propertyName, propertyValue);
                    }
                } else {
                    tableteArray[index] = currentTableta;
                    index++;
                    currentTableta = new Tableta();
                }
            }

            tableteArray[index] = currentTableta;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return tableteArray;
    }
    
    public void writeToFile(String filePath, List<Tableta> desktopArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Tableta tab : tableteArray) {
                    writer.write("marca: " + tab.getMarca());
                    writer.newLine();

                    writer.write("model: " + tab.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + tab.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + tab.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + tab.getPret());
                    writer.newLine();

                    writer.write("procesor: " +tab.getProcesor());
                    writer.newLine();
                    
                    writer.write("tipEcran: " +tab.getTipEcran());
                    writer.newLine();

                    writer.write("culoare: " + tab.getCuloare());
                    writer.newLine();

                    writer.write("frecventaAntena: " + tab.getFrecventaAntena());
                    writer.newLine();

                    writer.write("sisOpTab: " + tab.getSisOpTab());
                    writer.newLine();

                    writer.write("tipIncarcare: " + tab.getTipIncarcare());
                    writer.newLine();

                    writer.write("tipSim: " + tab.getTipSim());
                    writer.newLine();

                    writer.write("rezEcran: " + tab.getRezEcran());
                    writer.newLine();

                    writer.write("memorieROM: " + tab.getMemorieROM());
                    writer.newLine();
                    
                    writer.write("memorieRAM: " + tab.getMemorieRAM());
                    writer.newLine();
                    
                    writer.write("nrCamere: " + tab.getNrCamere());
                    writer.newLine();

                    writer.write("marimeBat: " + tab.getMarimeBat());
                    writer.newLine();

                    writer.write("diagonalaEcran: " + tab.getDiagonalaEcran());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}