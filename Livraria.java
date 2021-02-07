package problemas.TrabFinal2_Estrutura;

import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {

        /*
         Programa que registra o estoque de livros diferentes em uma pequena loja
         Cada pilha será do mesmo livro e terá capacidade "ilimitada" dentro do programa
         Para um novo livro, basta declarar uma nova pilha e aumentar os casos de switch em selecionar pilha
         */
        Scanner input = new Scanner(System.in);

        Pilha<Livro> pilha1 = new Pilha<>();
        Pilha<Livro> pilha2 = new Pilha<>();
        Pilha<Livro> pilha3 = new Pilha<>();

        //cada pilha iniciará com 5 livros
        for (int i = 0; i <= 5; i++) {
            pilha1.empilha(new Livro("Livro1", "Autor1", 1, 2001));
            pilha2.empilha(new Livro("Livro2", "Autor2", 2, 2002));
            pilha3.empilha(new Livro("Livro3", "Autor3", 3, 2003));
        }
        
        int op;
        
        do {
            System.out.print("1 - Adicionar no estoque\n"
                    + "2 - Retirar do estoque\n"
                    + "3 - Exibir estoque\n"
                    + "0 - Finalizar operação\n"
                    + "Informe qual operação deseja realizar: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\n1 - Pilha1: " + pilha1.topo() + "\n"
                            + "2 - Pilha2: " + pilha2.topo() + "\n"
                            + "3 - Pilha3: " + pilha3.topo() + "\n"
                            + "Indique em qual pilha deseja adicionar livros: ");
                    int pilha = input.nextInt();
                    switch (pilha) {
                        case 1:
                            System.out.print("\nInforme a quantidade que deseja adicionar: ");
                            int qnt = input.nextInt();
                            for (int i = 0; i < qnt; i++) {
                                pilha1.empilha(new Livro("Livro1", "Autor1", 1, 2001));
                            }
                            break;
                        case 2:
                            System.out.print("\nInforme a quantidade que deseja adicionar: ");
                            qnt = input.nextInt();
                            for (int i = 0; i < qnt; i++) {
                                pilha2.empilha(new Livro("Livro2", "Autor2", 2, 2002));
                            }
                            break;
                        case 3:
                            System.out.print("\nInforme a quantidade que deseja adicionar: ");
                            qnt = input.nextInt();
                            for (int i = 0; i < qnt; i++) {
                                pilha3.empilha(new Livro("Livro3", "Autor3", 3, 2003));
                            }
                            break;
                        default:
                            System.out.println("Pilha Inválida");
                    }
                    break;
                case 2:
                    System.out.print("\n1 - Pilha1: " + pilha1.topo() + "\n"
                            + "2 - Pilha2: " + pilha2.topo() + "\n"
                            + "3 - Pilha3: " + pilha3.topo() + "\n"
                            + "Indique de qual pilha deseja retirar livros: ");
                    pilha = input.nextInt();
                    switch (pilha) {
                        case 1:
                            System.out.print("\nInforme a quantidade que deseja retirar: ");
                            int qnt = input.nextInt();
                            if (qnt < pilha1.getTamanho()) {
                                for (int i = 0; i < qnt; i++) {
                                    pilha1.desempilha();
                                }
                            } else {
                                System.out.println("\nNão foi possível retirar " + qnt + " livros, pois há " + pilha1.getTamanho() + " livros na pilha");
                            }
                            break;
                        case 2:
                            System.out.print("\nInforme a quantidade que deseja retirar: ");
                            qnt = input.nextInt();
                            if (qnt < pilha2.getTamanho()) {
                                for (int i = 0; i < qnt; i++) {
                                    pilha2.desempilha();
                                }
                            } else {
                                System.out.println("\nNão foi possível retirar " + qnt + " livros, pois há " + pilha2.getTamanho() + " livros na pilha");
                            }
                            break;
                        case 3:
                            System.out.print("\nInforme a quantidade que deseja retirar: ");
                            qnt = input.nextInt();
                            if (qnt < pilha3.getTamanho()) {
                                for (int i = 0; i < qnt; i++) {
                                    pilha3.desempilha();
                                }
                            } else {
                                System.out.println("\nNão foi possível retirar " + qnt + " livros, pois há " + pilha2.getTamanho() + " livros na pilha");
                            }
                            break;
                        default:
                            System.out.println("nPilha Inválida");
                    }
                    break;
                case 3:
                    System.out.println("\n"+pilha1.getTamanho()+" livros na Pilha1: "+ pilha1.topo()+"\n"
                            + pilha2.getTamanho()+" livros na Pilha2: "+ pilha2.topo()+"\n"
                            + pilha3.getTamanho()+" livros na Pilha3: "+ pilha3.topo()+"");
                case 0:
                    break;
                default:
                    System.out.println("\nOperação Inválida");
            }
        } while (op != 0);
    }
}
