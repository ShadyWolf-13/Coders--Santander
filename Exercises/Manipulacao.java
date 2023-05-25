package Exercises;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulacao {
   public static void main(String[] args){
    // Olá {nome}! Hoje é {data}, Bom dia!
    String nome = "Victor";
    // Todos caracteres para maiuscula
    System.out.println(nome.toUpperCase());
    // Todos caracteres para minuscula
    System.out.println(nome.toLowerCase());
    // Tamanho do texto
    System.out.println(nome.length());
    // Comparando textos
    String nome2 = "victor";
    System.out.println(nome.equals(nome2));
    System.out.println(nome.equalsIgnoreCase(nome2));
    // ISO 8601 Norma padrão para datas
    LocalDate hoje = LocalDate.now();
    Locale Brazil = new Locale("pt", "BR");
    System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brazil));
   } 
}
