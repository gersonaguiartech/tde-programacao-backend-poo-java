package exercicio10;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(
                "Carlos Silva",
                "Desenvolvedor Júnior",
                3000.00,
                "F001",
                "Tecnologia"
        );

        Funcionario funcionario2 = new Funcionario(
                "Maria Santos",
                "Analista",
                3500.00,
                "F002",
                "Administrativo"
        );

        System.out.println("--- FUNCIONÁRIO 1 ---");
        funcionario1.exibirDados();

        System.out.println("\n--- PROMOÇÃO ---");

        funcionario1.promover(
                "Desenvolvedor Pleno",
                1500.00
        );

        funcionario1.exibirDados();

        System.out.println("\n--- TRANSFERÊNCIA ---");

        funcionario1.transferir(
                "Desenvolvimento de Software"
        );

        funcionario1.exibirDados();

        System.out.println("\n--- FUNCIONÁRIO 2 ---");
        funcionario2.exibirDados();

        System.out.println("\n--- TESTE DE VALIDAÇÃO ---");

        funcionario2.promover(
                "Analista Sênior",
                -500
        );

        funcionario2.transferir("");
    }
}