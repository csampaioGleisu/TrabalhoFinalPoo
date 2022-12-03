public class Cliente extends Pessoa{
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome, String id, String endereco) {
        super(nome, id);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = " + getNome()+ ", " +
                "id = " + getId() + ", " +
                "endereco='" + endereco + '\'' +
                '}';
    }

    public void comprar(){

    }
}
