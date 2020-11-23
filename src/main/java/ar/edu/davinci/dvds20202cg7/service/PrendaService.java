package ar.edu.davinci.dvds20202cg7.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.davinci.dvds20202cg7.model.Prenda;


public interface PrendaService {
    
    public List<Prenda> listAll();
    public Page<Prenda> list(Pageable pageable);
    public Prenda findById(Long id);
    public Prenda save(Prenda prenda);
    public void delete(Prenda prenda);
    public long count();
}