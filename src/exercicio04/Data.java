package exercicio04;

public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido.");
            this.mes = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= diasNoMes(mes)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido.");
            this.dia = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido.");
            this.ano = 1;
        }
    }

    private boolean ehBissexto() {
        return (ano % 400 == 0) ||
               (ano % 4 == 0 && ano % 100 != 0);
    }

    private int diasNoMes(int mes) {
        switch (mes) {
            case 2:
                return ehBissexto() ? 29 : 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return 31;
        }
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, ano);
    }

    public int calcularDiasAteMes(int numeroMes) {

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Mês inválido.");
            return 0;
        }

        int totalDias = 0;

        for (int i = 1; i < numeroMes; i++) {
            totalDias += diasNoMes(i);
        }

        return totalDias;
    }
}