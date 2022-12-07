
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws VerificarSenha,ErroSenhaCliente ,IndexOutOfBoundsException, InputMismatchException,InputMismatchException {

        Scanner scn = new Scanner(System.in);
        int op = 0, op2 = 0, op3 = 0;
        boolean validarSenhaAdm = true;
        boolean ex = true;


        Peças Motor = new Motor("motor", 15.1, 10, "teste", "teste");
        Peças Cabine = new Cabine("cabin", 15.1, 10, "teste", "teste");
        Peças Correia = new Correia("correi", 15.1, 10, "teste", "teste");
        Peças Eletrica = new Eletrica("elet", 15.1, 10, "10", "teste");

        Peças Motor1 = new Motor("motor1",15000,10,"MWM","Motor Completo");
        Peças Motor2 = new Motor("motor2",1000,15,"New Holland","Cabeçote do Pré-Filtro ");
        Peças Motor3 = new Motor("motor3", 450.25,20,"CNH","Camisa Cilindro Motor Trator Case");
        Peças.listaPeças.add(Motor1);
        Peças.listaPeças.add(Motor2);
        Peças.listaPeças.add(Motor3);

        Peças Cabine1 = new Cabine("cabine1",399.99,10,"P", "Farol Cabine Trator");
        Peças Cabine2 = new Cabine("cabine2",1250.00,5,"G",
                "Painel Interior Da Cabine Trator");
        Peças Cabine3 = new Cabine("cabine3",560.00,10,"M",
                "Banco Para Trator Agrícola ");
        Peças.listaPeças.add(Cabine1);
        Peças.listaPeças.add(Cabine2);
        Peças.listaPeças.add(Cabine3);

        Peças Correia1 = new Correia("correia1",1291.60,100,"Em v","motor");
        Peças Correia2 = new Correia("correia2",65.27,80,"Correia Hélice","Radiador");
        Peças Correia3 = new Correia("correia3",1549.00,7,"Correia Dentada ","entre os tensores e polias");
        Peças.listaPeças.add(Correia1);
        Peças.listaPeças.add(Correia2);
        Peças.listaPeças.add(Correia3);

        Peças Eletrica1 = new Eletrica("eletrica1",452.00,3,"35ah 12v","Trator Husqvarna Lth 1842");
        Peças Eletrica2 = new Eletrica("eltrica2",363.90,100,"30ah 12v","Colheitadeira Case");
        Peças Eletrica3 = new Eletrica("eltrica3",959.99,2,"100ah 12v","Ford Cargo Mb 709");
        Peças.listaPeças.add(Eletrica1);
        Peças.listaPeças.add(Eletrica2);
        Peças.listaPeças.add(Eletrica3);

    while (op != 9) {

        System.out.println("Digite 1 para Entrar como Administrador");
        System.out.println("Digite 2 para Fazer Cadastro Cliente");
        System.out.println("Digite 3 para Comprar");
        System.out.println("Digite 9 para sair");

        op = scn.nextInt();

        if (op == 1) {
            do {
                System.out.println("Digite a senha de administrador:");
                String senhaadm = scn.next();
                if (senhaadm.equalsIgnoreCase("adm")) {
                    System.out.println("\"Senha correta!!! Bem vindo(a)!!!\"");
                    while (op != 12) {
                        System.out.println("Digite 1 para adicionar peça");
                        System.out.println("Digite 2 para vizualizar o estoque");
                        System.out.println("Digite 3 para alterar peça");
                        System.out.println("Digite 4 para deletar peça");
                        System.out.println("Digite 12 para sair");
                        op = scn.nextInt();
                        if (op == 1) {
                            System.out.println("Digite 1 para Adicionar Motor");
                            System.out.println("Digite 2 para Adicionar Cabine");
                            System.out.println("Digite 3 para Adicionar Correia");
                            System.out.println("Digite 4 para Adicionar Eletrica");
                            System.out.println("Digite 15 para voltar");
                            op2 = scn.nextInt();
                            switch (op2) {
                                case 1:
                                    System.out.println("Adicionando Motor");
                                    Motor.adicionarPeça();
                                    break;
                                case 2:
                                    System.out.println("Adicionando Cabine");
                                    Cabine.adicionarPeça();
                                    break;
                                case 3:
                                    System.out.println("Adicionando Correia");
                                    Correia.adicionarPeça();
                                    break;
                                case 4:
                                    System.out.println("Adicionando Eletrica");
                                    Eletrica.alterarPeça();
                                    break;
                                case 12:
                                    break;
                            }

                        } else if (op == 2) {
                            Peças.vizualizarPeça();
                        } else if (op == 3) {
                            System.out.println("Digite 1 para Alterar alguma peça Motor");
                            System.out.println("Digite 2 para Alterar alguma peça Cabine");
                            System.out.println("Digite 3 para Alterar alguma peça Correia");
                            System.out.println("Digite 4 para Alterar alguma peça  Eletrica");
                            System.out.println("Digite 20 para voltar");
                            op3 = scn.nextInt();
                            switch (op3) {
                                case 1:
                                    System.out.println("Alterando alguma peça Motor");
                                    try {
                                        Motor.alterarPeça();
                                    } catch (IndexOutOfBoundsException e) {
                                        System.err.println("Produto não encontrado no estoque");

                                    }
                                    break;
                                case 2:
                                    System.out.println("Alterando alguma peça Cabine");
                                    try {
                                        Cabine.alterarPeça();
                                    } catch (IndexOutOfBoundsException e) {
                                        System.err.println("Produto não encontrado no estoque");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Alterando alguma peça Correia");
                                    try {
                                        Correia.alterarPeça();
                                    } catch (IndexOutOfBoundsException e) {
                                        System.err.println("Produto não encontrado no estoque");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Alterando alguma peça Eletrica");
                                    try {
                                        Eletrica.alterarPeça();
                                    } catch (IndexOutOfBoundsException e) {
                                        System.err.println("Produto não encontrado no estoque");
                                    }
                                    break;
                                case 20:
                                    break;
                            }
                        } else if (op == 4) {
                            try {
                                Motor.removerPeça();
                            } catch (IndexOutOfBoundsException e) {
                                System.err.println("Produto não encontrado no estoque");
                            }

                        }
                    }
                    validarSenhaAdm = false;
                } else {
                    try {
                        throw new VerificarSenha();
                    } catch (VerificarSenha e) {
                        System.err.println(e.getMessage());
                    }
                }
            } while (validarSenhaAdm == true);
        } else if (op == 3) {
            try {
                System.out.println("Digite sua senha");
                String d = scn.next();
                System.out.println(Cliente.Ids);
                if (Cliente.Ids.contains(d)) {
                    try {
                        Cliente.comprar();
                    }catch (IndexOutOfBoundsException e) {
                        System.err.println("Produto não encontrado no estoque");
                    }
                }else {
                    try {
                        throw new ErroSenhaCliente();
                    } catch (ErroSenhaCliente r ) {
                        System.err.println(r.getMessage());
                    }
                }
            }catch (InputMismatchException e){
                System.err.println("Senha incorreta tente novamente");
            }

        }else if (op == 2) {
            try {
                do {
                    Cliente.addClientes();
                    ex = false;
                } while (ex == true);
            } catch (InputMismatchException e) {
                System.err.println("O cliente ja existe");
                }
            }
        }
    }
}
