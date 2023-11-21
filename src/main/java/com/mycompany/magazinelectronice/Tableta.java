package com.mycompany.magazinelectronice;

//@author Razvan

public class Tableta extends Device{
    
    String procesor, tipEcran, culoare, frecventaAntena, sisOpTab, tipIncarcare, tipSim, rezEcran, rezCamere;
    int  memorieROM, memorieRAM, nrCamere, marimeBat;
    double diagonalaEcran;
    
    public Tableta(){
        super("NULL","NULL",0,0,0);
         this.procesor="NULL";
         this.tipEcran="NULL";
         this.culoare="NULL";
         this.frecventaAntena="NULL";
         this.sisOpTab="NULL";
         this.tipIncarcare="NULL";
         this.tipSim="NULL";
         this.memorieRAM=0;
         this.memorieROM=0;
         this.nrCamere=0;
         this.rezCamere="NULL";
         this.marimeBat=0;
         this.diagonalaEcran=0;
         this.rezEcran="NULL";
    }
    
    public Tableta(String marca, String model, String procesor, String tipEcran, String culoare, String frecventaAntena, String sisOpTab, String tipIncarcare, String tipSim, int cantitate, int memorieROM, int memorieRAM, int anAparitie, int nrCamere,String rezCamere, int marimeBat, float pret, double diagonalaEcran, String rezEcran)
    {
        super( marca, model, cantitate, anAparitie, pret);
         this.procesor=procesor;
         this.tipEcran=tipEcran;
         this.culoare=culoare;
         this.frecventaAntena=frecventaAntena;
         this.sisOpTab=sisOpTab;
         this.tipIncarcare=tipIncarcare;
         this.tipSim=tipSim;
         this.cantitate=cantitate;
         this.memorieRAM=memorieRAM;
         this.memorieROM=memorieROM;
         this.nrCamere=nrCamere;
         this.rezCamere=rezCamere;
         this.marimeBat=marimeBat;
         this.diagonalaEcran=diagonalaEcran;
         this.rezEcran=rezEcran;
    }
    
    public Tableta(Tableta tabletaOriginala) {
        super( tabletaOriginala.marca, tabletaOriginala.model, tabletaOriginala.cantitate, tabletaOriginala.anAparitie, tabletaOriginala.pret);
        this.procesor = tabletaOriginala.procesor;
        this.tipEcran = tabletaOriginala.tipEcran;
        this.culoare = tabletaOriginala.culoare;
        this.frecventaAntena = tabletaOriginala.frecventaAntena;
        this.sisOpTab = tabletaOriginala.sisOpTab;
        this.tipIncarcare = tabletaOriginala.tipIncarcare;
        this.tipSim = tabletaOriginala.tipSim;
        this.rezEcran = tabletaOriginala.rezEcran;
        this.rezCamere = tabletaOriginala.rezCamere;
        this.memorieROM = tabletaOriginala.memorieROM;
        this.memorieRAM = tabletaOriginala.memorieRAM;
        this.nrCamere = tabletaOriginala.nrCamere;
        this.marimeBat = tabletaOriginala.marimeBat;
        this.diagonalaEcran = tabletaOriginala.diagonalaEcran;
    }
    
    public String toString()
    {
        return "Nume tableta : " + marca + " " + model +
                "\nMarca tableta : "+ marca +
                "\nModel tableta : "+ model +
                "\nDiagonala ecranului tabletei : "+ diagonalaEcran +
                "\nProcesor tableta : "+ procesor +
                "\nTip ecran tableta : "+ tipEcran +
                "\nCuloare tableta : "+ culoare +
                "\nFrecventa Antena tableta : "+ frecventaAntena +
                "\nSistemul de operare al tabletei : "+ sisOpTab +
                "\nTipuri de incarcare tableta : "+ tipIncarcare +
                "\nTip sim tableta : "+ tipSim +
                "\nRezolutie ecran tableta : "+ rezEcran +
                "\nNumarul camerelor de pe tableta : "+ nrCamere +
                "\nRezolutie camere de pe tableta : "+ rezCamere +
                "\nMemorie ROM tableta : "+ memorieROM + " GB "+
                "\nMemorie RAM tableta : "+ memorieRAM + " GB "+
                "\nMarimea bateriei de pe tableta : "+ marimeBat + " mAh "+
                "\nPretul tabletei : "+ pret + " Lei "+
                "\nProduse in stoc : "+ cantitate +
                "\nAnul aparitiei tabletei : "+ anAparitie;
    }
    
    public double getDiagonalaEcran() {
        return diagonalaEcran;
    }
    
    public void setDiagonalaEcran(float diagonalaEcran) {
        this.diagonalaEcran = diagonalaEcran;
    }

    public int getMemorieROM() {
        return memorieROM;
    }

    public void setMemorieROM(int memorieROM) {
        this.memorieROM = memorieROM;
    }
    
    public void setmemorieRAM(int memorieRAM){
        this.memorieRAM=memorieRAM;
    }
    
    public int getMemorieRAM() {
        return memorieRAM;
    }
    
    public void setNrCamere(int nrCamere){
        this.nrCamere=nrCamere;
    }
    
    public int getNrCamere() {
        return nrCamere;
    }
    
    public void setMarimeBat(int marimeBat){
        this.marimeBat=marimeBat;
    }
    
    public int getMarimeBat() {
        return marimeBat;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getTipEcran() {
        return tipEcran;
    }

    public void setTipEcran(String tipEcran) {
        this.tipEcran = tipEcran;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getFrecventaAntena() {
        return frecventaAntena;
    }

    public void setFrecventaAntena(String frecventaAntena) {
        this.frecventaAntena = frecventaAntena;
    }

    public String getSisOpTab() {
        return sisOpTab;
    }

    public void setSisOpTab(String sisOpTab) {
        this.sisOpTab = sisOpTab;
    }

    public String getTipIncarcare() {
        return tipIncarcare;
    }

    public void setTipIncarcare(String tipIncarcare) {
        this.tipIncarcare = tipIncarcare;
    }

    public String getTipSim() {
        return tipSim;
    }

    public void setTipSim(String tipSim) {
        this.tipSim = tipSim;
    }

    public String getRezEcran() {
        return rezEcran;
    }

    public void setRezEcran(String rezEcran) {
        this.rezEcran = rezEcran;
    }

    public String getRezCamere() {
        return rezCamere;
    }

    public void setRezCamere(String rezCamere) {
        this.rezCamere = rezCamere;
    }
    
}
