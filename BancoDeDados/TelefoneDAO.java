import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TelefoneDAO {

    public void incluir(Telefone telefone) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO TELEFONE (nome) VALUES (?)");
           
            stmt.setString(1, telefone.getNome());

            stmt.executeUpdate();
            
            System.out.println("Telefone " + telefone.getNome() + " inserido com sucesso");

        } catch (SQLException ex) {
            ex.printStackTrace();

              throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    public void alterar(Telefone telefone) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE TELEFONE SET nome = ? where id = ? ");
           
            stmt.setString(1, telefone.getNome());

            stmt.setInt(2, telefone.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Telefone " + telefone.getNome() + " alterado com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    public void excluir(Telefone telefone) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE from TELEFONE WHERE id = ?");
           
            stmt.setInt(1, telefone.getId());
            
            
            stmt.executeUpdate();
            
            System.out.println("Telefone " + telefone.getNome() + " excluído com sucesso");


        } catch (SQLException ex) {
            ex.printStackTrace();

             throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }
    
   public List<Telefone> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Telefone> telefones = new ArrayList<Telefone>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome from TELEFONE");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Telefone telefone =  new Telefone();
              
               telefone.setId(rs.getInt("id"));
               telefone.setNome(rs.getString("nome"));
              
               
               telefone.add(telefone);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return telefones; 
   }
}