package Exercises;

public class Condicionais {
    public static void main(String[] args){
        int nota = 70;
        String graduacao;
// if-else Condicional se/então
        if (nota>=80){
            graduacao = "A";
        } else if (nota<80 && nota>=70){
            graduacao = "B";
        } else if (nota<70 && nota>=50){
            graduacao = "C";
        } else if (nota<50 && nota>=0){
            graduacao = "D";
        } else {
            graduacao = " ";
        }
// SWITCH condicional de casos, é necessário um break, 
// para que ele não continue rodando após entrar num caso        
        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno não aprovado");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }

    }
}

// Se nota maior ou igual 70, aluno aprovado
