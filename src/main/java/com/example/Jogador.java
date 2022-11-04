package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos;
    private List<Carta> ocartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta) {

        ocartas.add(carta);
        pontos += carta.getNumero();

    }

    public void parar() {
       parou = true;
    }

    public boolean parou() {
          return parou;
    }




    public int getPontos() {
        return pontos;
    }

    public List<Carta> getOcartas() {
        return ocartas;
    }

}
