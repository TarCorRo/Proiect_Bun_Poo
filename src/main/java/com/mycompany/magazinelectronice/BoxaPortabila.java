package com.mycompany.magazinelectronice;

public class BoxaPortabila {
    
   String marca;
   String model;
   String culoare;
   String tipConectivitate;
   String tipBaterie;
   float pret;
   float variantaBluetooth;
   float raspunsInFrecventa;
   int cantitate;
   int anAparitie;
   int impedantaNominala;
   int spl;
   int capacitateBaterie;
   int latime;
   int lungime;
   int adancime;
    
   public BoxaPortabila(){
     this.marca="Null";
     this.model="Null";
     this.culoare="Null";
     this.tipConectivitate="Null";
     this.tipBaterie="Null";// tip string 
     this.pret=0.f;
     this.variantaBluetooth=0.f;
     this.raspunsInFrecventa=0.f;// float
     this.cantitate=0;
     this.anAparitie=0;
     this.impedantaNominala=0;
     this.spl=0;
     this.capacitateBaterie=0;
     this.latime=0;
     this.lungime=0;
     this.adancime=0;
   
   }
   public BoxaPortabila(String marca, String model, String culoare, String tipConectivitate, String tipBaterie, float pret, float variantaBluetooth, float raspunsInFrecventa, int cantitate, int anAparitie, int impedantaNominala, int spl, int capacitateBaterie, int latime, int lungime, int adancime){
     this.marca=marca;
     this.model=model;
     this.culoare=culoare;
     this.tipConectivitate=tipConectivitate;
     this.tipBaterie=tipBaterie;// tip string 
     this.pret=pret;
     this.variantaBluetooth=variantaBluetooth;
     this.raspunsInFrecventa=raspunsInFrecventa;// float
     this.cantitate=cantitate;
     this.anAparitie=anAparitie;
     this.impedantaNominala=impedantaNominala;
     this.spl=spl;
     this.capacitateBaterie=capacitateBaterie;
     this.latime=latime;
     this.lungime=lungime;
     this.adancime=adancime;
   }
   public BoxaPortabila(BoxaPortabila boxaoriginala){
     this.marca=boxaoriginala.marca;
     this.model=boxaoriginala.model;
     this.culoare=boxaoriginala.culoare;
     this.tipConectivitate=boxaoriginala.tipConectivitate;
     this.tipBaterie=boxaoriginala.tipBaterie;// tip string 
     this.pret=boxaoriginala.pret;
     this.variantaBluetooth=boxaoriginala.variantaBluetooth;
     this.raspunsInFrecventa=boxaoriginala.raspunsInFrecventa;// float
     this.cantitate=boxaoriginala.cantitate;
     this.anAparitie=boxaoriginala.anAparitie;
     this.impedantaNominala=boxaoriginala.impedantaNominala;
     this.spl=boxaoriginala.spl;
     this.capacitateBaterie=boxaoriginala.capacitateBaterie;
     this.latime=boxaoriginala.latime;
     this.lungime=boxaoriginala.lungime;
     this.adancime=boxaoriginala.adancime;
   }
   
    @Override
    public String toString(){
        return" Numele boxei: "+marca+" "+model+
        "\nMarca boxei de casti: " + marca +
        "\nModelul: "+model+
        "\nCuloarea: "+culoare+
        "\nTipul de conectivitate "+tipConectivitate+
        "\nTipul bateriei: "+tipBaterie+
        "\nPretul: "+pret+
        "\nVarianta de Bluetooth "+ variantaBluetooth+
        "\nRaspunsul in frecventa: "+ raspunsInFrecventa+
        "\nCantitatea "+cantitate+
        "\nAnul aparitiei "+anAparitie+
        "\nImpedanta nominala "+impedantaNominala+
        "\nNumarul de decibeli "+spl+
        "\nCapacitatea bateriei "+capacitateBaterie+
        "\nLatime "+latime+        
        "\nLungime "+lungime+ 
        "\nAdancime "+adancime;}
   
   
   public void setMarca(String marca){
        this.marca=marca;
   }
    public void setModel(String model){
        this.model=model;
   }
    public void setCuloare(String culoare){
        this.culoare=culoare;
   }
    public void setTipConectivitate(String tipConectivitate){
        this.tipConectivitate=tipConectivitate;
   } 
    public void setTipBaterie(String tipBaterie){
        this.tipBaterie=tipBaterie;
   }
    public void setPret(float pret){
        this.pret=pret;
   }
    public void setVariantaBluetooth(float variantaBluetooth){
        this.variantaBluetooth=variantaBluetooth;
   }
    public void setRaspunsInFrecventa(float raspunsInFrecventa){
        this.raspunsInFrecventa=raspunsInFrecventa;
   }
     public void setCantitate(int cantitate){
        this.cantitate=cantitate;
   }
   
    public void setAnAparitie(int anAparitie){
        this.anAparitie=anAparitie;
   }
    
   public void setImpedantaNominala(int impedantaNominala){
        this.impedantaNominala=impedantaNominala;
   }
   
    public void setSpl(int spl){
        this.spl=spl;
   }
    public void setCapacitateBaterie(int capacitateBaterie){
        this.capacitateBaterie=capacitateBaterie;
   }
     public void setLatime(int latime){
        this.latime=latime;
   }
      public void setLungime(int lungime){
        this.lungime=lungime;
   }
       public void setAdancime(int adancime){
        this.adancime=adancime;
   }
       
    public String getMarca(){
     return this.marca;
    }  
    public String getModel(){
     return this.model;
    }  
    public String getCuloare(){
     return this.culoare;
    }  
    public String getTipConectivitate(){
     return this.tipConectivitate;
    }  
    public String getTipBaterie(){
     return this.tipBaterie;
    }  
    public float getPret(){
     return this.pret;
    }  
    public float getVariantaBluetooth(){
     return this.variantaBluetooth;
    }
    public float getRaspunsInFrecventa(){
     return this.raspunsInFrecventa;
    }  
    public int getCantitate(){
     return this.cantitate;
    } 
    public int getAnAparitie(){
     return this.anAparitie;
    }
    public int getImpedantaNominala(){
     return this.impedantaNominala;
    }
    public int getSpl(){
     return this.spl;
    }
    public int getCapacitateBaterie(){
     return this.capacitateBaterie;
    }
    public int gatLungime(){
     return this.lungime;
    }
    public int getLatime(){
     return this.latime;
    }
    public int getAdancime(){
     return this.adancime;
    }
    
}
