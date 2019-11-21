

import dados.Aluno;
import negocio.AlunoBO;
import negocio.NegocioException;

public class TestaAlunoBO {
    public static void main(String[] args) {
        AlunoBO bo = new AlunoBO();
        Aluno aluno = new Aluno();
        aluno.setMatricula(2019200);
        aluno.setNome("Joao");
        try{
        bo.incluir(aluno);
        aluno.setId(1);
        bo.consultar(aluno);
        aluno.setId(200);
        bo.excluir(aluno);
        
        }catch (NegocioException ex){
        System.err.println(ex.getMessage());
        }
        
        
}
}