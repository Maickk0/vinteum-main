package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;



    public Carta(int num, Naipe naipe) {
        this.naipe = naipe;
        this.numero = num;
    }


    public String  imagePath() {

        if(numero > 1 && numero < 10){
        return "classic-cards/" +  numero  + this.naipe + ".png";
        }
        
        if( numero == 1){
            return "classic-cards/" + "Ace" + this.naipe + ".png";
            
        }
     
        if( numero == 11){
        return "classic-cards/" + "Jake" + this.naipe + ".png";
                
         }

      if( numero == 12){
         return "classic-cards/" + "Queen" + this.naipe + ".png";
   
          }

          if( numero == 13){
            return "classic-cards/" + "King" + this.naipe + ".png";
          }

          return null;
          
}


    public int getNumero() {
        return numero;
    }


    public Naipe getNaipe() {
        return naipe;
    }


    
    
}
