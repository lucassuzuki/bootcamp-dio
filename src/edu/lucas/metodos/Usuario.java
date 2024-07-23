package edu.lucas.metodos;

public class Usuario {
    
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(22);
        smartTv.diminuirCanal();
    }
}
