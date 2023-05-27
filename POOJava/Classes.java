package POOJava;
import POOJava.Animais.Cachorro;

public class Classes {
    // Classe define padrões para objetos (O que é o objeto?)
    // Objeto pode ter características diferentes, mesmo sendo da mesma classe
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();


        Cachorro cachorro2 = new Cachorro("Luna", "Preta", 35, 25, "carinho");

        System.out.println(cachorro2.getNumeroDeCachorros());

        // Não é possível ter acesso a variáveis privadas
        //cachorro1.nome = "Fantasma";
        //cachorro1.cor = "Branca";
        //cachorro1.altura = 45;
        //cachorro1.peso = 35.6;
        cachorro1.setNome("Fantasma");
        cachorro1.setAltura(45);
        cachorro1.setCor("Branco");
        cachorro1.setPeso(36.5);

        Cachorro cachorro3 = new Cachorro("Jack", "Branca", 35, 25, "");
        
        System.out.println(cachorro3.getNumeroDeCachorros());

        System.out.println(cachorro1);
        
        //cachorro1.latir();
        
        //System.out.println("O cachorro pegou uma "+cachorro1.pegar());

        System.out.println("O cachorro está "+cachorro1.interagir("carinho"));
        System.out.println("O cachorro está "+cachorro1.interagir("nada"));
        System.out.println("O cachorro está "+cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está "+cachorro1.interagir("pisar na patinha"));

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }   
}
