package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();

    }

    public Carta distribuirCartaParaJogador(Jogador jogador1) {
        if (jogador1.parou()) {
            return null;
        }
        Carta carta = (monte.virar());

        jogador1.receberCarta(carta);
        return carta;

    }

    public boolean acabou() {
        return (jogador.parou() && computador.parou() || jogador.getPontos() > 21 || computador.getPontos() > 21);

    }

    public String resultado() {
            if(jogador.getPontos()>21 || computador.getPontos()==21 ){
                System.out.println("Perdeu");

            }else{
                    System.out.println("Ganhou");
                }if(jogador.getPontos() == computador.getPontos())
                System.out.println("Empate");
                
            return resultado();

        }
            
    

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }

}
