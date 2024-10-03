package com.example.practicasap.Repositories;

import com.example.practicasap.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
