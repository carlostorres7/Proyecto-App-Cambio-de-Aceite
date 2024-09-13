package com.example.api_cambio_aceite.repositories;

import com.example.api_cambio_aceite.models.Motocicletas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMotocicletaRepository extends JpaRepository<Motocicletas, Long> {

}
