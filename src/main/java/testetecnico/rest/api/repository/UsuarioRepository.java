package testetecnico.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import testetecnico.rest.api.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Optional<Usuario> findByCodigo(Integer codigo);
//
//    boolean existsByCodigo(Integer codigo);
    @Transactional
    Long deleteByCodigo(Integer codigo);

    boolean existsByCodigo(Integer codigo);

//    List<Object> findByCodigo(Integer codigo);
}
