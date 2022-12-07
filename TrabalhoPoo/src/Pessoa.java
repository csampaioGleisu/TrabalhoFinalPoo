public abstract class Pessoa {
    private String nome;
    private String id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa(String id, String nome) {
        this.nome = nome;
        this.id = id;
    }
}
