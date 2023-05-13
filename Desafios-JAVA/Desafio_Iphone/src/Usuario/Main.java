package Usuario;

import java.util.Scanner;
import iphone.iphone;

public class Main {
    public static void main(String[] args) {
        iphone iphone = new iphone();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao iPhone!");
        
        int opcao;
        do {
            exibirMenu();
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    iphone.tocarMusica();
                    break;
                case 2:
                    iphone.pausarMusica();
                    break;
                case 3:
                    iphone.selecionarMusica();
                    break;
                case 4:
                    iphone.ligar();
                    break;
                case 5:
                    iphone.atenderChamada();
                    break;
                case 6:
                    iphone.iniciarCorreioVoz();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Tocar música");
        System.out.println("2. Pausar música");
        System.out.println("3. Selecionar música");
        System.out.println("4. Ligar");
        System.out.println("5. Atender chamada");
        System.out.println("6. Iniciar correio de voz");
        System.out.println("7. Exibir página");
        System.out.println("8. Adicionar nova aba");
        System.out.println("9. Atualizar página");
        System.out.println("0. Sair");
    }
}
