/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.Desktopuri;
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
public class DesktopFileActions {
    Desktopuri[] desktopArray = new Desktopuri[10];
    int index = 0;

    public static void setPropertyValue(Desktopuri laptop, String propertyName, String propertyValue) {
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
            case "memorieRam":
                laptop.setMemorieRam(Integer.parseInt(propertyValue));
                break;
            case "nrPorturi":
                laptop.setNrPorturi(Integer.parseInt(propertyValue));
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

    public Desktopuri[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Desktopuri currentDesktop = new Desktopuri();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentDesktop, propertyName, propertyValue);
                    }
                } else {
                    desktopArray[index] = currentDesktop;
                    index++;
                    currentDesktop = new Desktopuri();
                }
            }

            desktopArray[index] = currentDesktop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return desktopArray;
    }
    
    public void writeToFile(String filePath, List<Desktopuri> desktopArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Desktopuri desktop : desktopArray) {
                    writer.write("marca: " + desktop.getMarca());
                    writer.newLine();

                    writer.write("model: " + desktop.getModel());
                    writer.newLine();
                    
                    writer.write("cantitate: " + desktop.getCantitate());
                    writer.newLine();
                    
                    writer.write("anAparitie: " + desktop.getAnAparitie());
                    writer.newLine();
                    
                    writer.write("pret: " + desktop.getPret());
                    writer.newLine();

                    writer.write("procesor: " + desktop.getProcesor());
                    writer.newLine();

                    writer.write("culoare: " + desktop.getCuloare());
                    writer.newLine();

                    writer.write("frecventaRam: " + desktop.getFrecventaRam());
                    writer.newLine();

                    writer.write("sistemDeOperare: " + desktop.getSistemDeOperare());
                    writer.newLine();

                    writer.write("tipPlacaVideo: " + desktop.getTipPlacaVideo());
                    writer.newLine();

                    writer.write("modelPlacaVideo: " + desktop.getModelPlacaVideo());
                    writer.newLine();

                    writer.write("tipPorturi: " + desktop.getTipPorturi());
                    writer.newLine();

                    writer.write("memorieRam: " + desktop.getMemorieRam());
                    writer.newLine();

                    writer.write("nrPorturi: " + desktop.getNrPorturi());
                    writer.newLine();

                    writer.write("greutate: " + desktop.getGreutate());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
