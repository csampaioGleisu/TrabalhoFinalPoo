import java.util.*;

public class Adm extends Pessoa{
    private String codigoadm;
    static Scanner scn = new Scanner(System.in);

    static Set<Adm> ADMS = new HashSet<>();

    public static List<String> IdsAdm = new ArrayList<>();

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
        return "Adm" +
                "id = " + getId() + ", " +
                "nome = " + getNome() + ", " +
                "codigoadm = '" + codigoadm + '\''
                ;
    }

    public static void addAdms() {
        System.out.println("Qual o seu nome :");
        String nome = scn.nextLine();
        System.out.println("digite seu id");
        String id = scn.next();
        System.out.println("digite seu codigo de Administrador ");
        scn.nextLine();
        String codigoadm = scn.nextLine();
        Adm adm1 = new Adm("","","");
        Adm adm2 = new Adm("","","");
        ADMS.add(adm1);
        ADMS.add(adm2);
        ADMS.add(new Adm(id, nome, codigoadm));
        IdsAdm.add(codigoadm);
    }
}
