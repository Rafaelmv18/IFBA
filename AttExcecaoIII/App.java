public class App{
    public static void main(String[] args){
        Sistema sistema = new Sistema();

        try{
            Cadastro professor1 = new Professor("Rafael", 20, "Masculino", "12345678912", "RG123456", "Rua A, 123");
            

            
        }catch (Excecao e){
            System.out.println(e.getMessage());
        }
    }
}