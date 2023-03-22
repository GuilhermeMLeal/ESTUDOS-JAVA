package edu.guilherme.primeirasemana.segundasemana;

public class SmartTv {
   boolean ligada = false;
   int canal=1;
   int volume=25;
    

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void aumentarVolume(){
        volume++;
    }

   public void ligar(){
        ligada=true;
   }
   public void desliga(){
        ligada=false;
   }
   public void diminuirVolume(){
        volume--;
   }
}
