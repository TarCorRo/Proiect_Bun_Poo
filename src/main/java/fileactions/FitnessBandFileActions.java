/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.FitnessBand;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author gm387
 */
public class FitnessBandFileActions {
    FitnessBand[] BandArray = new FitnessBand[10];
    int index = 0;

    public static void setPropertyValue(FitnessBand fitnessBand, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "marca":
                fitnessBand.setMarca(propertyValue);
                break;
            case "model":
                fitnessBand.setModel(propertyValue);
                break;
            case "cantitate":
                fitnessBand.setCantitate(Integer.parseInt(propertyValue));
                break;
            case "anAparitie":
                fitnessBand.setAnAparitie(Integer.parseInt(propertyValue));
                break;
            case "pret":
                fitnessBand.setPret(Float.parseFloat(propertyValue));
                break;
            case "culoare":
                fitnessBand.setCuloare(propertyValue);
                break;
            case "capabilitati":
                fitnessBand.setCapabilities(propertyValue);
                break;
            case "sistemDeOperare":
                fitnessBand.setSistemDeOperareFB(propertyValue);    
                break;
            case "memorieRam":
                fitnessBand.setMemorieRAM(Integer.parseInt(propertyValue));
                break;
            case "procesor":
                fitnessBand.setProcesor(propertyValue);
                break;
            default: 
                break;
        }
    }

    public FitnessBand[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            FitnessBand currentBand = new FitnessBand();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentBand, propertyName, propertyValue);
                    }
                } else {
                    BandArray[index] = currentBand;
                    index++;
                    currentBand = new FitnessBand();
                }
            }

            BandArray[index] = currentBand;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return BandArray;
    }
    
    public void writeToFile(String filePath, List<FitnessBand> BandArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (FitnessBand fitBand : BandArray) {
                    writer.write("marca: " + fitBand.getMarca());
                    writer.newLine();

                    writer.write("model: " + fitBand.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + fitBand.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + fitBand.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + fitBand.getPret());
                    writer.newLine();

                    writer.write("procesor: " + fitBand.getProcesor());
                    writer.newLine();

                    writer.write("culoare: " + fitBand.getCuloare());
                    writer.newLine();
                    
                    writer.write("capabilitati: " + fitBand.getCapabilities());
                    writer.newLine();

                    writer.write("sistemDeOperare: " + fitBand.getSistemDeOperareFB());
                    writer.newLine();

                    writer.write("memorieRam: " + fitBand.getMemorieRAM());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
