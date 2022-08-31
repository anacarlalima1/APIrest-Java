package testetecnico.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testetecnico.rest.api.model.Usuario;
import testetecnico.rest.api.repository.UsuarioRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/api/usuario/listarTodos")
    public List<Usuario> listarTodos(){
        return (List<Usuario>) repository.findAll();
    }

    @GetMapping("/api/usuario/listar/{codigo}")
    public Usuario listar(@PathVariable Integer codigo) {
        return (Usuario) repository.findByCodigo(codigo).get();
    }

    @PostMapping("/api/usuario/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/api/usuario/deletar/{codigo}")
    public void deletar(@PathVariable Integer codigo) {
        repository.deleteByCodigo(codigo);
    }

    @PutMapping("/api/usuario/alterar")
    public Usuario alterar(@RequestBody Usuario usuario) {
        if (repository.existsByCodigo(usuario.getCodigo())) {
            repository.save(usuario);
        }
        return usuario;
    }
}
//    @GetMapping(path = "/api/usuario/{codigo}")
//    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
//        return repository.findByCodigo(codigo)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping(path = "/api/usuario/salvar")
//    public Usuario salvar(@RequestBody Usuario usuario) {
//        return repository.save(usuario);
//    }
//
//    @PutMapping(path = "/api/usuario/alterar")
//    public Usuario alterar(@RequestBody Usuario usuario) {
//        if (repository.existsByCodigo(usuario.getCodigo())) {
//            repository.save(usuario);
//        }
//        return usuario;
//    }
//
//    @DeleteMapping(path = "/usuario/{codigo}")
//    public void deletar(@PathVariable("codigo") Integer codigo) {
//        repository.deleteById(codigo);
//    }
