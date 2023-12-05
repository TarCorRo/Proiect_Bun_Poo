package com.mycompany.magazinelectronice;

public class Casti extends Device{
    String culoare;
    String contactCuUrechea; 
    String principiuDeFunctionare;
    String tipConectivitate;
    float lungimeCablu;
    float raspunsInFrecventa;
    int autonomie;
    int impedanta;
    int greutate;
    int spl;
    
    //constructor fara parametri
    public Casti(){
        super(null,null,0,0,0);
        this.culoare=null;
        this.contactCuUrechea=null;
        this.principiuDeFunctionare=null;
        this.tipConectivitate=null;
        this.lungimeCablu=0.f;
        this.raspunsInFrecventa=0.f;
        this.autonomie=0;
        this.impedanta=0;
        this.greutate=0;
        this.spl=0;
    
    }
    
    //constructor cu parametri
    public Casti(String marca, String model, String culoare, String contactCuUrechea, String principiuDeFunctionare, String tipConectivitate, float pret, float lungimeCablu, float raspunsInFrecventa, int autonomie, int impedanta, int cantitate, int anAparitie, int greutate, int spl){
        super( marca, model, cantitate, anAparitie, pret);
        this.culoare=culoare;
        this.contactCuUrechea=contactCuUrechea;
        this.principiuDeFunctionare=principiuDeFunctionare;
        this.tipConectivitate=tipConectivitate;
        this.lungimeCablu=lungimeCablu;
        this.raspunsInFrecventa=raspunsInFrecventa;
        this.autonomie=autonomie;
        this.impedanta=impedanta;
        this.greutate=greutate;
        this.spl=spl;
    }
    
    //constructor de copiere
    public Casti(Casti castiOriginale){
       super(castiOriginale.marca, castiOriginale.model, castiOriginale.cantitate, castiOriginale.anAparitie, castiOriginale.pret);
        this.culoare=castiOriginale.culoare;
        this.contactCuUrechea=castiOriginale.contactCuUrechea;
        this.principiuDeFunctionare=castiOriginale.principiuDeFunctionare;
        this.tipConectivitate=castiOriginale.tipConectivitate;
        this.lungimeCablu=castiOriginale.lungimeCablu;
        this.raspunsInFrecventa=castiOriginale.raspunsInFrecventa;
        this.autonomie=castiOriginale.autonomie;
        this.impedanta=castiOriginale.impedanta;
        this.greutate=castiOriginale.greutate;
        this.spl=castiOriginale.spl;
    }
    
    @Override
    public String toString(){
        return super.toString() +
        "\nCuloarea: "+culoare+
        "\nContactul cu urechea: "+contactCuUrechea+
        "\nPrincipiul de functionare: "+principiuDeFunctionare+
        "\nTipul de conectare la device: "+tipConectivitate+
        "\nLungimea cablului: "+ lungimeCablu+
        "\nRaspunsul in frecventa: "+ raspunsInFrecventa+
        "\nAutonomia: "+autonomie+
        "\nImpedanta: "+impedanta+
        "\nGreuatatea "+greutate+
        "\nNumarul de decibeli "+spl;        
         
                
                        
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
     public void setGreutate(int greutate){
        this.greutate=greutate;
    }
    public void setSpl(int spl){
        this.spl=spl;
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
    public int getGreutate (){
        return this.greutate;
    }
     public int getSpl (){
        return this.spl;
    }
          
}
