package fr.semifir.magasin.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prix")
    private Double prix;

    @ManyToMany(mappedBy = "produits")
    private Set<Commande> commandes;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="categorie_id", referencedColumnName = "id")
    private Categorie categorie;
}
