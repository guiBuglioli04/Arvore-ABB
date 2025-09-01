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
                default:
                    System.out.println("Opcão inválida");
            }
        }while(opcao!=0);
    }
}