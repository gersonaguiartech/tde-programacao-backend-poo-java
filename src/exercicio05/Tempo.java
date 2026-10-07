package exercicio05;

public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            System.out.println("Hora inválida.");
            this.horas = 0;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos.");
            this.minutos = 0;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos.");
            this.segundos = 0;
        }
    }

    public void imprimirTempo() {
        System.out.printf(
                "%02d:%02d:%02d%n",
                horas, minutos, segundos
        );
    }

    public double calcularMinutos() {
        return (horas * 60) + minutos + (segundos / 60.0);
    }

    public int calcularSegundos() {
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}