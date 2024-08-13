public class App{
    public static void main(String[] args){
        Loja loja = new Loja("Vende Tudo", "varejo", 1995);

        Vendedor vendedor1 = new Vendedor("Rafael", 30);
        Vendedor vendedor2 = new Vendedor("João", 45);


        loja.admitirVendedor(vendedor1);
        loja.demitirVendedor(vendedor2);
    }
}