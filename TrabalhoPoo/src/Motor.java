import java.util.InputMismatchException;
import java.util.Scanner;
public class Motor extends Peças {
    private String marca;

    private String nomeDaPeça;
    static Scanner scn = new Scanner(System.in);

    public String getNomeDaPeça() {
        return nomeDaPeça;
    }

    public void setNomeDaPeça(String nomeDaPeça) {
        this.nomeDaPeça = nomeDaPeça;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nome) {
        this.marca = marca;
    }

    public Motor(String idPeca, double precoDeCompra, int quantidadeDeEstoque, String marca, String nomeDaPeça) {
        super(idPeca, precoDeCompra, quantidadeDeEstoque);
        this.marca = marca;
        this.nomeDaPeça = nomeDaPeça;
    }


    @Override
    public String toString() {
        return "Motor" +
                " Marca = '" + marca + '\'' +
                ", idPeca = '" + idPeca + '\'' +
                ", precoDeCompra = " + precoDeCompra +
                ", quantidadeDeEstoque = " + quantidadeDeEstoque +
                ", Nome da peça = " + nomeDaPeça +
                "";
    }

    @Override
    public double PreçoVenda(double precoDeCompra){
        return precoDeCompra += precoDeCompra * 0.2;
    }

    @Override
    public void adicionarPeça(){
        try {
            System.out.println("Digite o id da peça: ");
            String idPeca = scn.next();

            System.out.println("Digite o nome da peça");
            scn.nextLine();
            String nomeDaPeça = scn.nextLine();

            System.out.println("Digite o preço de compra da peça");
            double precoDeCompra = scn.nextDouble();

            System.out.println("Digite a quantidade que deseja adicionar");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite a Marca do Motor");
            scn.nextLine();
            String marca = scn.nextLine();


            listaPeças.add(new Motor(idPeca, PreçoVenda(precoDeCompra),quantidadeDeEstoque, marca,nomeDaPeça) {
            });
        } catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
    public static void vizualizarPeçaMotor(){
        for (int x = 0; x < listaPeças.size(); x++  ){
            System.out.println(listaPeças.get(x));
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

            System.out.println("Digite o nome da peça alterado");
            scn.nextLine();
            String nomeDaPeça = scn.nextLine();

            System.out.println("Digite a quantidade que está no estoque");
            int quantidadeDeEstoque = scn.nextInt();

            System.out.println("Digite a Marca do Motor");
            scn.nextLine();
            String marca = scn.nextLine();


            listaPeças.remove(alterado);
            listaPeças.add(new Motor(id, PreçoVenda(preçodecompra),quantidadeDeEstoque,marca,nomeDaPeça) {
            });

            System.out.println("produto alterado com sucesso!");
        }catch (InputMismatchException e){
            System.err.println("Foi colocado um valor errado, tente novamente");
        }
    }
    @Override

    public void removerPeça(){
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
