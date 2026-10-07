package exercicio03;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo(
                "Toyota",
                "Corolla",
                2024,
                "Preto"
        );

        Veiculo veiculo2 = new Veiculo(
                "Honda",
                "Civic",
                2023,
                "Branco"
        );

        System.out.println("--- VEÍCULO 1 ---");
        veiculo1.exibirDados();

        System.out.println("\n--- VEÍCULO 2 ---");
        veiculo2.exibirDados();

        System.out.println("\n--- TESTANDO GETTERS ---");
        System.out.println("Marca do veículo 1: " + veiculo1.getMarca());
        System.out.println("Modelo do veículo 2: " + veiculo2.getModelo());
        System.out.println("Ano do veículo 1: " + veiculo1.getAno());
        System.out.println("Cor do veículo 2: " + veiculo2.getCor());
    }
}