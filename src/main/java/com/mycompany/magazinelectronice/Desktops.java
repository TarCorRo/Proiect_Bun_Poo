package com.mycompany.magazinelectronice;

public class Desktops extends Device{
    String procesor, culoare, frecventaRam, sistemDeOperare, tipPlacaVideo, modelPlacaVideo, tipPorturi;
    int memorieRam, nrPorturi;
    float greutate;
    
    public Desktops() 
    {
        super(null,null,0,0,0);
    }
    
    public Desktops(String marca, String model, String procesor, String culoare, String frecventaRam, String sistemDeOperare, String tipPlacaVideo, String modelPlacaVideo, String tipPorturi, int anAparitie, int cantitate, int memorieRam, int nrPorturi,  float pret, float greutate) {
        super( marca, model, cantitate, anAparitie, pret);
        this.procesor = procesor;
        this.culoare = culoare;
        this.frecventaRam = frecventaRam;
        this.sistemDeOperare = sistemDeOperare;
        this.tipPlacaVideo = tipPlacaVideo;
        this.modelPlacaVideo = modelPlacaVideo;
        this.tipPorturi = tipPorturi;
        this.memorieRam = memorieRam;
        this.nrPorturi = nrPorturi;
        this.greutate = greutate;
    }
    
    public Desktops(Desktops l) {
        super( l.marca, l.model, l.cantitate, l.anAparitie, l.pret);
        this.procesor = l.procesor;
        this.culoare = l.culoare;
        this.frecventaRam = l.frecventaRam;
        this.sistemDeOperare = l.sistemDeOperare;
        this.tipPlacaVideo = l.tipPlacaVideo;
        this.modelPlacaVideo = l.modelPlacaVideo;
        this.tipPorturi = l.tipPorturi;
        
        this.memorieRam = l.memorieRam;
        this.nrPorturi = l.nrPorturi;
        
        this.greutate = l.greutate;
    }  
    
    // Procesor
    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    // Culoare
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    // Frecventa RAM
    public String getFrecventaRam() {
        return frecventaRam;
    }

    public void setFrecventaRam(String frecventaRam) {
        this.frecventaRam = frecventaRam;
    }

    // Sistem de Operare
    public String getSistemDeOperare() {
        return sistemDeOperare;
    }

    public void setSistemDeOperare(String sistemDeOperare) {
        this.sistemDeOperare = sistemDeOperare;
    }

    // Tip Placa Video
    public String getTipPlacaVideo() {
        return tipPlacaVideo;
    }

    public void setTipPlacaVideo(String tipPlacaVideo) {
        this.tipPlacaVideo = tipPlacaVideo;
    }

    // Model Placa Video
    public String getModelPlacaVideo() {
        return modelPlacaVideo;
    }

    public void setModelPlacaVideo(String modelPlacaVideo) {
        this.modelPlacaVideo = modelPlacaVideo;
    }

    // Tip Porturi
    public String getTipPorturi() {
        return tipPorturi;
    }

    public void setTipPorturi(String tipPorturi) {
        this.tipPorturi = tipPorturi;
    }

    // Memorie RAM
    public int getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(int memorieRam) {
        this.memorieRam = memorieRam;
    }
   
    // Numar Porturi
    public int getNrPorturi() {
        return nrPorturi;
    }

    public void setNrPorturi(int nrPorturi) {
        this.nrPorturi = nrPorturi;
    }

    // Greutate
    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }
    
    @Override
    public String toString() {
        return super.toString() + " procesor " + procesor + 
                "\n culoare " + culoare + 
                "\n frecventaRam " + frecventaRam + 
                "\n sistemDeOperare " + sistemDeOperare + 
                "\n tipPlacaVideo " + tipPlacaVideo + 
                "\n modelPlacaVideo " + modelPlacaVideo + 
                "\n tipPorturi " + tipPorturi + 
                "\n memorieRam " + memorieRam + 
                "\n nrPorturi " + nrPorturi + 
                "\n greutate " + greutate;
        
    }
}
