package com.mycompany.magazinelectronice;

// @author gm387

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class FitnessBand extends Device {
  
    public String Procesor, TipEcran, Culoare, SistemDeOperareSmtWtc, Capabilities, TipIncarcare, TipSim, Senzori, MatCurea, MatCarcasa;
    public float DiagonalaEcran, DimCarcasa;
    public int RezEcran, MemorieROM, MemorieRAM, MarimeBat;
    
    //constructor fara parametri
    public FitnessBand(){
        super("NULL","NULL",0,0,0);
        this.Procesor = "";
        this.TipEcran = "";
        this.Culoare = "";
        this.SistemDeOperareSmtWtc = "";
        this.Capabilities = "";
        this.TipIncarcare = "";
        this.TipSim = "";
        this.Senzori = ""; // Un array gol
        this.MatCurea = "";
        this.MatCarcasa = "";
        this.DiagonalaEcran = 0.0f;
        this.DimCarcasa = 0.0f;
        this.RezEcran = 0;
        this.MemorieROM = 0;
        this.MemorieRAM = 0;
        this.MarimeBat = 0;
    }
   
    //Constructor cu parametri
    public FitnessBand(String Marca, String Model, String Procesor, String TipEcran, String Culoare, String SistemDeOperareSmtWtc, String Capabilities, 
            String TipIncarcare, String TipSim, String Senzori, String MatCurea, String MatCarcasa,
            float Pret, float DiagonalaEcran, float DimCarcasa, int Cantitate, int RezEcran, int MemorieROM,
            int MemorieRAM, int AnAparitie, int MarimeBat ){
        super( Marca, Model, Cantitate, AnAparitie, Pret);
        this.Procesor=Procesor;
        this.TipEcran=TipEcran;
        this.TipIncarcare=TipIncarcare;
        this.Culoare=Culoare;
        this.SistemDeOperareSmtWtc=SistemDeOperareSmtWtc;
        this.Capabilities = Capabilities;
        this.TipSim= TipSim;
        this.Senzori= Senzori;
        this.MatCarcasa= MatCarcasa;
        this.MatCurea=MatCurea;
        this.DiagonalaEcran=DiagonalaEcran;
        this.DimCarcasa=DimCarcasa;
        this.RezEcran=RezEcran;
        this.MemorieRAM=MemorieRAM;
        this.MemorieROM=MemorieROM;
        this.MarimeBat=MarimeBat;
    };
  
    //Constructor de copiere
    public FitnessBand(FitnessBand other){
        super(other.marca,other.model,other.cantitate,other.anAparitie,other.pret);
        this.Procesor = other.Procesor;
        this.TipEcran = other.TipEcran;
        this.Culoare = other.Culoare;
        this.SistemDeOperareSmtWtc = other.SistemDeOperareSmtWtc;
        this.Capabilities = other.Capabilities;
        this.TipIncarcare = other.TipIncarcare;
        this.TipSim = other.TipSim;
        this.Senzori = other.Senzori;
        this.MatCurea = other.MatCurea;
        this.MatCarcasa = other.MatCarcasa;
        this.DiagonalaEcran = other.DiagonalaEcran;
        this.DimCarcasa = other.DimCarcasa;
        this.RezEcran = other.RezEcran;
        this.MemorieROM = other.MemorieROM;
        this.MemorieRAM = other.MemorieRAM;
        this.MarimeBat = other.MarimeBat;
    }
    //Functii get si set
    public String getProcesor(){
        return Procesor;
    }
    public void setProcesor(String procesor){
      //procesor = SmtWtc.nextLine();
      this.Procesor = procesor;
    }
    public String getTipEcran(){
        return TipEcran;
    }
    public void setTipEcran(String tipecran){
      //tipecran = SmtWtc.nextLine();
      this.TipEcran = tipecran;
    }
     public String getCuloare(){
        return Culoare;
    }
    public void setCuloare(String culoare){
      //culoare = SmtWtc.nextLine();
      this.Culoare = culoare;
    }
     public String getSistemDeOperareSmtWtc(){
        return SistemDeOperareSmtWtc;
    }
    public void setSistemDeOperareSmtWtc(String sistemDeOpSmtWtc){
      //sistemDeOpSmtWtc = SmtWtc.nextLine();
      this.SistemDeOperareSmtWtc = sistemDeOpSmtWtc;
    }
    public String getCapabilities(){
        return Capabilities;
    }
    public void setCapabilities(String capabilities){
        this.Capabilities = capabilities;
    }
    public String getTipIncarcare(){
        return TipIncarcare;
    }
    public void setTipIncarcare(String tipincarcare){
        //tipincarcare=SmtWtc.nextLine();
        this.TipIncarcare=tipincarcare;
    }
    public String getTipSim(){
        return TipSim;
    }
    public void setTipSim(String tipsim){
        //tipsim=SmtWtc.nextLine();
        this.TipSim=tipsim;
    }
    public String getSenzori(){
        return Senzori;
    }
    public void setSenzori(String senzori){
        //senzori = SmtWtc.nextLine();
        this.Senzori=senzori;
    }
    public String getMatCurea(){
        return MatCurea;
    }
    public void setMatCurea(String curea){
        //curea=SmtWtc.nextLine();
        this.MatCurea=curea;
    }
    public String getMatCarcasa(){
        return MatCarcasa;
    }
    public void setMatCarcasa(String carcasa){
        //carcasa=SmtWtc.nextLine();
        this.MatCarcasa=carcasa;
    }
    public float getDiagonalaEcran(){
        return DiagonalaEcran;
    }
    public void setDiagonalaEcran(float diagonala){
        this.DiagonalaEcran=diagonala;
    }
    public float getDimCarcasa(){
        return DimCarcasa;
    }
    public void setDimCarcasa(float carcasa){
        this.DimCarcasa=carcasa;
    }
    public int getRezEcran(){
        return RezEcran;
    }
    public void setRezEcran(int rezolutie){
        this.RezEcran=rezolutie;
    }
    public int getMemorieROM(){
        return MemorieROM;
    }
    public void setMemorieROM(int rom){
        this.MemorieROM=rom;
    }
    public int getMemorieRAM(){
        return MemorieRAM;
    }
    public void setMemorieRAM(int ram){
        this.MemorieRAM=ram;
    }
    public int getMarimeBat(){
        return MarimeBat;
    }
    public void setMarimeBat(int baterie){
        this.MarimeBat=baterie;
    }
    /*public void Citire(){
    String numeFisier = "Fitness.txt";
    try {
            BufferedReader reader = new BufferedReader(new FileReader(numeFisier));
            String linie;

            while ((linie = reader.readLine()) != null) {
                //prelucrare fiecare linie a fișierului
                //System.out.println(linie);
                setMarca(linie); System.out.println();
                setModel(linie);
                System.out.println("Marca si modelul: "+getMarca()+getModel());
            }

            reader.close(); // Închide fișierul după ce a terminat de citit
        }catch (IOException e){
            e.printStackTrace(); 
        } 
    
    }*/
    public String toString(){
        return "Marca: " + marca +
            "\nModel: " + model +
            "\nProcesor: " + Procesor +
            "\nTipEcran: " + TipEcran +
            "\nCuloare: " + Culoare +
            "\nSistem de Operare: " + SistemDeOperareSmtWtc +
            "\nCapabilities: " + Capabilities +
            "\nTip Incarcare: " + TipIncarcare +
            "\nTip Sim: " + TipSim +
            "\nSenzori: " + Senzori +
            "\nMaterial Curea: " + MatCurea +
            "\nMaterial Carcasa: " + MatCarcasa +
            "\nPret: " + pret +
            "\nDiagonala Ecran: " + DiagonalaEcran +
            "\nDimensiune Carcasa: " + DimCarcasa +
            "\nProduse Disponibile: " + cantitate +
            "\nRezolutie Ecran: " + RezEcran +
            "\nMemorie ROM: " + MemorieROM +
            "\nMemorie RAM: " + MemorieRAM +
            "\nAnul Aparitie: " + anAparitie +
            "\nCapacitate Baterie: " + MarimeBat;
    }
}