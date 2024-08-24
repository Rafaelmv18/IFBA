public class App {
    public static void main(String[] args) {
        Produto produto = new Produto(10, 10);

        try {
            produto.compra();

        }catch (Exception e) { 
            System.out.println("Erro: " + e.getMessage());
            
        }catch (Excecao e) { 
            System.out.println("Erro específico: " + e.getMessage());
        }
    }
}

// Resposta
// O programa para de rodar e da erro, falando que um dos erros ja foi encontrado