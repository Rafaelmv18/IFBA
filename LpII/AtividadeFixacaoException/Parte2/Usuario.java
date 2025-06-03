public class Usuario{
    private String nome;
    private int idade;

    public void setNome(String nome) throws NomeInvalidoException{
        if(nome == null || nome.isEmpty()){
            throw new NomeInvalidoException("Nome vázio!");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) throws IdadeInvalidaException{
        if(idade < 18 || idade > 100){
            throw new IdadeInvalidaException("Idade inválida!");
        }
        this.idade = idade;
    }    
}   