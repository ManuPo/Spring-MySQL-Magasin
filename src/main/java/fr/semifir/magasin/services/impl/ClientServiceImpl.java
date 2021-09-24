package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.services.ClientService;
import fr.semifir.magasin.models.Client;
import fr.semifir.magasin.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    private ClientRepository repo;

    public ClientServiceImpl(ClientRepository repo) {
        this.repo = repo;
    }

    public List<Client> findAll() {
        return repo.findAll();
    }

    public Client save(Client client) {
        return repo.save(client);
    }

    public Optional<Client> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
