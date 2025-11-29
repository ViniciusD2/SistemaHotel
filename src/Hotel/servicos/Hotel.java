package Hotel.servicos;

import Hotel.pessoas.Hospede;
import Hotel.quartos.Quarto;
import Hotel.quartos.TipoQuarto;
import Hotel.reservas.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String nome;
    private final List<Quarto> quartos;
    private final List<Reserva> reservas;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void listarQuartos() {
        System.out.println("\n--- Lista de Quartos ---");
        for (Quarto q : quartos) {
            q.exibirQuarto();
        }
    }

    private Quarto buscarQuartoDisponivel(TipoQuarto tipo) {
        for (Quarto q : quartos) {
            if (!q.isOcupado() && q.getTipo() == tipo) {
                return q;
            }
        }
        return null;
    }

    public void fazerReserva(Hospede hospede, TipoQuarto tipo, int dias) {
        Quarto disponivel = buscarQuartoDisponivel(tipo);

        if (disponivel == null) {
            System.out.println("Nenhum quarto disponível do tipo " + tipo);
            return;
        }

        disponivel.ocupar();

        Reserva reserva = new Reserva(hospede, disponivel, dias);
        reservas.add(reserva);

        System.out.println("\nReserva realizada com sucesso!");
        reserva.exibirReserva();
    }

    public void listarReservas() {
        System.out.println("\n--- Reservas Atuais ---");
        for (Reserva r : reservas) {
            r.exibirReserva();
        }
    }
}
