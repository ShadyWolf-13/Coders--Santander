package Exercises;

public class Funções {
    public static void main(String[] args){
        String nome = "Victor";
        saudacao(nome);
    }

    // Nomes de variáveis devem ser iguais dentro do mesmo escopo
    
    public static void saudacao(String n){
        System.out.println("Hello, "+n);
    }
}
