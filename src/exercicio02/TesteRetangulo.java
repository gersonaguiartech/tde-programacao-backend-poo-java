package exercicio02;

public class TesteRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.setLength(10.0);
        retangulo1.setWidth(5.0);

        retangulo2.setLength(15.0);
        retangulo2.setWidth(8.0);

        System.out.println("--- RETÂNGULO 1 ---");
        System.out.println("Comprimento: " + retangulo1.getLength());
        System.out.println("Largura: " + retangulo1.getWidth());
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

        System.out.println("\n--- RETÂNGULO 2 ---");
        System.out.println("Comprimento: " + retangulo2.getLength());
        System.out.println("Largura: " + retangulo2.getWidth());
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());

        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");

        retangulo1.setLength(25.0);
        retangulo2.setWidth(-5.0);
    }
}