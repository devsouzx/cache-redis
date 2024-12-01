package com.devsouzx.cache.services;

import com.devsouzx.cache.entity.Empresa;
import com.devsouzx.cache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Cacheable("empresas")
    public List<Empresa> findAllComCache() {
        return findAll();
    }

    public List<Empresa> findAll() {
        return (List<Empresa>) empresaRepository.findAll();
    }
}
