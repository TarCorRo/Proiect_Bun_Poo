/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.BoxaPortabila;
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
public class BoxaPortabilaFileActions {
    BoxaPortabila[] BoxaArray = new BoxaPortabila[10];
    int index = 0;

    public static void setPropertyValue(BoxaPortabila boxa, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "Culoare":
                boxa.setCuloare(propertyValue);
                break;
            case "TipConectivitate":
                boxa.setTipConectivitate(propertyValue);
                break;
            case "TipBaterie":
                boxa.setTipBaterie(propertyValue);
                break;
            case "variantaBluetooth":
                boxa.setVariantaBluetooth(Float.parseFloat(propertyValue));
                break;
            case "impedantaNominala":
                boxa.setImpedantaNominala(Integer.parseInt(propertyValue));               
                break;
            case "RaspunsInFrecventa":
                boxa.setRaspunsInFrecventa(Float.parseFloat(propertyValue));
                break;
            case "Spl":
                boxa.setSpl(Integer.parseInt(propertyValue));
                break;
            case "capacitateBaterie":
                boxa.setCapacitateBaterie(Integer.parseInt(propertyValue));
                break;
            case "latime":
                boxa.setLatime(Integer.parseInt(propertyValue));
                break;
            case "lungime":
                boxa.setLungime(Integer.parseInt(propertyValue));
                break;
            case "adancime":
                boxa.setAdancime(Integer.parseInt(propertyValue));
                break;
            default: 
                break;
        }
    }

    public BoxaPortabila[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            BoxaPortabila currentBoxa = new BoxaPortabila();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentBoxa, propertyName, propertyValue);
                    }
                } else {
                    BoxaArray[index] = currentBoxa;
                    index++;
                    currentBoxa = new BoxaPortabila();
                }
            }

            BoxaArray[index] = currentBoxa;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return BoxaArray;
    }
    
    public void writeToFile(String filePath, List<BoxaPortabila> BoxaArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (BoxaPortabila boxa : BoxaArray) {
                    writer.write("Culoare: " + boxa.getCuloare());
                    writer.newLine();

                    writer.write("Tip Conectivitate: " + boxa.getTipConectivitate());
                    writer.newLine();
                    
                    writer.write("Tip Baterie: " + boxa.getTipBaterie());
                    writer.newLine();
                    
                    writer.write("Varianta Bluetooth: " + boxa.getVariantaBluetooth());
                    writer.newLine();
                    
                    writer.write("Raspuns in Frecventa: " + boxa.getRaspunsInFrecventa());
                    writer.newLine();

                    writer.write("Impedanta Nominala: " + boxa.getImpedantaNominala());
                    writer.newLine();

                    writer.write("Spl: " + boxa.getSpl());
                    writer.newLine();
                    
                    writer.write("Capacitate Baterie: " + boxa.getCapacitateBaterie());
                    writer.newLine();

                    writer.write("Latime: " + boxa.getLatime());
                    writer.newLine();

                    writer.write("Lungime: " + boxa.getLungime());
                    writer.newLine();
                    
                    writer.write("Adancime: " + boxa.getAdancime());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
