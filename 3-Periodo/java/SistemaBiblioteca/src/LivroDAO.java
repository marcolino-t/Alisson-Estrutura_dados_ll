import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class LivroDAO {
    public void inserir(Livro livro){
        ConectaDB conexao = new ConectaDB();
        String sql = "INSERT INTO livro(titulo,autor,ano) VALUES('?','?',?)";
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setString(1,livro.getTitulo());
            pst.setString(2,livro.getAutor());
            pst.setString(3,livro.getAno());
            pst.execute();
            
            System.out.println("Inserção ok: " + livro);
            

        }catch (Exception e){
            System.out.println("Falha na inserção: " + e.getMessage());
            
            
        }

    }

    public LinkedList<Livro> consultarTodos(){
        ConectaDB conexao = new ConectaDB();
        String sql = "SELECT * FROM livro";
        LinkedList<Livro> lista = new LinkedList<Livro>();
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            //executar consulta
            ResultSet resultados = pst.executeQuery();
            //percorrer resultados
            while (resultados.next()) {
                //recuperar dados
                String titulo = resultados.getString("titulo");
                String autor = resultados.getString("autor");
                String ano = resultados.getString("ano");
                //criar objeto java
                Livro obj = new Livro(titulo);
                obj.setAutor(autor);
                obj.setAno(ano);
                // adiciona na lista
                lista.add(obj);
            }
            
        }catch (Exception e){
            System.out.println("Falha na consulta: " + e.getMessage());
        }
        return null;
        
    }
}

