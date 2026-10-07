package exercicio10;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private String matricula;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario,
                       String matricula, String departamento) {

        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void promover(String novoCargo, double aumento) {

        if (aumento > 0) {
            this.cargo = novoCargo;
            this.salario += aumento;

            System.out.println("Funcionário promovido com sucesso.");
        } else {
            System.out.println("O aumento deve ser maior que zero.");
        }
    }

    public void transferir(String novoDepartamento) {

        if (novoDepartamento != null && !novoDepartamento.isEmpty()) {
            this.departamento = novoDepartamento;

            System.out.println("Funcionário transferido com sucesso.");
        } else {
            System.out.println("Departamento inválido.");
        }
    }

    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cargo: " + cargo);

        System.out.printf(
                "Salário: R$ %.2f%n",
                salario
        );

        System.out.println("Departamento: " + departamento);
    }
}