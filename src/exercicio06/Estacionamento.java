package exercicio06;

import exercicio05.Tempo;

public class Estacionamento {

    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = new Tempo(0, 0, 0);
        this.horaSaida = new Tempo(0, 0, 0);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double calcularValor() {

        int entrada = horaEntrada.calcularSegundos();
        int saida = horaSaida.calcularSegundos();

        int tempoEstacionado = saida - entrada;

        if (tempoEstacionado <= 0) {
            return 0;
        }

        double horas = tempoEstacionado / 3600.0;

        return horas * 1.50;
    }

    public void imprimirDados() {

        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);

        System.out.print("Hora de entrada: ");
        horaEntrada.imprimirTempo();

        System.out.print("Hora de saída: ");
        horaSaida.imprimirTempo();

        System.out.printf(
                "Valor a pagar: R$ %.2f%n",
                calcularValor()
        );
    }
}