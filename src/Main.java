import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ABBint abb = new ABBint();
        int opcao;

        do{
            System.out.println("0-Sair");
            System.out.println("1- Para inserir 1 valor na ABB");
            System.out.println("2- Apresenta ABB(em ordem)");
            System.out.println("3- Apresenta quantidade de nos da ABB");
            System.out.println("4- Verifica a extistencia de um valor na ABB");
            System.out.println("5- contar quantidade de comparações");
            System.out.println("6-Remove nó escolhido por seu valor");
            System.out.println("7- valor máximo da árvore");
            opcao = x.nextInt();
            switch (opcao){
                case 0:
                    break;
                case 1:
                    System.out.println("Informe valor a ser inserido");
                    int valor = x.nextInt();
                    abb.root = abb.inserir(abb.root,valor);
                    break;
                case 2:
                    System.out.println("\t Apresenção ABB");
                    abb.show(abb.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Quantidade de nós: "+abb.contaNos(abb.root, 0));
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja consultar:");
                    valor = x.nextInt();
                    if (abb.consulta(abb.root,valor))
                        System.out.println("Valor encontrado na abb");
                    else
                        System.out.println("Valor NÃO encontrado na abb");
                    break;
                case 5:
                    System.out.println("Informe o valor a ser pesquisado: ");
                    valor = x.nextInt();
                    System.out.println("Quantidade de comparacoes para pesquisa: "+abb.contaConsulta(abb.root,valor,0));
                    break;
                case 6:
                    System.out.println("Informe o valor a ser removido");
                    valor = x.nextInt();
                    abb.root = abb.removeValor(abb.root,valor);
                    break;
                case 7:
                    if (abb.root == null)
                        System.out.println("ABB está vazia");
                    else
                        System.out.println("Maior valor é de: "+abb.maximo());
                    break;
                case 8:
                    if (abb.root == null)
                        System.out.println("ABB está vazia");
                    else
                        System.out.println("Menor valor é de: "+abb.minimo());
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        }while(opcao!=0);
    }
}