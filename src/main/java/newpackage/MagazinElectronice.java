package newpackage;

import com.mycompany.magazinelectronice.*;

public class MagazinElectronice {
    public static boolean checkConditions(Device instance) {
        return instance.getPret() >= 1500.0f && instance.getCantitate() > 1;
    }
    
    public static void main(String[] args) {      
        TestInitiative test = new TestInitiative();
        Instances instances = new Instances();

       Device[] testClase =  instances.getInstancesArray("testClase");
       Device[] instancesArray =  instances.getInstancesArray("instances");
       
       // ******FUNCTIONALITATI****** \\
       
       System.out.println("          Initiere test clase               ");
       System.out.println("////////////////////////////////////////////");
       test.afisInitiative(testClase);
       System.out.println("////////////////////////////////////////////");
       System.out.println("            Final test clase                ");
       System.out.println("\n\n\n");
       System.out.println("          Initiere test conditie            ");
       System.out.println("////////////////////////////////////////////");
       for (Device instance : instancesArray) {
            if (checkConditions(instance)) { 
                System.out.println(instance);
                System.out.println();
            }
        }
       System.out.println("////////////////////////////////////////////");
       System.out.println("           Final test conditie              ");
    }
}
