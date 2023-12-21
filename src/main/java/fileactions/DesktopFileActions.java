/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.Desktopuri;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}
