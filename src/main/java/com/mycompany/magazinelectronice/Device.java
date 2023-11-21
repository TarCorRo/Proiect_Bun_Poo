package com.mycompany.magazinelectronice;

public class Device {
    
    String marca, model;
    int cantitate, anAparitie;
    float pret;
    
    public Device(String marca, String model, int cantitate, int anAparitie, float pret)
    {
        this.marca=marca;
        this.model=model;
        this.cantitate=cantitate;
        this.anAparitie=anAparitie;
        this.pret=pret;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public float getPret() {
        return pret;
    }
    
    public void setPret(float pret) {
        this.pret = pret;
    }
}
