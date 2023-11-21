package com.mycompany.magazinelectronice;

public class Casti {
    String marca;
    String model;
    String culoare;
    String contactCuUrechea; 
    String principiuDeFunctionare;
    String tipConectivitate;
    float pret;
    float lungimeCablu;
    float raspunsInFrecventa;
    int autonomie;
    int impedanta;
    int cantitate;
    int anAparitie;
    int greutate;
    int spl;
    
    //constructor fara parametri
    public Casti(){
        this.marca="Null";
        this.model="Null";
        this.culoare="Null";
        this.contactCuUrechea="Null";
        this.principiuDeFunctionare="Null";
        this.tipConectivitate="Null";
        this.pret=0.f;
        this.lungimeCablu=0.f;
        this.raspunsInFrecventa=0.f;
        this.autonomie=0;
        this.impedanta=0;
        this.cantitate=0;
        this.anAparitie=0;
        this.greutate=0;
        this.spl=0;
    
    }
    
    //constructor cu parametri
    public Casti(String marca, String model, String culoare, String contactCuUrechea, String principiuDeFunctionare, String tipConectivitate, float pret, float lungimeCablu, float raspunsInFrecventa, int autonomie, int impedanta, int cantitate, int anAparitie, int greutate, int spl){
        this.marca=marca;
        this.model=model;
        this.culoare=culoare;
        this.contactCuUrechea=contactCuUrechea;
        this.principiuDeFunctionare=principiuDeFunctionare;
        this.tipConectivitate=tipConectivitate;
        this.pret=pret;
        this.lungimeCablu=lungimeCablu;
        this.raspunsInFrecventa=raspunsInFrecventa;
        this.autonomie=autonomie;
        this.impedanta=impedanta;
        this.cantitate=cantitate;
        this.anAparitie=anAparitie;
        this.greutate=greutate;
        this.spl=spl;
    }
    
    //constructor de copiere
    public Casti(Casti castiOriginale){
        
        this.marca=castiOriginale.marca;
        this.model=castiOriginale.model;
        this.culoare=castiOriginale.culoare;
        this.contactCuUrechea=castiOriginale.contactCuUrechea;
        this.principiuDeFunctionare=castiOriginale.principiuDeFunctionare;
        this.tipConectivitate=castiOriginale.tipConectivitate;
        this.pret=castiOriginale.pret;
        this.lungimeCablu=castiOriginale.lungimeCablu;
        this.raspunsInFrecventa=castiOriginale.raspunsInFrecventa;
        this.autonomie=castiOriginale.autonomie;
        this.impedanta=castiOriginale.impedanta;
        this.cantitate=castiOriginale.cantitate;
        this.anAparitie=castiOriginale.anAparitie;
        this.greutate=castiOriginale.greutate;
        this.spl=castiOriginale.spl;
    }
    
    @Override
    public String toString(){
        return" Nume casti: "+marca+" "+model+
        "\nMarca perechii de casti: " + marca +
        "\nModelul: "+model+
        "\nCuloarea: "+culoare+
        "\nContactul cu urechea: "+contactCuUrechea+
        "\nPrincipiul de functionare: "+principiuDeFunctionare+
        "\nTipul de conectare la device: "+tipConectivitate+
        "\nPretul: "+pret+
        "\nLungimea cablului: "+ lungimeCablu+
        "\nRaspunsul in frecventa: "+ raspunsInFrecventa+
        "\nAutonomia: "+autonomie+
        "\nImpedanta: "+impedanta+
        "\nCantitatea "+cantitate+
        "\nAnul aparitiei "+anAparitie+
        "\nGreuatatea "+greutate+
        "\nNumarul de decibeli "+spl;        
         
                
                        
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    public void setContactCuUrechea(String contactCuUrechea){
        this.contactCuUrechea=contactCuUrechea;
    }
    
     public void setPrincipiuDeFunctionare( String principiuDeFunctionare){
         this.principiuDeFunctionare=principiuDeFunctionare;
     }
      public void setTipConectivitate(String tipConectivitate){
        this.tipConectivitate=tipConectivitate;
    }
       public void setPret(float pret){
        this.pret=pret;
    }
        public void setLungimeCablu(float lungimeCablu){
        this.lungimeCablu=lungimeCablu;
    }
        public void setRaspunsInFrecventa(float raspunsInFrecventa){
        this.raspunsInFrecventa=raspunsInFrecventa;
    }
         public void setAutonomie(int autonomie){
        this.autonomie=autonomie;
    }
           public void setImpedanta(int impedanta){
        this.impedanta=impedanta;
    }
      public void setCantitate(int cantitate){
        this.cantitate=cantitate;
      }
    public void setAnAparitie(int anAparitie){
        this.anAparitie=anAparitie;
    }
     public void setGreutate(int greutate){
        this.greutate=greutate;
    }
    public void setSpl(int spl){
        this.spl=spl;
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
    public String getContactCuUrechea(){
        return this.contactCuUrechea;
    }
    public String getPrincipiuDeFunctionare(){
        return this.principiuDeFunctionare;
    }
    public String getTipConectivitate(){
        return this.tipConectivitate;
    }
    public float getPret(){
        return this.pret;
    }
   public float getLungimeCablu(){
        return this.lungimeCablu;
    }
   public float getRaspunsInFrecventa(){
        return this.raspunsInFrecventa;
    }
   public int getAutonomie (){
        return this.autonomie;
    }
    public int getImpedanta (){
        return this.impedanta;
    }
     public int getCantitate (){
        return this.cantitate;
    }
    public int getAnAparitie (){
        return this.anAparitie;
    }
    public int getGreutate (){
        return this.greutate;
    }
     public int getSpl (){
        return this.spl;
    }
          
}
