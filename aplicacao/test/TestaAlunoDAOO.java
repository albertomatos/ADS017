
import dados.Aluno;
import dados.AlunosDAO;
import dados.DadosException;
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestaAlunoDAOO {
    public static void main(String[] args) {
       AlunosDAO dao = new AlunosDAO();
        try {  
            for( Aluno aluno : dao.listar()){
                System.out.println(aluno);
            }     
            
            Aluno aluno = new Aluno();
            aluno.setMatricula(2019300);
            aluno.setNome("Paulo");
            dao.incluir(aluno);
            
            aluno= dao.consultar(1);
            aluno.setNome("Angelica");
            dao.alterar(aluno);
            
            dao.excluir(2);
            
            
        } catch (DadosException ex) {
            System.err.println(ex.getMessage() + ex.getCause() .getMessage());
        }
        
        
        
        
        
        
        
        
        
    }
  
}
