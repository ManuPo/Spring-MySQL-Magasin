package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Commande;
import fr.semifir.magasin.services.CommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    @PostMapping("")
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @GetMapping("{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return commandeService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        commandeService.deleteById(id);
    }
}
