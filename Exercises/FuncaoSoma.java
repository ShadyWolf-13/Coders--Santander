package Exercises;

public class FuncaoSoma{
    public static void main(String[] args){
        int resultado = soma(2, 3);
        System.out.println("A soma é igual a "+resultado);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}