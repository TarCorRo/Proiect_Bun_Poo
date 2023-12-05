package com.mycompany.magazinelectronice;

//@author Razvan

public class Telefon extends Device{
    
    String procesor, tipEcran, culoare, frecventaAntena, sisOpTel, tipIncarcare, tipSim, rezEcran, rezCamere;
    int memorieROM, memorieRAM, nrCamere, marimeBat;
    double diagonalaEcran;
    
    public Telefon(){
        super(null,null,0,0,0);
         this.procesor=null;
         this.tipEcran=null;
         this.culoare=null;
         this.frecventaAntena=null;
         this.sisOpTel=null;
         this.tipIncarcare=null;
         this.tipSim=null;
         this.memorieRAM=0;
         this.memorieROM=0;
         this.nrCamere=0;
         this.rezCamere=null;
         this.marimeBat=0;
         this.diagonalaEcran=0;
         this.rezEcran=null;
    }
    
    public Telefon(String marca, String model, String procesor, String tipEcran, String culoare, String frecventaAntena, String sisOpTel, String tipIncarcare, String tipSim, int cantitate, int memorieROM, int memorieRAM, int anAparitie, int nrCamere,String rezCamere, int marimeBat, float pret, double diagonalaEcran, String rezEcran)
    {
        super( marca, model, cantitate, anAparitie, pret);
         this.procesor=procesor;
         this.tipEcran=tipEcran;
         this.culoare=culoare;
         this.frecventaAntena=frecventaAntena;
         this.sisOpTel=sisOpTel;
         this.tipIncarcare=tipIncarcare;
         this.tipSim=tipSim;
         this.memorieRAM=memorieRAM;
         this.memorieROM=memorieROM;
         this.nrCamere=nrCamere;
         this.rezCamere=rezCamere;
         this.marimeBat=marimeBat;
         this.diagonalaEcran=diagonalaEcran;
         this.rezEcran=rezEcran;
    }
    
    public Telefon(Telefon telefonOriginal) {
        super( telefonOriginal.marca, telefonOriginal.model, telefonOriginal.cantitate, telefonOriginal.anAparitie, telefonOriginal.pret);
        this.procesor = telefonOriginal.procesor;
        this.tipEcran = telefonOriginal.tipEcran;
        this.culoare = telefonOriginal.culoare;
        this.frecventaAntena = telefonOriginal.frecventaAntena;
        this.sisOpTel = telefonOriginal.sisOpTel;
        this.tipIncarcare = telefonOriginal.tipIncarcare;
        this.tipSim = telefonOriginal.tipSim;
        this.rezEcran = telefonOriginal.rezEcran;
        this.rezCamere = telefonOriginal.rezCamere;
        this.memorieROM = telefonOriginal.memorieROM;
        this.memorieRAM = telefonOriginal.memorieRAM;
        this.nrCamere = telefonOriginal.nrCamere;
        this.marimeBat = telefonOriginal.marimeBat;
        this.diagonalaEcran = telefonOriginal.diagonalaEcran;
    }
    
    public String toString()
    {
        return super.toString() +
                "\nDiagonala ecranului telefon : "+ diagonalaEcran +
                "\nProcesor telefon : "+ procesor +
                "\nTip ecran telefon : "+ tipEcran +
                "\nCuloare telefon : "+ culoare +
                "\nFrecventa Antena telefon : "+ frecventaAntena +
                "\nSistemul de operare al telefon : "+ sisOpTel +
                "\nTipuri de incarcare telefon : "+ tipIncarcare +
                "\nTip sim telefon : "+ tipSim +
                "\nRezolutie ecran telefon : "+ rezEcran +
                "\nNumarul camerelor de pe telefon : "+ nrCamere +
                "\nRezolutie camere de pe telefon : "+ rezCamere +
                "\nMemorie ROM telefon : "+ memorieROM + " GB "+
                "\nMemorie RAM telefon : "+ memorieRAM + " GB "+
                "\nMarimea bateriei de pe telefon : "+ marimeBat + " mAh ";
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

    public String getSisOpTel() {
        return sisOpTel;
    }

    public void setSisOpTel(String sisOpTel) {
        this.sisOpTel = sisOpTel;
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
