package com.example.gestionMateriel.Dao;

import com.example.gestionMateriel.Beans.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielDao extends JpaRepository<Materiel, Long> {

}
