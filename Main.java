import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barbearia barbearia = new Barbearia();

        while (true) {
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Remover Cliente");
            System.out.println("3. Mostrar Filas de Espera");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente);

                    System.out.println("Escolha o Barbeiro:");
                    System.out.println("1. Willian Chaves (Barbeiro Will)");
                    System.out.println("2. Elias Torres (Seu Elias)");
                    System.out.println("3. Felipe Costa (Barba de Respeito");
                    int escolhaBarbeiro = scanner.nextInt();
                    scanner.nextLine(); 
                    Barbeiro barbeiroEscolhido = barbearia.getBarbeiro(escolhaBarbeiro - 1);
                    if (barbeiroEscolhido != null) {
                        barbeiroEscolhido.adicionarCliente(cliente);
                        System.out.println("Cliente adicionado à fila de " + barbeiroEscolhido.getNome());
                    } else {
                        System.out.println("Barbeiro inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Escolha o Barbeiro:");
                    System.out.println("1. Willian Chaves (Barbeiro Will)");
                    System.out.println("2. Elias Torres (Seu Elias)");
                    System.out.println("3. Felipe Costa (Barba de Respeito)");
                    escolhaBarbeiro = scanner.nextInt();
                    scanner.nextLine();
                    barbeiroEscolhido = barbearia.getBarbeiro(escolhaBarbeiro - 1);
                    if (barbeiroEscolhido != null) {
                        Cliente removido = barbeiroEscolhido.removerCliente();
                        if (removido != null) {
                            System.out.println("Cliente removido: " + removido);
                        } else {
                            System.out.println("A fila está vazia.");
                        }
                    } else {
                        System.out.println("Barbeiro inválido!");
                    }
                    break;

                case 3:
                    barbearia.mostrarFilas();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
