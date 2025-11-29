package Hotel.reservas;

import Hotel.interfaces.pagavel;
import Hotel.pessoas.Hospede;
import Hotel.quartos.Quarto;

public class Reserva implements pagavel {

    private final Hospede hospede;
    private final Quarto quarto;
    private int dias;

    public Reserva(Hospede hospede, Quarto quarto) {
        this(hospede, quarto, 1);
    }

    public Reserva(Hospede hospede, Quarto quarto, int dias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public double calcularPagamento() {
        return dias * quarto.getTipo().getPreco();
    }

    public void exibirReserva() {
        System.out.println(
                "Reserva: " + hospede.getNome() +
                        " | Quarto: " + quarto.getNumero() +
                        " | Tipo: " + quarto.getTipo() +
                        " | Dias: " + dias +
                        " | Total: R$" + calcularPagamento()
        );
    }
}
