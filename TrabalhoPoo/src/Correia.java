import java.util.InputMismatchException;

public class Correia extends Peças{
    private String tipo;
    private String AondeServe;

    public String getAondeServe() {
        return AondeServe;
    }

    public void setAondeServe(String aondeServe) {
        AondeServe = aondeServe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Correia(String idPeca, double precoDeCompra, int quantidadeDeEstoque, String tipo, String aondeServe) {
        super(idPeca, precoDeCompra, quantidadeDeEstoque);
        this.tipo = tipo;
        this.AondeServe = aondeServe;
    }

    @Override
    public String toString() {
        return "Correia" +
                " tipo = '" + tipo + '\'' +
                ", idPeca = '" + idPeca + '\'' +
                ", precoDeCompra = " + precoDeCompra +
                ", quantidadeDeEstoque = " + quantidadeDeEstoque +
                ", Onde Serve = " + AondeServe
                ;
    }

    @Override
    public double PreçoVenda(double precoDeCompra){
        return precoDeCompra += precoDeCompra * 0.55;
    }

    @Override
    public void adicionarPeça(){
        try {
            System.out.println("Digite o id da peça: ");
            String idPeca = scn.next();

            System.out.println("Digite o preço de compra da peça");
            double precoDeCompra = scn.nextDouble();

            System.out.println("Digite o tipo da Correia");
            scn.nextLine();
            String tipo = scn.nextLine();

            System.out.println("Digite a quantidade que deseja adicionar");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite para onde serve essa correia");
            scn.nextLine();
            String aondeServe = scn.nextLine();

            listaPeças.add(new Correia(idPeca, PreçoVenda(precoDeCompra),quantidadeDeEstoque, tipo,aondeServe) {
            });
        } catch (InputMismatchException e){
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

            System.out.println("Digite o tipo da Correia");
            scn.nextLine();
            String tipo = scn.nextLine();

            System.out.println("Digite a quantidade que está no estoque");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite para onde serve essa correia");
            scn.nextLine();
            String aondeServe = scn.nextLine();

            listaPeças.remove(alterado);
            listaPeças.add(new Correia(id, PreçoVenda(preçodecompra),quantidadeDeEstoque,tipo,aondeServe) {
            });
            System.out.println("produto alterado com sucesso!");
        }catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
}
