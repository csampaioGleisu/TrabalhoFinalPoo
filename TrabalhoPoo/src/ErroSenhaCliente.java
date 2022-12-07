public class ErroSenhaCliente extends Exception{
    @Override
    public String getMessage() {
        return "Não existe este Cliente";
    }
}
