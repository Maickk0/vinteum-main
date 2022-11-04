package com.example;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class Monte {

    List<Carta> monte = new ArrayList<>();

    public  Monte(){
        for(int i = 1; i <=13; i ++){
          Carta carta1 = new Carta(i, Naipe.Clubs);
          Carta carta2 = new Carta(i, Naipe.Spades);
          Carta carta3 = new Carta(i, Naipe.Diamonds);
          Carta carta4 = new Carta(i, Naipe.Hearts);
        
     monte.add(carta1);
         monte.add(carta2);
         monte.add(carta3);
         monte.add(carta4);
        
    }

}

    public void embaralhar() {
        Collections.shuffle(monte);
    }

    public Carta virar() {

       return monte.remove(0);
      

    }

}
