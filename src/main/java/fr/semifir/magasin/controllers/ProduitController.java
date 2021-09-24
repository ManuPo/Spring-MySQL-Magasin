package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Produit;
import fr.semifir.magasin.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @PostMapping("")
    public Produit save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @GetMapping("{id}")
    public Optional<Produit> findById(@PathVariable Long id) {
        return produitService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        produitService.deleteById(id);
    }
}
