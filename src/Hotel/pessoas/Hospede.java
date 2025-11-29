package Hotel.pessoas;

public class Hospede extends pessoas {

    public Hospede(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Hóspede: " + getNome() + " | Documento: " + getDocumento());
    }
}
