/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.Smartwatch;
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
public class SmartwatchFileActions {
    Smartwatch[] smartwatchArray = new Smartwatch[10];
    int index = 0;

    public static void setPropertyValue(Smartwatch smartwatch, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "marca":
                smartwatch.setMarca(propertyValue);
                break;
            case "model":
                smartwatch.setModel(propertyValue);
                break;
            case "cantitate":
                smartwatch.setCantitate(Integer.parseInt(propertyValue));
                break;
            case "anAparitie":
                smartwatch.setAnAparitie(Integer.parseInt(propertyValue));
                break;
            case "pret":
                smartwatch.setPret(Float.parseFloat(propertyValue));
                break;
            case "culoare":
                smartwatch.setCuloare(propertyValue);
                break;
            case "capabilitati":
                smartwatch.setCapabilities(propertyValue);
                break;
            case "sistemDeOperare":
                smartwatch.setSistemDeOperareSmtWtc(propertyValue);
                break;
            case "memorieRam":
                smartwatch.setMemorieRAM(Integer.parseInt(propertyValue));
                break;
            case "procesor":
                smartwatch.setProcesor(propertyValue);
                break;
            default: 
                break;
        }
    }

    public Smartwatch[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Smartwatch currentWatch = new Smartwatch();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentWatch, propertyName, propertyValue);
                    }
                } else {
                    smartwatchArray[index] = currentWatch;
                    index++;
                    currentWatch = new Smartwatch();
                }
            }

            smartwatchArray[index] = currentWatch;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return smartwatchArray;
    }
    
    public void writeToFile(String filePath, List<Smartwatch> smartwatchArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Smartwatch smartwatch : smartwatchArray) {
                    writer.write("marca: " + smartwatch.getMarca());
                    writer.newLine();

                    writer.write("model: " + smartwatch.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + smartwatch.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + smartwatch.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + smartwatch.getPret());
                    writer.newLine();

                    writer.write("procesor: " + smartwatch.getProcesor());
                    writer.newLine();

                    writer.write("culoare: " + smartwatch.getCuloare());
                    writer.newLine();
                    
                    writer.write("capabilitati: " + smartwatch.getCapabilities());
                    writer.newLine();

                    writer.write("sistemDeOperare: " + smartwatch.getSistemDeOperareSmtWtc());
                    writer.newLine();

                    writer.write("memorieRam: " + smartwatch.getMemorieRAM());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
