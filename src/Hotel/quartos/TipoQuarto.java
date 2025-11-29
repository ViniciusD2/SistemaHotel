package Hotel.quartos;

public enum TipoQuarto {
    SIMPLES(100),
    DUPLO(180),
    LUXO(350);

    private final double preco;

    TipoQuarto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
