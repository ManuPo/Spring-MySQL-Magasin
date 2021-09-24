package fr.semifir.magasin.controllers;

import fr.semifir.magasin.models.Client;
import fr.semifir.magasin.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @GetMapping("{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
