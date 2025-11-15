import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Turma turma = null;
        while (turma == null) {
            try {
                System.out.print("Nome da turma: ");
                String nomeT = sc.nextLine();
                turma = new Turma(nomeT);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        int qnt = 0;
        while (qnt <= 0) {
            try {
                System.out.print("Quantos alunos na turma: ");
                qnt = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número válido!");
                sc.nextLine();
            }
        }

        for (int i = 0; i < qnt; i++) {
            Aluno aluno = null;
            while (aluno == null) {
                try {
                    System.out.println("Aluno #" + (i + 1) + ":");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    aluno = new Aluno(nome);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            for (int j = 1; j <= 4; j++) {
                Double nota = null;
                while (nota == null) {
                    try {
                        System.out.print("Nota #" + j + ": ");
                        nota = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: digite um número válido!");
                        sc.nextLine(); // limpa buffer
                    }
                }
                aluno.addNota(nota);
            }
            sc.nextLine(); // limpa o buffer após notas
            turma.addAluno(aluno);
        }

        System.out.println(turma);
    }
}
