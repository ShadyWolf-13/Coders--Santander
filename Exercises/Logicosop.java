package Exercises;

public class Logicosop {
    public static void main(String[] args){
        boolean fimDeSemana = true;
        boolean dinheiro = true;
        boolean vamosBeber = fimDeSemana&&dinheiro;
        System.out.println(vamosBeber);
        String msg = fimDeSemana ? "Bora beber":"Deixa pra próxima";
        System.out.println(msg);
    }
}
//                      Tabela verdade
// Operador && (AND)                Operador || (OR)
//true && true  = true              true  || true   = true               
//true && fals  = false             true  || false  = true
//false && true = false             false || true   = true
//false && fals = false             false || false  = false

//                      Operador ternário
//  Condição    ?   SeVerdade   :   Sefalso;
// Verifica uma condição e retorna um valor para a condição verdadeira e outro para falsa.