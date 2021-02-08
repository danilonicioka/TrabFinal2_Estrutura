package problemas.TrabFinal2_Estrutura;

import java.util.Scanner;

public class Correcao {

    public static void main(String[] args) {

        /*
         Programa para auxiliar um professor na correção de atividades
         sendo que a correção se dará de acordo com a "entrega",
         essa entrega é representada quando uma atividade for enfileirada
         e a correção, quando uma atividade for desenfileirada
         Supôe-se que há um programa auxiliar que registrará as atividades entregues de forma automática,
         mas há como registrar manualmente no programa, mas só poderá incluir na fila e posteriormente corrigir
         */
        Scanner input = new Scanner(System.in);
        Fila<Atividade> entregues = new Fila<>();
        //digamos que 4 alunos já entregaram atividades
        entregues.enfileira(new Atividade("Felipe", "A definir", "A definir"));
        entregues.enfileira(new Atividade("Maria", "A definir", "A definir"));
        entregues.enfileira(new Atividade("Ana", "A definir", "A definir"));
        entregues.enfileira(new Atividade("João", "A definir", "A definir"));

        int op = -1;

        do {
            System.out.print("1 - Corrigir atividade\n"
                    + "2 - Registrar atividade\n"
                    + "3 - Exibir atividades entregues\n"
                    + "0 - Finalizar operação\n"
                    + "Informe qual operação deseja realizar: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nInforme a nota de " + entregues.primeiro().getAluno() + ": ");
                    double nota = input.nextDouble();
                    entregues.primeiro().setNota(String.valueOf(nota));
                    if (nota >= 7) {
                        entregues.primeiro().setEstado("Aprovado");
                    } else {
                        entregues.primeiro().setEstado("Reprovado");
                    }
                    entregues.desenfileira();
                    break;
                case 2:
                    System.out.print("\nInforme o nome do aluno: ");
                    entregues.enfileira(new Atividade(input.next()));
                    break;
                case 3:
                    System.out.println("\n"+entregues+"\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOperação Inválida");
            }
        } while (op != 0);

    }

}
