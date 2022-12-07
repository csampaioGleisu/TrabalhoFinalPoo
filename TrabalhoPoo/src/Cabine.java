import java.util.InputMismatchException;
import java.util.Scanner;

public class Cabine extends Peças {
    static Scanner scn = new Scanner(System.in);
    private String Tamanho;

    private String NomePeça;

    public String getNomePeça() {
        return NomePeça;
    }

    public void setNomePeça(String nomePeça) {
        NomePeça = nomePeça;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public Cabine(String idPeca, double precoDeCompra, int quantidadeDeEstoque, String Tamanho,String nomePeça) {
        super(idPeca, precoDeCompra, quantidadeDeEstoque);
        this.Tamanho = Tamanho;
        this.NomePeça = nomePeça;
    }

    @Override
    public String toString() {
        return "Cabine" +
                " Tamanho =" + Tamanho +
                ", idPeca = '" + idPeca + '\'' +
                ", precoDeCompra = " + precoDeCompra +
                ", quantidadeDeEstoque = " + quantidadeDeEstoque +
                ", Nome da Peça = " + NomePeça
                ;
    }

    @Override
    public double PreçoVenda(double precoDeCompra){
        return precoDeCompra += precoDeCompra * 0.15;
    }

    @Override
    public void adicionarPeça(){
        try {
            System.out.println("Digite o id da peça: ");
            String idPeca = scn.next();

            System.out.println("Digite o preço de compra da peça");
            double precoDeCompra = scn.nextDouble();

            System.out.println("Digite a quantidade que deseja adicionar");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite o Tamanho da Cabine");
            String Tamanho = scn.next();

            System.out.println("Digite o Nome da peça: ");
            scn.nextLine();
            String nomePeça = scn.nextLine();

            listaPeças.add(new Cabine(idPeca, PreçoVenda(precoDeCompra),quantidadeDeEstoque, Tamanho,nomePeça) {
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

            System.out.println("Digite a quantidade que está no estoque");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite o Tamanho da Cabine");
            String Tamanho = scn.next();

            System.out.println("Digite o Nome da peça: ");
            scn.nextLine();
            String nomePeça = scn.nextLine();

            listaPeças.remove(alterado);
            listaPeças.add(new Cabine(id, PreçoVenda(preçodecompra),quantidadeDeEstoque,Tamanho,nomePeça) {
            });

            System.out.println("produto alterado com sucesso!");
        }catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
}
