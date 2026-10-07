package exercicio09;

public class Quarto {

    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean estaOcupado;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.estaOcupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void reservar() {
        if (!estaOcupado) {
            estaOcupado = true;
            System.out.println("Quarto reservado com sucesso.");
        } else {
            System.out.println("O quarto já está ocupado.");
        }
    }

    public void liberar() {
        if (estaOcupado) {
            estaOcupado = false;
            System.out.println("Quarto liberado com sucesso.");
        } else {
            System.out.println("O quarto já está livre.");
        }
    }

    public double calcularValor(int dias) {
        if (dias > 0) {
            return precoPorNoite * dias;
        } else {
            System.out.println("Quantidade de dias inválida.");
            return 0;
        }
    }
}