package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<Client> findAll();
    public Client save(Client client);
    public Optional<Client> findById(Long id);
    public void deleteById(Long id);
}
