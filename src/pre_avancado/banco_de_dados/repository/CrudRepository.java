package pre_avancado.banco_de_dados.repository;

import java.util.List;

// parametro K é  ID e T é o tipo da entidade
public interface CrudRepository <K,T>{
    T salvar(T entidade);

    List<T> listar();

    void deletar(K id);

    T atualizar(T entidade);
}
