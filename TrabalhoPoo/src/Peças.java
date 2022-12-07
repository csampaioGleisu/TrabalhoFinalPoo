import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Peças {
    protected String idPeca;
    protected double precoDeCompra;
    protected int quantidadeDeEstoque;

    static List<Peças> listaPeças = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);

    public String getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(String idPeca) {
        this.idPeca = idPeca;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public Peças(String idPeca, double precoDeCompra, int quantidadeDeEstoque) {
        this.idPeca = idPeca;
        this.precoDeCompra = precoDeCompra;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    @Override
    public String toString() {
        return "Peças{" +
                "idPeca = " + idPeca + '\'' +
                ", precoDeCompra = " + precoDeCompra +
                ", quantidade No Estoque = " + quantidadeDeEstoque +
                '}';
    }


    public double PreçoVenda(double PreçoDeCompra){
        return precoDeCompra * 0.0;
    }

    public void adicionarPeça() {

        System.out.println("teste");
    }

    public static void vizualizarPeça() {
        for (int x = 0; x < listaPeças.size(); x++) {
            System.out.println(listaPeças.get(x));
        }
    }

    public void alterarPeça() {
        System.out.println("Digite a peca a ser alterada");
        for (Peças x : listaPeças) {
            System.out.println("item " + (listaPeças.indexOf(x)) + ": " + x.idPeca);
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

        listaPeças.remove(alterado);
        listaPeças.add(new Peças(id, preçodecompra, quantidadeDeEstoque) {

        });

        System.out.println("produto alterado com sucesso!");
    }


    public void removerPeça() {
        System.out.println("Deletar uma peça");
        System.out.println("Escolha o indice do peça que deseja deletar");
        for (int i = 0; i < listaPeças.size(); i++) {
            System.out.println("Indice :" + i + " - " + listaPeças.get(i));
        }
        int removido = scn.nextInt();
        listaPeças.remove(removido);
        System.out.println("Peça deletada com sucesso");

    }

}

