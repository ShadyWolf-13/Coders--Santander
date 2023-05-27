package POOJava.Animais;

public class Cachorro {

    //Sequencia de escrita: Atributos, Construtores, Métodos

//Atributos
// Encapsulamento:
// public : podem ser acessadas de qualquer pacote por qualquer um.
// protected: acesso a mesma classe ou classes filhas (herança)
// private: somente a classe pode acessar    
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

//Construtores
public Cachorro(){}

public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito){
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.estadoDeEspirito = estadoDeEspirito;
    numeroDeCachorros++;
}

//Métodos
    public static int getNumeroDeCachorros(){
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros){
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void latir(){
        System.out.println("AU AU");
    }
    
    public String pegar(){
        return "Bola";
    }

    public String interagir(String acao){
        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; 
        }
        return this.estadoDeEspirito;
    } 
}
