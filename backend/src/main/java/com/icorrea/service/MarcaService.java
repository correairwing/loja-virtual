package com.icorrea.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icorrea.entity.Marca;
import com.icorrea.repository.MarcaRepository;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca obj) {
        obj.setDataCriacao(new Date());
        Marca objNovo = marcaRepository.saveAndFlush(obj);
        return objNovo;
    }

    public Marca alterar(Marca obj) {
        obj.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(obj);
    }

    public void excluir(Long id) {
        Marca obj = marcaRepository.findById(id).get();
        marcaRepository.delete(obj);
    }
}
