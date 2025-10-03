import java.util.Scanner;

public class MainToalha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Toalha toalha = new Toalha(null, null, 0);

        String opc = "";

        while (entrada.hasNextLine()) {
            opc = entrada.nextLine().trim();

            // ecoa o comando
            System.out.println("$" + opc);

            if (opc.equals("criar")) {
                toalha.setCor(entrada.nextLine().trim());
                System.out.println("$" + toalha.getCor());

                toalha.setTamanho(entrada.nextLine().trim());
                System.out.println("$" + toalha.getTamanho());

            }
            else if (opc.equals("mostrar")) {
                toalha.mostrarToalha();
            }
            else if (opc.equals("enxugar")) {
                int porcentagem = Integer.parseInt(entrada.nextLine().trim());
                System.out.println("$" + porcentagem);
                toalha.enxugarAlgo(porcentagem);
                toalha.mostrarToalha();
            }
            else if (opc.equals("seca")) {
                if(toalha.estaSeca()){
                    System.out.println("SIM");
                }
                else{
                    System.out.println("NAO");
                }
            }
            else if (opc.equals("torcer")) {
                toalha.torcerToalha();
                toalha.mostrarToalha();
            }
            else if (opc.equals("end")) {
                System.out.println("$end");
                break;
            }
            else {
                System.out.println("comando invalido");
            }
        }
        entrada.close();
    }
}