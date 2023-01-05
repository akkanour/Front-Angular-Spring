package com.example.gestionMateriel.ws;

import com.example.gestionMateriel.Beans.Materiel;
import com.example.gestionMateriel.Services.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/materiels")
public class MaterielWs {

    @Autowired
    MaterielService materielService;

    @PostMapping
    public Boolean create(@RequestBody Materiel materiel) {
        return materielService.create(materiel);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Materiel materiel) {
        return materielService.update(materiel);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return materielService.delete(id);
    }

    @GetMapping
    public List<Materiel> findAll() {
        return materielService.findAll();
    }


}
