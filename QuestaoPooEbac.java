public class QuestaoPooEbac {

    String marca;
    String modelo;
    int ano;
    String cor;
    int valor;

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + " , valor=" + valor + "]";

    }

    public QuestaoPooEbac(String marca, String modelo, int ano, String cor, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
    }

}
