package exercicio06;

import exercicio05.Tempo;

public class TesteEstacionamento {

    public static void main(String[] args) {

        Tempo entrada = new Tempo(8, 0, 0);
        Tempo saida = new Tempo(12, 30, 0);

        Estacionamento estacionamento = new Estacionamento();

        estacionamento.setPlaca("ABC-1234");
        estacionamento.setModelo("Toyota Corolla");

        estacionamento.setHoraEntrada(entrada);
        estacionamento.setHoraSaida(saida);

        System.out.println("--- ESTACIONAMENTO ---");

        estacionamento.imprimirDados();
    }
}