//dupla: Isabela Pereira Goulart e Mariana Helena Cunha Bochi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int promocao; // armazena a escolha da promoção
        int compras = 0; // rastreia o número de compras feitas
        String nome_cliente; // armazena nome do cliente
        long cpf_cliente; // armazena CPF do cliente
        // armazenam instâncias de memoria usb com diferentes capacidades
        MemoriaUSB usb32;
        MemoriaUSB usb16;
        MemoriaUSB usb1;

        //entrada dos dados do cliente
        System.out.println("****Seja bem vindo a loja PC Mania****");

        //nome
        System.out.println("Me informe seu nome, por gentileza: ");
        Scanner scanner1 = new Scanner(System.in);
        nome_cliente = scanner1.nextLine();
        //cpf
        System.out.println(nome_cliente + ", agora precisamos do seu CPF!");
        Scanner scanner2 = new Scanner(System.in);
        cpf_cliente = scanner2.nextLong();

        Cliente cliente = new Cliente(nome_cliente, cpf_cliente);

        //opções em promoção
        System.out.println();
        System.out.println("Qual promoção você deseja escolher?");
        System.out.println();
        System.out.println("PROMOÇÃO 1");
        Computador pc1 = new Computador(1);
        pc1.mostraPCConfigs();

        System.out.println("PROMOÇÃO 2");
        Computador pc2 = new Computador(2);
        pc2.mostraPCConfigs();

        System.out.println("PROMOÇÃO 3");
        Computador pc3 = new Computador(3);
        pc3.mostraPCConfigs();

        System.out.println("Caso deseje sair do programa, digite 0");

        // leitura da escolha da promoção
        Scanner scanner3 = new Scanner(System.in);
        promocao = scanner3.nextInt();

        // uso do while para permitir que o cliente realize mais compras, caso queira
        while(promocao != 0 && compras <= 3){
            if(promocao == 1){
                pc1.cliente = cliente;
                cliente.total += pc1.preco;
                System.out.println("PC escolhido!");
                System.out.println("Valor total da compra: " + cliente.calculaTotalCompra());
            }
            else if (promocao == 2) {
                pc2.cliente = cliente;
                cliente.total += pc2.preco;
                System.out.println("PC escolhido!");
                System.out.println("Valor total da compra: " + cliente.calculaTotalCompra());
            }
            else if (promocao == 3) {
                pc3.cliente = cliente;
                cliente.total += pc3.preco;
                System.out.println("PC escolhido!");
                System.out.println("Valor total da compra: " + cliente.calculaTotalCompra());
            }
            else if(promocao != 0){
                System.out.println("ERROR!");
            }
            compras ++;

            System.out.println("Escolha outra promoção ou finalize apertando 0!");
            promocao = scanner3.nextInt();
        }
        System.out.println("--------------------------------------------");
        System.out.println(cliente.nome + ", esse é o total da sua compra:");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cpf_cliente);
        if (pc1.cliente != null && pc1.cliente.nome == cliente.nome){
            pc1.mostraPCConfigs();
        }
        if (pc2.cliente != null && pc2.cliente.nome == cliente.nome) {
            pc2.mostraPCConfigs();
        }
        if (pc3.cliente != null && pc3.cliente.nome == cliente.nome){
            pc3.mostraPCConfigs();
        }
        System.out.println("TOTAL: " + cliente.calculaTotalCompra() + " R$");

        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
