package exercicio07;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        NotaFiscal nota1 = new NotaFiscal(
                "P001",
                "Teclado Mecânico",
                2,
                250.00
        );

        NotaFiscal nota2 = new NotaFiscal(
                "P002",
                "Mouse",
                3,
                100.00
        );

        System.out.println("--- NOTA FISCAL 1 ---");
        System.out.println("Número da peça: " + nota1.getNumeroPeca());
        System.out.println("Descrição: " + nota1.getDescricaoPeca());
        System.out.println("Quantidade: " + nota1.getQuantidade());

        System.out.printf(
                "Preço unitário: R$ %.2f%n",
                nota1.getPreco()
        );

        System.out.printf(
                "Total da nota: R$ %.2f%n",
                nota1.getTotalNota()
        );

        System.out.println("\n--- NOTA FISCAL 2 ---");
        System.out.println("Número da peça: " + nota2.getNumeroPeca());
        System.out.println("Descrição: " + nota2.getDescricaoPeca());
        System.out.println("Quantidade: " + nota2.getQuantidade());

        System.out.printf(
                "Preço unitário: R$ %.2f%n",
                nota2.getPreco()
        );

        System.out.printf(
                "Total da nota: R$ %.2f%n",
                nota2.getTotalNota()
        );

        System.out.println("\n--- TESTES DE VALIDAÇÃO ---");

        nota1.setQuantidade(-5);
        nota2.setPreco(-100);
    }
}