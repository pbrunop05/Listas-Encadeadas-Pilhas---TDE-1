package Pilha;

import java.util.Scanner;

public class ListaEncadeadaPilha {

    private Node Lista;

    public ListaEncadeadaPilha() {
        this.Lista = null;
    }

    public void inserir_pilha(int informacao) {

        Node no = new Node();
        no.setInformacao(informacao);
        no.setProximo(Lista);
        Lista = no;

    }

    public void imprime() {
        Node atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("Null");
    }

    public int remove_pilha() {

        if (Lista == null) {
            System.out.println("A pilha está vazia.");
        }
        int valor = Lista.getInformacao();
        Lista = Lista.getProximo();
        return valor;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaEncadeadaPilha lista = new ListaEncadeadaPilha();

        int verificacao;

        for (;;) {

            System.out.println("========================================");
            System.out.println("[1] Inserir");
            System.out.println("[2] Remover");
            System.out.println("[3] Imprimir");
            System.out.println("[4] Sair");
            System.out.print("-> ");
            verificacao = scanner.nextInt();

            switch (verificacao) {

                case 1 -> {

                    System.out.print("Insira o novo valor: ");
                    int informacao = scanner.nextInt();
                    lista.inserir_pilha(informacao);

                }

                case 2 -> System.out.printf("Elemento removido (%d)%n.", lista.remove_pilha());

                case 3 -> lista.imprime();

                case 4 -> {

                    System.out.println("Saindo...");
                    return;

                }

                default -> System.out.println("Por favor escolha uma opção válida.");

            }

        }

    }

}