import java.util.ArrayList;
import java.util.Scanner;

public abstract class Peças {
    private String idPeca;
    private double precoDeCompra;
    private int quantidadeDeEstoque;

    static ArrayList<Peças> listaPeças = new ArrayList<>();
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

    public double definePrecoDeVenda(){
        return precoDeCompra;
    }
    public void vende(int quantidade){

    }

    public static void adicionarPeça(){
        System.out.println("Digite o id da peça: ");
        String idPeca = scn.next();

        System.out.println("Digite o preço de compra da peça");
        double precoDeCompra = scn.nextDouble();

        System.out.println("Digite a quantidade que deseja adicionar");
        int quantidadeDeEstoque = scn.nextInt();

        listaPeças.add(new Peças(idPeca, precoDeCompra,quantidadeDeEstoque) {
        });

    }
    public static void vizualizarPeça(){
        for (int x = 0; x < listaPeças.size(); x++  ){
            System.out.println(listaPeças.get(x));
        }
    }
    public static void removerPeça(){
        System.out.println("Deletar uma peça");
        System.out.println("Escolha o indice do peça que deseja deletar");
        for (int i = 0; i < listaPeças.size(); i++) {
            System.out.println("Indice :"+i+" - "+listaPeças.get(i));
        }
        int removido = scn.nextInt();
        listaPeças.remove(removido);
        System.out.println("Peça deletada com sucesso");

    }
}
