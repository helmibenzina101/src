package main.java.com.rifund.rifund.service;

import com.example.demo.model.Projet;
import com.example.demo.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    public Projet getProjetById(String id) {
        return projetRepository.findById(id).orElse(null);
    }

    public Projet getProjetByIdcommun(UUID idcommun) {
        return projetRepository.findByIdcommun(idcommun);
    }

    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public Projet updateProjet(String id, Projet projet) {
        if (projetRepository.existsById(id)) {
            projet.setId(id);
            return projetRepository.save(projet);
        } else {
            return null;
        }
    }

    public void deleteProjet(String id) {
        projetRepository.deleteById(id);
    }
}
