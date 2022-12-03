import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws VerificarSenha {

        Scanner scn = new Scanner(System.in);
        int op = 0;
        boolean validarSenhaAdm = true;




        while (op != 9) {
            System.out.println("Digite 1 para Entrar como Administrador");
            System.out.println("Digite 2 para visualizar estoque");
            System.out.println("Digite 3 para");
            System.out.println("Digite 4 para");
            System.out.println("Digite 9 para sair");
            op = scn.nextInt();

                if(op == 1){
                    do{
                        System.out.println("Digite a senha de administrador:");
                        String senhaadm = scn.next();
                        if(senhaadm.equalsIgnoreCase("adm")) {
                        System.out.println("está correto");
                        while(op != 12){
                            System.out.println("Digite 1 para adicionar peça");
                            System.out.println("Digite 2 para vizualizar o estoque");
                            System.out.println("Digite 3 para alterar alguma peça");
                            System.out.println("Digite 4 para deletar alguma peça");
                            System.out.println("Digite 12 para sair");
                            op = scn.nextInt();
                            if(op == 1) {
                                Peças.adicionarPeça();
                            } else if (op == 2) {
                                Peças.vizualizarPeça();
                            } else if (op == 4) {
                                Peças.removerPeça();
                            }
                        }
                        validarSenhaAdm = false;
                    }else {
                        try {
                            throw new VerificarSenha();
                        }
                        catch (VerificarSenha e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }while (validarSenhaAdm == true);
            }
        }
    }
}
