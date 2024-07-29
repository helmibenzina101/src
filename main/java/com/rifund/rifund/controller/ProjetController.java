package main.java.com.rifund.rifund.controller;

import com.example.demo.model.Projet;
import com.example.demo.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/projets")
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @GetMapping
    public List<Projet> getAllProjets() {
        return projetService.getAllProjets();
    }

    @GetMapping("/{id}")
    public Projet getProjetById(@PathVariable String id) {
        return projetService.getProjetById(id);
    }

    @GetMapping("/idcommun/{idcommun}")
    public Projet getProjetByIdcommun(@PathVariable UUID idcommun) {
        return projetService.getProjetByIdcommun(idcommun);
    }

    @PostMapping
    public Projet createProjet(@RequestBody Projet projet) {
        return projetService.createProjet(projet);
    }

    @PutMapping("/{id}")
    public Projet updateProjet(@PathVariable String id, @RequestBody Projet projet) {
        return projetService.updateProjet(id, projet);
    }

    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable String id) {
        projetService.deleteProjet(id);
    }
}
