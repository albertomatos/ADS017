
package negocio;

import dados.Aluno;
import dados.AlunosDAO;
import dados.DadosException;
import java.util.ArrayList;
import java.util.List;


public class AlunoBO implements BO<Aluno> {
   
    @Override
    public void validar(Aluno entidade) throws NegocioException {
      if(entidade.getMatricula()==0){
      throw new NegocioException("campo matricula obrigatorio");
      
      }
      if(entidade.getNome() == null || entidade.getNome() .isEmpty()){
      throw new NegocioException("campo nome é obrigatorio");
      
      }
      
    }
    
    @Override
    public void incluir(Aluno entidade) throws NegocioException {
       validar(entidade);
       AlunosDAO dao = new AlunosDAO();
        try{
        dao.incluir(entidade);
        }catch(DadosException ex){
        throw new NegocioException("erro", ex);
        }     
    }

    @Override
    public void alterar(Aluno entidade) throws NegocioException {
       validar(entidade);
       consultar(entidade);
       AlunosDAO dao = new AlunosDAO();
       try{
       dao.alterar(entidade);
       }catch(DadosException ex){
        throw new NegocioException("erro", ex);
        }     
    }

    @Override
    public void excluir(Aluno entidade) throws NegocioException {
       consultar(entidade);
       AlunosDAO dao = new AlunosDAO();
       try{
       dao.excluir(entidade.getId());
       }catch(DadosException ex){
        throw new NegocioException("erro", ex);
        }     
    }

    @Override
    public Aluno consultar(Aluno entidade) throws NegocioException {
        Aluno aluno = new Aluno();
        AlunosDAO dao = new AlunosDAO();
        try{
        aluno = dao.consultar(entidade.getId());
        } catch(DadosException ex){
        throw new NegocioException("erro", ex);
        }    
        if(aluno ==null || aluno.getId() == 0){
        throw new NegocioException("Aluno não encontrado");
        }
        return aluno;
    }

    @Override
    public List<Aluno> listar() throws NegocioException {
       List<Aluno> lista =  new ArrayList<Aluno>();
       AlunosDAO dao = new AlunosDAO();
       try{
       lista = dao.listar();
        } catch(DadosException ex){
        throw new NegocioException("erro", ex);
        }
       if(lista ==null || lista.isEmpty()){
        throw new NegocioException("Nenhum aluno encontrado");
        }
        return lista;
    }

   
}
