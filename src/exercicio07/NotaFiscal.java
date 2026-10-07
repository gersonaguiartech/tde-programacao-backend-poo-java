package exercicio07;

public class NotaFiscal {

    private String numeroPeca;
    private String descricaoPeca;
    private int quantidade;
    private double preco;

    public NotaFiscal(String numeroPeca, String descricaoPeca,
                      int quantidade, double preco) {

        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida.");
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
            this.preco = 0;
        }
    }

    public double getTotalNota() {
        return quantidade * preco;
    }
}