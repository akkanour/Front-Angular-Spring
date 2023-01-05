package com.example.gestionMateriel.Services;

import com.example.gestionMateriel.Beans.Materiel;
import com.example.gestionMateriel.Dao.MaterielDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterielService {

    @Autowired
    MaterielDao materielDao;

    public Boolean create(Materiel materiel) {

        Boolean test = false;

        if (materielDao.save(materiel) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Materiel materiel) {

        Boolean test = false;

        if (this.findById(materiel.getId()) != null) {
            materielDao.save(materiel);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            materielDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Materiel findById(Long id) {
        return materielDao.getById(id);
    }

    public List<Materiel> findAll() {
        return materielDao.findAll();
    }

}