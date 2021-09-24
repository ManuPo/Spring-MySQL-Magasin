package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Categorie;

import java.util.List;
import java.util.Optional;

public interface CategorieService {

    public List<Categorie> findAll();
    public Categorie save(Categorie categorie);
    public Optional<Categorie> findById(Long id);
    public void deleteById(Long id);
}
