package Hotel.pessoas;

public class Funcionario extends pessoas {

    private String cargo;

    public Funcionario(String nome, String documento, String cargo) {
        super(nome, documento);
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Funcionário: " + getNome() + " | Cargo: " + cargo);
    }
}
