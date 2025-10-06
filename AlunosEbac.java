public class AlunosEbac {

    private String nome;
    private int idade;
    private int nota[];

    public AlunosEbac(String nome, int idade, int[] nota) {
        this.nome = nome;
        if(idade < 0){
            throw new IllegalArgumentException("A idade deve ser mair que 0");
        }
        this.idade = idade;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("A idade deve ser mair que 0");
        }
        this.idade = idade;
    }
    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public void exibirAluno(int i) {
        System.out.println("Aluno " + (i + 1) + ": " + getNome() + ", " + getIdade() + " anos, media: " + mediaNotas());
    }

    public int somador(){
        int soma = 0;
        for(int i = 0; i < this.nota.length; i++){
            soma += this.nota[i];
        }
        return  soma;
    }

    public double mediaNotas(){
        int somaNotas = somador();
        double media = (double) somaNotas / (double) this.nota.length;
        return media;

    }


}

