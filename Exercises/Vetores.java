package Exercises;

public class Vetores {
    public static void main(String[] args){
        // Vetores ou Arrays
        // Possuem só um tipo (string, array, float, int...)
        // Ao declarar tam. do array, limita-se as posições
        int[] numeros = new int[5];
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        //ou
        
        int[] num = { 9, 10, 12, 25, 2 };
        int maior = num[0];
        int menor = num[0];
        int media = 0;
        for (int i=0; i<num.length; i++){
            if(num[i] > maior){
                maior = num[i];
            } else if (num[i] < menor) {
                menor = num[i];
            }
            media+=num[i];
        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media/num.length);
    }    
}
