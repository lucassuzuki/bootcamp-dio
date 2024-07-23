package edu.lucas.anatomia4;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA RECUPERAÇÃO");
        else
             System.out.println("Aprovado!");
    }
}

