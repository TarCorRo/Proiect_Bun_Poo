package com.mycompany.magazinelectronice;

public class Desktop {
    String marca, model, procesor, culoare, frecventaRam, sistemDeOperare, tipPlacaVideo, modelPlacaVideo, tipPorturi;
    int anAparitie, cantitate, memorieRam, nrPorturi;
    float greutate, pret;
    
    public Desktop() {
    }
    
    public Desktop(String marca, String model, String procesor, String culoare, String frecventaRam, String sistemDeOperare, String tipPlacaVideo, String modelPlacaVideo, String tipPorturi, int anAparitie, int cantitate, int memorieRam, int nrPorturi,  float pret, float greutate) {
        this.marca = marca;
        this.model = model;
        this.procesor = procesor;
        this.culoare = culoare;
        this.frecventaRam = frecventaRam;
        this.sistemDeOperare = sistemDeOperare;
        this.tipPlacaVideo = tipPlacaVideo;
        this.modelPlacaVideo = modelPlacaVideo;
        this.tipPorturi = tipPorturi;
        this.pret = pret;
        this.anAparitie = anAparitie;
        this.cantitate = cantitate;
        this.memorieRam = memorieRam;
        this.nrPorturi = nrPorturi;
        this.greutate = greutate;
    }
    
    public Desktop(Desktop l) {
        this.marca = l.marca;
        this.model = l.model;
        this.procesor = l.procesor;
        this.culoare = l.culoare;
        this.frecventaRam = l.frecventaRam;
        this.sistemDeOperare = l.sistemDeOperare;
        this.tipPlacaVideo = l.tipPlacaVideo;
        this.modelPlacaVideo = l.modelPlacaVideo;
        this.tipPorturi = l.tipPorturi;
        
        this.anAparitie = l.anAparitie;
        this.cantitate = l.cantitate;
        this.memorieRam = l.memorieRam;
        this.nrPorturi = l.nrPorturi;
        
        this.pret = l.pret;
        this.greutate = l.greutate;
    }
    
    // Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    // Pret
    public float getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    // An Aparitie
    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    // Cantitate
    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
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
        return "Desktop " + marca + " " + model + " procesor " + procesor + " culoare " + culoare + " frecventaRam " + frecventaRam + " sistemDeOperare " + sistemDeOperare + " tipPlacaVideo " + tipPlacaVideo + " modelPlacaVideo " + modelPlacaVideo + " tipPorturi " + tipPorturi + " anAparitie " + anAparitie + " cantitate " + cantitate + " memorieRam " + memorieRam + " nrPorturi " + nrPorturi + " greutate " + " pret " + pret;
    }
}
