package com.icorrea.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icorrea.entity.Categoria;
import com.icorrea.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria inserir(Categoria obj) {
        obj.setDataCriacao(new Date());
        Categoria objNovo = categoriaRepository.saveAndFlush(obj);
        return objNovo;
    }

    public Categoria alterar(Categoria obj) {
        obj.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(obj);
    }

    public void excluir(Long id) {
        Categoria obj = categoriaRepository.findById(id).get();
        categoriaRepository.delete(obj);
    }
}
