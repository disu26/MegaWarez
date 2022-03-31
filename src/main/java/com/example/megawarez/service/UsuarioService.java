package com.example.megawarez.service;

import com.example.megawarez.dao.UsuarioDao;
import com.example.megawarez.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> list() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {
        usuario.setId(id);
        return usuarioDao.save(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public Optional<Usuario> findContact(Usuario usuario) {
        return usuarioDao.findById(usuario.getId());
    }
}
