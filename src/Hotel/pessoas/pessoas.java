package Hotel.pessoas;

public abstract class pessoas {
    private final String nome;
    private final String documento;

    public pessoas(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public abstract void exibirInfo();
}
