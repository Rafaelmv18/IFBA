import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();

        try {
            System.out.println("Digite seu nome: ");
            String nome = teclado.nextLine();
            usuario.setNome(nome);

            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();
            usuario.setIdade(idade);

        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
