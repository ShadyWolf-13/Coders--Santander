package POOJava;
import POOJava.Animais.Cachorro;

public class Classes {
    // Classe define padrões para objetos (O que é o objeto?)
    // Objeto pode ter características diferentes, mesmo sendo da mesma classe
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Fantasma";
        cachorro1.cor = "Branca";
        cachorro1.altura = 45;
        cachorro1.peso = 35.6;
        System.out.println(cachorro1);
    }    
}
