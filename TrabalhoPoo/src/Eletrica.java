import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Eletrica extends Peças{
    private String voltagem;

    private String ModeloTrator;

    public String getModeloTrator() {
        return ModeloTrator;
    }

    public void setModeloTrator(String modeloTrator) {
        ModeloTrator = modeloTrator;
    }
    static List<Eletrica> eletricaLista = new ArrayList<>();

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public Eletrica(String idPeca, double precoDeCompra, int quantidadeDeEstoque, String voltagem, String modeloTrator) {
        super(idPeca, precoDeCompra, quantidadeDeEstoque);
        this.voltagem = voltagem;
        this.ModeloTrator = modeloTrator;
    }

    @Override
    public String toString() {
        return "Eletrica" +
                "voltagem = " + voltagem +
                ", idPeca = '" + idPeca + '\'' +
                ", precoDeCompra = " + precoDeCompra +
                ", quantidadeDeEstoque = " + quantidadeDeEstoque +
                ", ModeloDoTrator = " + ModeloTrator
                ;
    }

    @Override
    public double PreçoVenda(double precoDeCompra){
        return precoDeCompra += precoDeCompra * 0.3;
    }
    @Override
    public void adicionarPeça(){
        try {
            System.out.println("Digite o id da peça: ");
            String idPeca = scn.next();

            System.out.println("Digite o preço de compra da peça");
            double precoDeCompra = scn.nextDouble();

            System.out.println("Digite a voltagem do Farol");
            scn.nextLine();
            String voltagem = scn.nextLine();

            System.out.println("Digite a quantidade que deseja adicionar");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite para qual modelo de trator essa peça serve: ");
            scn.nextLine();
            String ModeloTrator = scn.nextLine();

            listaPeças.add(new Eletrica(idPeca, PreçoVenda(precoDeCompra),quantidadeDeEstoque, voltagem,ModeloTrator) {
            });
            eletricaLista.add(new Eletrica(idPeca, PreçoVenda(precoDeCompra),quantidadeDeEstoque, voltagem,ModeloTrator) {
            });
        }catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
    @Override
    public void alterarPeça(){
        try {
            System.out.println("Digite a peca a ser alterada");
            for (Peças x : listaPeças) {
                System.out.println("item "+ (listaPeças.indexOf(x)) + ": " + x.getIdPeca());
            }
            int alterado = scn.nextInt();
            System.out.println("Produto a ser alterado:  " + listaPeças.get(alterado));

            System.out.println("Digite os valores da alteracao:");

            System.out.println("Id alterado do produto");
            scn.nextLine();
            String id = scn.nextLine();

            System.out.println("Preço alterado no produto");
            double preçodecompra = scn.nextDouble();

            System.out.println("Digite a voltagem do Farol");
            scn.nextLine();
            String voltagem = scn.nextLine();

            System.out.println("Digite a quantidade que está no estoque");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite para qual modelo de trator essa peça serve: ");
            scn.nextLine();
            String ModeloTrator = scn.nextLine();

            listaPeças.remove(alterado);
            listaPeças.add(new Eletrica(id, PreçoVenda(preçodecompra),quantidadeDeEstoque,voltagem,ModeloTrator) {
            });


            System.out.println("produto alterado com sucesso!");
        }catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
    public static void vizualizarEletrica() {
        for (int x = 0; x < eletricaLista.size(); x++) {
            System.out.println(eletricaLista.get(x));
        }
    }
}
