package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.services.CategorieService;
import fr.semifir.magasin.models.Categorie;
import fr.semifir.magasin.repositories.CategorieRepository;

import java.util.List;
import java.util.Optional;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository repo;

    public CategorieServiceImpl(CategorieRepository repo) {
        this.repo = repo;
    }

    public List<Categorie> findAll() {
        return repo.findAll();
    }

    public Categorie save(Categorie categorie) {
        return repo.save(categorie);
    }

    public Optional<Categorie> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
