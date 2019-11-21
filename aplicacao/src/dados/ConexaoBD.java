
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {

    private static Connection conexao;
    
    private ConexaoBD() {
    }
    
    public static Connection getConexao() throws DadosException {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection("jdbc:mysql://localhost/cadastro","root","");
            } catch (ClassNotFoundException ex) {
                throw new DadosException("Drive JDBC não carregado", ex);
            } catch (SQLException ex) {
                throw new DadosException("Erro ao conectar com o MySql!", ex);
                
            }
        }
        
        return conexao;
    }
}
