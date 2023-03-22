package edu.guilherme.primeirasemana.segundasemana;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv=new SmartTv();
        System.out.println("Tv está ligada? "+ smartTv.ligada);
        System.out.println("Canal atual :" +smartTv.canal);
        System.out.println("Volume atual :"+smartTv.volume);

        smartTv.mudarCanal(13);

        smartTv.ligar();
        System.out.println("Novo status -> Tv está ligada? "+ smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual : "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual : "+ smartTv.volume);
    }
        
}
