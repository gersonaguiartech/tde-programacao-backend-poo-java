package exercicio05;

public class TesteTempo {

    public static void main(String[] args) {

        Tempo tempo1 = new Tempo(2, 30, 15);
        Tempo tempo2 = new Tempo(1, 15, 30);

        System.out.println("--- TEMPO 1 ---");
        tempo1.imprimirTempo();

        System.out.printf(
                "Total em minutos: %.2f%n",
                tempo1.calcularMinutos()
        );

        System.out.println(
                "Total em segundos: "
                + tempo1.calcularSegundos()
        );

        System.out.println("\n--- TEMPO 2 ---");
        tempo2.imprimirTempo();

        System.out.printf(
                "Total em minutos: %.2f%n",
                tempo2.calcularMinutos()
        );

        System.out.println(
                "Total em segundos: "
                + tempo2.calcularSegundos()
        );

        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");

        Tempo tempoInvalido = new Tempo(25, 70, 90);
        tempoInvalido.imprimirTempo();
    }
}