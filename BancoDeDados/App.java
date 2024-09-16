public class App {
	public static void main(String[] args) {

		TelefoneDAO telefoneDAO = new TelefoneDAO();
		
		Telefone telefone = new Telefone();
		
		telefone.setNome("Rafael");
		
		telefoneDAO.incluir(telefone);
		
		
		telefone.setId(1);
		
		telefoneDAO.excluir(telefone);
	}
}