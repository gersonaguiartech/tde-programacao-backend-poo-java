package exercicio01;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1001, "João");
        ContaBancaria conta2 = new ContaBancaria(1002, "Maria");

        conta1.depositar(1000.00);
        conta1.sacar(250.00);

        conta2.depositar(1500.00);
        conta2.sacar(400.00);

        System.out.println("\n--- CONTA 1 ---");
        System.out.println("Número: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        System.out.println("\n--- CONTA 2 ---");
        System.out.println("Número: " + conta2.getNumero());
        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: R$ " + conta2.getSaldo());

        // Testando situações inválidas
        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");
        conta1.depositar(-100);
        conta2.sacar(5000);
    }
}