import java.util.*;
import java.util.Set;
public class Cliente extends Pessoa {

    static Scanner scn = new Scanner(System.in);

    static Set<Cliente> clientes = new HashSet<>();

    static List<Peças> pedido = new ArrayList<>();

    public static List<String> Ids = new ArrayList<>();

    static private int select;

    static private double valorTotal, compraAt;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String id, String nome, String endereco) {
        super(id, nome);
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id = " + getId() + ", " +
                "nome = " + getNome() + ", " +
                "endereco='" + endereco + '\'' +
                '}';
    }

    public static void addClientes() {
        System.out.println("Qual o seu nome :");
        String nome = scn.nextLine();
        System.out.println("digite sua senha ");
        String id = scn.next();
        System.out.println("digite seu endereço ");
        scn.nextLine();
        String endereço = scn.nextLine();
        Cliente Cliente1 = new Cliente("123", "Pedro", "Rua teste");
        Cliente Cliente2 = new Cliente("153", "Gerson", "Rua Amelia, 501");
        clientes.add(Cliente1);
        clientes.add(Cliente2);
        clientes.add(new Cliente(id, nome, endereço));
        Ids.add(id);
    }

    public static void comprar() {
        int op4 = 0;
        while (op4 != 99) {
                int auxEstoque;
                System.out.println("Quais pecas deseja comprar? ");
                System.out.println("Ou digite 99 para retornar ao menu!");
                for (int x = 0; x < Peças.listaPeças.size(); x++) {
                    System.out.println(Peças.listaPeças.get(x));
                }
                select = scn.nextInt();
                pedido.add(Peças.listaPeças.get(select));
                System.out.println("Digite a quantidade a ser comprada: ");
                int qtdComprada = scn.nextInt();

                auxEstoque = Peças.listaPeças.get(select).getQuantidadeDeEstoque();

                Peças.listaPeças.get(select).setQuantidadeDeEstoque(auxEstoque - qtdComprada);

                for (Peças pecas : pedido) {
                    compraAt = pecas.getPrecoDeCompra() * qtdComprada;
                }
                valorTotal = compraAt;

                System.out.println("Preço final da compra: " + valorTotal);
                System.out.println("Digite 1 para realizar outra compra ou 99 para voltar ao menu");
                op4 = scn.nextInt();
        }
    }
}

