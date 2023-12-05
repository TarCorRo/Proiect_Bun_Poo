package com.mycompany.magazinelectronice;

public class Laptop extends Device{
    String rezEcran, procesor, tipEcran, culoare, frecventaRam, sistemDeOperare, tipPlacaVideo, modelPlacaVideo, tipPorturi, autonomieBat;
    int memorieRam, nrCamere, rezCamere, marimeBat, nrPorturi;
    float diagonalaEcran, greutate;
    
    public Laptop()  
    {
        super(null,null,0,0,0);
    }
    
    public Laptop(String marca, String model, String rezEcran, String procesor, String tipEcran, String culoare, String frecventaRam, String sistemDeOperare, String tipPlacaVideo, String modelPlacaVideo, String tipPorturi, String autonomieBat, int anAparitie, int cantitate, int memorieRam, int nrCamere, int rezCamere, int marimeBat, int nrPorturi, float pret, float diagonalaEcran, float greutate) {
        super( marca, model, cantitate, anAparitie, pret);
        this.rezEcran = rezEcran;
        this.procesor = procesor;
        this.tipEcran = tipEcran;
        this.culoare = culoare;
        this.frecventaRam = frecventaRam;
        this.sistemDeOperare = sistemDeOperare;
        this.tipPlacaVideo = tipPlacaVideo;
        this.modelPlacaVideo = modelPlacaVideo;
        this.tipPorturi = tipPorturi;
        this.autonomieBat = autonomieBat;
        
        this.memorieRam = memorieRam;
        this.nrCamere = nrCamere;
        this.rezCamere = rezCamere;
        this.marimeBat = marimeBat;
        this.nrPorturi = nrPorturi;
        
        this.diagonalaEcran = diagonalaEcran;
        this.greutate = greutate;
    }
    
    public Laptop(Laptop l) {
        super( l.marca, l.model, l.cantitate, l.anAparitie, l.pret);
        this.rezEcran = l.rezEcran;
        this.procesor = l.procesor;
        this.tipEcran = l.tipEcran;
        this.culoare = l.culoare;
        this.frecventaRam = l.frecventaRam;
        this.sistemDeOperare = l.sistemDeOperare;
        this.tipPlacaVideo = l.tipPlacaVideo;
        this.modelPlacaVideo = l.modelPlacaVideo;
        this.tipPorturi = l.tipPorturi;
        this.autonomieBat = l.autonomieBat;

        this.memorieRam = l.memorieRam;
        this.nrCamere = l.nrCamere;
        this.rezCamere = l.rezCamere;
        this.marimeBat = l.marimeBat;
        this.nrPorturi = l.nrPorturi;
        
        this.diagonalaEcran = l.diagonalaEcran;
        this.greutate = l.greutate;
    }
    
    // Marca

    // Rezolutie Ecran
    public String getRezEcran() {
        return rezEcran;
    }

    public void setRezEcran(String rezEcran) {
        this.rezEcran = rezEcran;
    }

    // Procesor
    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    // Tip Ecran
    public String getTipEcran() {
        return tipEcran;
    }

    public void setTipEcran(String tipEcran) {
        this.tipEcran = tipEcran;
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

    // Autonomie Baterie
    public String getAutonomieBat() {
        return autonomieBat;
    }

    public void setAutonomieBat(String autonomieBat) {
        this.autonomieBat = autonomieBat;
    }
   
    // Memorie RAM
    public int getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(int memorieRam) {
        this.memorieRam = memorieRam;
    }

    // Numar Camere
    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    // Rezolutie Camere
    public int getRezCamere() {
        return rezCamere;
    }

    public void setRezCamere(int rezCamere) {
        this.rezCamere = rezCamere;
    }

    // Marime Baterie
    public int getMarimeBat() {
        return marimeBat;
    }

    public void setMarimeBat(int marimeBat) {
        this.marimeBat = marimeBat;
    }

    // Numar Porturi
    public int getNrPorturi() {
        return nrPorturi;
    }

    public void setNrPorturi(int nrPorturi) {
        this.nrPorturi = nrPorturi;
    }

    // Diagonala Ecran
    public float getDiagonalaEcran() {
        return diagonalaEcran;
    }

    public void setDiagonalaEcran(float diagonalaEcran) {
        this.diagonalaEcran = diagonalaEcran;
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
        return super.toString() + " cu rezolutia de " + rezEcran + " procesor " + procesor + " tip ecran " + tipEcran + " culoare " + culoare + " frecventaRam " + frecventaRam + " sistemDeOperare " + sistemDeOperare + " tipPlacaVideo " + tipPlacaVideo + " modelPlacaVideo " + modelPlacaVideo + " tipPorturi " + tipPorturi + " autonomieBat " + autonomieBat + " memorieRam " + memorieRam + " nrCamere " + nrCamere + " rezCamere " + rezCamere + " marimeBat " + marimeBat + " nrPorturi " + nrPorturi + " diagonalaEcran " + diagonalaEcran + " greutate " ;
    }
}
