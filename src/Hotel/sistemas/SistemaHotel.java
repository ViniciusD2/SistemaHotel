package Hotel.sistemas;

import Hotel.pessoas.Hospede;
import Hotel.quartos.Quarto;
import Hotel.quartos.TipoQuarto;
import Hotel.servicos.Hotel;

public class SistemaHotel {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Paraíso");

        hotel.adicionarQuarto(new Quarto(101, TipoQuarto.SIMPLES));
        hotel.adicionarQuarto(new Quarto(102, TipoQuarto.DUPLO));
        hotel.adicionarQuarto(new Quarto(201, TipoQuarto.LUXO));

        hotel.listarQuartos();

        Hospede h1 = new Hospede("Vinícius", "123.456.789-00");
        hotel.fazerReserva(h1, TipoQuarto.DUPLO, 3);

        hotel.listarReservas();
    }
}
