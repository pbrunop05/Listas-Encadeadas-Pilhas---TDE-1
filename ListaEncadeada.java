import java.util.Scanner;

public class ListaEncadeada {
    private Node Lista;
    public ListaEncadeada(){
        this.Lista = null;
    }

    public void inserir (int informacao){

        Node no = new Node();
        no.setInformacao(informacao);
        if(Lista == null){
            Lista=no;
        }
        else{

            Node atual =Lista;
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            System.out.println("Nó atual no endereço" + atual);
        }
    }

    public void imprime(){
        Node atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");
    }

    public int remover() {

        if (Lista == null) {

            System.out.println("A lista está vazia");

        }

        int valor = Lista.getInformacao();
        Lista = Lista.getProximo();
        return valor;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        int validacao;

        for (;;) {

            System.out.println("========================================");
            System.out.println("[1] Inserir");
            System.out.println("[2] Remover");
            System.out.println("[3] Imprimir");
            System.out.println("[4] Sair");
            System.out.print("-> ");

            validacao = scanner.nextInt();

            switch (validacao) {

                case 1 -> {

                    System.out.print("Insira um número: ");
                    int info = scanner.nextInt();

                    lista.inserir(info);

                }

                case 2 -> System.out.printf("Número %d removido.%n", lista.remover());

                case 3 -> lista.imprime();

                case 4 -> {

                    System.out.println("Saindo...");
                    return;

                }

                default -> System.out.println("Escolha uma opção válida");

            }

        }

    }
}