package com.example.api_cambio_aceite.services;

import com.example.api_cambio_aceite.models.Motocicletas;
import com.example.api_cambio_aceite.repositories.IMotocicletaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {
    private IMotocicletaRepository motocicletaRepository;

    public MotoService(IMotocicletaRepository motocicletaRepository) {
        this.motocicletaRepository = motocicletaRepository;
    }

    public List<Motocicletas> getAllMotocicletas(){
        return motocicletaRepository.findAll();
    }

    public Motocicletas saveMoto(Motocicletas motocicletas){
        return motocicletaRepository.save(motocicletas);
    }

    public void deleteMoto(Long id){
        motocicletaRepository.deleteById(id);;
    }

    public Motocicletas getMotoById(Long id){
        return motocicletaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Motocicleta no encontrada"));
    }

    public Motocicletas updateMoto(Long id, Motocicletas motoActualizada){
        Motocicletas motoExiste = motocicletaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Motocicleta no encontrada"));

        motoExiste.setPlaca(motoActualizada.getPlaca());
        motoExiste.setMarca(motoActualizada.getMarca());
        motoExiste.setReferencia(motoActualizada.getReferencia());
        motoExiste.setCliente_id(motoActualizada.getCliente_id());

        return motocicletaRepository.save(motoExiste);
    }
}
