import java.util.Scanner;

public class MainAlunosEbac {

    public static void main(String[] args) {

        System.out.println("Digite quantos alunos voce deseja cadastrar: ");

        Scanner scanner = new Scanner(System.in);
        int qntAlunos = scanner.nextInt();

        // levamos em cosideracao que cada aluno faz tres provas


        AlunosEbac[] alunos = new AlunosEbac[qntAlunos];


        System.out.println("Digite as notas, nomes e idades dos alunos: ");

        for (int i = 0; i < qntAlunos; i++) {
                System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
                String nome = scanner.next();
                System.out.println("Nome do aluno " + (i + 1) + " cadastrado com sucesso!");
                System.out.println("Digite a idade do aluno " + (i + 1) + ": ");
                int idade = scanner.nextInt();
                System.out.println("Idade do aluno " + (i + 1) + " cadastrada com sucesso!");
                scanner.nextLine();
                int[] notasAlunoAtual = new int[3];

            for(int j = 0; j < 3; j++){
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                if(notasAlunoAtual[j] < 0 || notasAlunoAtual[j] > 10){
                    System.out.println("Nota invalida, digite um valor entre 0 e 10.");
                    j--;
                    continue;
                }
                int notaDigitada = scanner.nextInt();
                notasAlunoAtual[j] = notaDigitada;
                System.out.println("Nota " + (j + 1) + " do aluno " + (i + 1) + " cadastrada com sucesso!");
                alunos[i] = new AlunosEbac(nome, idade, notasAlunoAtual);
            }
        }




        System.out.println("Dados dos alunos cadastrados: ");
        for (int i = 0; i < qntAlunos; i++) {
            alunos[i].exibirAluno(i);
        }



        

    }
}
