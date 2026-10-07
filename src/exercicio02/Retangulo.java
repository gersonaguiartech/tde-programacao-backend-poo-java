package exercicio02;

public class Retangulo {

    private double length;
    private double width;

    public Retangulo() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Comprimento inválido.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Largura inválida.");
        }
    }

    public double calcularArea() {
        return length * width;
    }

    public double calcularPerimetro() {
        return 2 * (length + width);
    }
}