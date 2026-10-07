package exercicio09;

public class TesteQuarto {

    public static void main(String[] args) {

        Quarto quarto1 = new Quarto(
                101,
                "Suíte",
                350.00
        );

        Quarto quarto2 = new Quarto(
                102,
                "Duplo",
                200.00
        );

        System.out.println("--- QUARTO 1 ---");
        System.out.println("Número: " + quarto1.getNumero());
        System.out.println("Tipo: " + quarto1.getTipo());

        System.out.printf(
                "Preço por noite: R$ %.2f%n",
                quarto1.getPrecoPorNoite()
        );

        System.out.println(
                "Ocupado: " + quarto1.isEstaOcupado()
        );

        System.out.println("\n--- REALIZANDO RESERVA ---");

        quarto1.reservar();

        int dias = 3;

        System.out.printf(
                "Valor para %d dias: R$ %.2f%n",
                dias,
                quarto1.calcularValor(dias)
        );

        System.out.println(
                "Ocupado: " + quarto1.isEstaOcupado()
        );

        System.out.println("\n--- LIBERANDO QUARTO ---");

        quarto1.liberar();

        System.out.println(
                "Ocupado: " + quarto1.isEstaOcupado()
        );

        System.out.println("\n--- QUARTO 2 ---");

        quarto2.reservar();

        System.out.printf(
                "Valor para 5 dias: R$ %.2f%n",
                quarto2.calcularValor(5)
        );

        System.out.println("\n--- TESTE DE VALIDAÇÃO ---");

        quarto2.reservar();
        quarto2.calcularValor(-2);
    }
}