package main.java.com.rifund.rifund.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.UUID;

@Document(collection = "projets")
public class Projet {

    @Id
    private String id;

    private String titre;
    private Double objectif;
    private String videoUrl;
    private String localisation;
    private Instant creerA;
    private Instant modifierA;
    private String description;
    private String autresLiens;
    private String descriptiondebudget;
    private Integer duree;
    private String administrateurNotes;
    private byte[] image;
    private ProjetStatuts statuts;
    private UUID idcommun;

    // Getters and Setters
    // Constructors
}
