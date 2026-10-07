package exercicio08;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "João",
                20,
                "2026001",
                "Sistemas de Informação"
        );

        Aluno aluno2 = new Aluno(
                "Maria",
                19,
                "2026002",
                "Sistemas de Informação"
        );

        // Notas do primeiro aluno
        aluno1.adicionarNota(8.0);
        aluno1.adicionarNota(7.5);
        aluno1.adicionarNota(9.0);

        // Notas do segundo aluno
        aluno2.adicionarNota(5.0);
        aluno2.adicionarNota(6.0);
        aluno2.adicionarNota(6.5);

        System.out.println("\n--- ALUNO 1 ---");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Notas: " + aluno1.getNotas());

        System.out.printf(
                "Média: %.2f%n",
                aluno1.calcularMedia()
        );

        if (aluno1.verificarAprovacao()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        System.out.println("\n--- ALUNO 2 ---");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println("Notas: " + aluno2.getNotas());

        System.out.printf(
                "Média: %.2f%n",
                aluno2.calcularMedia()
        );

        if (aluno2.verificarAprovacao()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        System.out.println("\n--- TESTE DE VALIDAÇÃO ---");

        aluno1.adicionarNota(15);
    }
}