
package negocio;

import java.util.List;


public interface BO<t> {
    void validar(t entidade) throws NegocioException;
    void incluir(t entidade) throws NegocioException;
    void alterar(t entidade) throws NegocioException;
    void excluir(t entidade) throws NegocioException;
    t consultar (t entidade) throws NegocioException;
    List<t> listar() throws NegocioException;
}
