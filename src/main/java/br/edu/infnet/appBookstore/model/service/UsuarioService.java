package br.edu.infnet.appBookstore.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.appBookstore.model.domain.Usuario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private Map<String, Usuario> mapaUsuarios = new HashMap<>();

    public void incluir(Usuario usuario) {
        mapaUsuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario obterPorEmail(String email) {
        return mapaUsuarios.get(email);
    }

    public Collection<Usuario> obterLista() {
        return mapaUsuarios.values();
    }
}
