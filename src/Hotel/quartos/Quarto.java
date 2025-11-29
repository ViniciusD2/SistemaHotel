package Hotel.quartos;

public class Quarto {
    private final int numero;
    private TipoQuarto tipo;
    private boolean ocupado;

    public Quarto(int numero, TipoQuarto tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    public void liberar() {
        this.ocupado = false;
    }

    public void exibirQuarto() {
        System.out.println("Quarto " + numero + " | Tipo: " + tipo + " | Ocupado: " + (ocupado ? "Sim" : "Não"));
    }
}
