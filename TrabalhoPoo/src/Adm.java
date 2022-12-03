public class Adm extends Pessoa{
    private String codigoadm;

    public String getCodigoadm() {
        return codigoadm;
    }

    public void setCodigoadm(String codigoadm) {
        this.codigoadm = codigoadm;
    }


    public Adm(String nome, String id, String codigoadm) {
        super(nome, id);
        this.codigoadm = codigoadm;
    }

    @Override
    public String toString() {

        return "Adm {" +
                "nome = " + getNome()+ ", " +
                "id = " + getId() + ", " +
                "codigoadm='" + codigoadm + '\'' +
                '}';
    }
}
