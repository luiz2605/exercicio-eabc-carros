public class Toalha {

    private String cor;
    private String tamanho;
    private int umidade;


    //construtor
    public Toalha(String cor, String tamanho, int umidade) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.umidade = umidade;
    }

    //getters e setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getUmidade() {
        return umidade;
    }

    //metodos
    public void mostrarToalha(){
        System.out.println(getCor() + " " + getTamanho() + " " + getUmidade());
    }

    public void enxugarAlgo(int umidadeEnxugada){
        if(umidadeEnxugada > 0){
            umidade += umidadeEnxugada;
        }
    }
    public void torcerToalha(){
        umidade = 0;
    }

    public int MaxUmidade(){
        if(tamanho.equals("P")){
            return 10;
        }
        else if(tamanho.equals("M")){
            return 20;
        }
        else{
            return 30;
        }
    }

    public boolean estaSeca(){
        if(umidade == 0){
            return  true;
        }
        else{
            return  false;
        }
    }
}
