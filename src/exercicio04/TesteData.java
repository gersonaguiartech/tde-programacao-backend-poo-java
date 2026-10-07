package exercicio04;

public class TesteData {

    public static void main(String[] args) {

        Data data1 = new Data(10, 7, 2026);
        Data data2 = new Data(2, 29, 2024);

        System.out.println("--- DATA 1 ---");
        data1.imprimirData();

        System.out.println(
                "Quantidade de dias até o mês: "
                + data1.calcularDiasAteMes(data1.getMes())
        );

        System.out.println("\n--- DATA 2 ---");
        data2.imprimirData();

        System.out.println(
                "Quantidade de dias até o mês: "
                + data2.calcularDiasAteMes(data2.getMes())
        );

        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");

        Data dataInvalida = new Data(13, 40, -2026);
        dataInvalida.imprimirData();
    }
}