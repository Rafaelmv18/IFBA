public class Animal{
    public String Especie;
    public String DataNascimento; 
    public String Nome;
    public int NumeroRegistro;
    public String LocalNascimento;

    public AnimalZoologico(String Especie, String DataNascimento, String Nome, int NumeroRegistro, String LocalNascimento){
        this.Especie = Especie;
        this.DataNascimento = DataNascimento;
        this.Nome = Nome;
        this.NumeroRegistro = NuUmeroRegistro;
        this.LocalNascimento = LocalNascimento;
    }

    public cadastrar(String Especie, String DataNascimento, String Nome, int NumeroRegistro, String LocalNascimento){
        this.Especie = Especie;
        this.DataNascimento = DataNascimento;
        this.Nome = Nome;
        this.NumeroRegistro = NuUmeroRegistro;
        this.LocalNascimento = LocalNascimento;
    }

    public alterar(String Especie, String DataNascimento, String Nome, int NumeroRegistro, String LocalNascimento){
        this.cadastrar(Especie, DataNascimento, Nome, NumeroRegistro, LocalNascimento);
    }

    public informacoes(){
        System.out.println("Espécie: " + Especie);
        System.out.println("Data de Nascimento: " + DataNascimento);
        System.out.println("Nome: " + Nome);
        System.out.println("Número de Registro: " + NumeroRegistro);
        System.out.println("Local de Nascimento: " + LocalNascimento);

    }
}