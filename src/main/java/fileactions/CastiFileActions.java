/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileactions;

import com.mycompany.magazinelectronice.Casti;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CastiFileActions {
    Casti[] castiArray = new Casti[10];
    int index = 0;

    public static void setPropertyValue(Casti casti, String propertyName, String propertyValue) {
        switch (propertyName) {
            case "Culoare":
                casti.setCuloare(propertyValue);
                break;
            case "ContactCuUrechea":
                casti.setContactCuUrechea(propertyValue);
                break;
            case "PrincipiudeFunctionare":
                casti.setPrincipiuDeFunctionare(propertyValue);
                break;
            case "TipConectivitate":
                casti.setTipConectivitate(propertyValue);
                break;
            case "LungimeCablu":
                casti.setLungimeCablu(Float.parseFloat(propertyValue));
                break;
            case "RaspunsInFrecventa":
                casti.setRaspunsInFrecventa(Float.parseFloat(propertyValue));
                break;
            case "Autonomie":
                casti.setAutonomie(Integer.parseInt(propertyValue));
                break;
            case "Impedanta":
                casti.setImpedanta(Integer.parseInt(propertyValue));
                break;
            case "Greutate":
                casti.setGreutate(Integer.parseInt(propertyValue));
                break;
            case "Spl":
                casti.setSpl(Integer.parseInt(propertyValue));
                break;
            default: 
                break;
        }
    }

    public Casti[] readFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Casti currentCasti = new Casti();
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String propertyName = parts[0].trim();
                        String propertyValue = parts[1].trim();

                        setPropertyValue(currentCasti, propertyName, propertyValue);
                    }
                } else {
                    castiArray[index] = currentCasti;
                    index++;
                    currentCasti = new Casti();
                }
            }

            castiArray[index] = currentCasti;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return castiArray;
    }
    
    public void writeToFile(String filePath, List<Casti> castiArray) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Casti casti : castiArray) {
                    writer.write("Culoare: " + casti.getCuloare());
                    writer.newLine();

                    writer.write("Contact cu urechea: " + casti.getContactCuUrechea());
                    writer.newLine();
                    
                    writer.write("Principiu de Functionare: " + casti.getPrincipiuDeFunctionare());
                    writer.newLine();
                    
                    writer.write("Tip Conectivitate: " + casti.getTipConectivitate());
                    writer.newLine();
                    
                    writer.write("Lungime Cablu: " + casti.getLungimeCablu());
                    writer.newLine();

                    writer.write("Raspuns in Frecventa: " + casti.getRaspunsInFrecventa());
                    writer.newLine();

                    writer.write("Autonomie: " + casti.getAutonomie());
                    writer.newLine();
                    
                    writer.write("Impedanta: " + casti.getImpedanta());
                    writer.newLine();

                    writer.write("Greutate: " + casti.getGreutate());
                    writer.newLine();

                    writer.write("Spl: " + casti.getSpl());
                    writer.newLine();
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
