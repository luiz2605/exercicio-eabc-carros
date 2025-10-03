import java.util.Scanner;

public class MainQuestaoPooEbac {
    public static void main(String[] args) {

        System.out.println("Digite a quantidade de carros que deseja cadastrar (max: 50):");
        Scanner scanner = new Scanner(System.in);

        int quantidadeCarros = 0;

        if (scanner.hasNext()) {
            quantidadeCarros = scanner.nextInt();
            if (quantidadeCarros == 0 || quantidadeCarros > 50) {
                System.out.println("Quantidade inválida, digite um valor entre 1 e 50.");
                return;
            }
        }

        scanner.nextLine();

        QuestaoPooEbac[] carro = new QuestaoPooEbac[quantidadeCarros];

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println("Digite a marca do carro " + (i + 1) + ":");
            String marca = scanner.nextLine();

            System.out.println("Digite o modelo do carro " + (i + 1) + ":");
            String modelo = scanner.nextLine();

            System.out.println("Digite o ano do carro " + (i + 1) + ":");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a cor do carro " + (i + 1) + ":");
            String cor = scanner.nextLine();

            System.out.println("Digite o valor do carro " + (i + 1) + ":");
            int valorCarro = scanner.nextInt();

            carro[i] = new QuestaoPooEbac(marca, modelo, ano, cor, valorCarro);
            scanner.nextLine();
        }

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println("Modelo Carro " + i + 1 + ": " + carro[i].modelo + " | Marca: " + carro[i].marca + " | Ano: " + carro[i].ano + " | Cor: " + carro[i].cor + " | Valor: " + carro[i].valor);
        }

        int somaValorCarro = 0;

        for (int i = 0; i < quantidadeCarros; i++) {
            somaValorCarro += carro[i].valor;
        }
        System.out.println("Valor total dos carros cadastrados: " + somaValorCarro);
            scanner.close();
    }
}
