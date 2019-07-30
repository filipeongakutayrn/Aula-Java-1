package br.senac.rn.helloworld;

public class EstruturaIf {
    public static void main(String[] args) {
        Double media = 7.5;
        if (media >= 7){
            System.out.println("APROVADO");
        }else if(media <3){
            System.out.println("REPROVADO");
        }else {
            System.out.println("RECUPERAÇÃO");
        }
    }
}
