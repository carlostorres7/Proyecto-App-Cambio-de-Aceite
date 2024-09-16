package com.example.api_cambio_aceite.services;

import com.example.api_cambio_aceite.models.Aceites;
import com.example.api_cambio_aceite.repositories.IAceiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AceiteService {

    private final IAceiteRepository aceiteRepository;

    public AceiteService(IAceiteRepository aceiteRepository) {
        this.aceiteRepository = aceiteRepository;
    }

    public List<Aceites> getAllAceites() {
        return aceiteRepository.findAll();
    }

    public Aceites saveAceite(Aceites aceites){
        return aceiteRepository.save(aceites);
    }

    public void deleteAceite(Long id){
        aceiteRepository.deleteById(id);
    }

    public Aceites getAceiteById(Long id){
       return aceiteRepository.findById(id)
               .orElseThrow(()-> new RuntimeException("Aceite no encontrado"));
    }

    public Aceites updateAceite(Long id, Aceites aceiteActualizado){
        Aceites aceiteExistente = aceiteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aceite no encontrado"));

        aceiteExistente.setMarca(aceiteActualizado.getMarca());
        aceiteExistente.setReferencia(aceiteActualizado.getReferencia());
        aceiteExistente.setCategoria(aceiteActualizado.getCategoria());

        return aceiteRepository.save(aceiteExistente);
    }
}
