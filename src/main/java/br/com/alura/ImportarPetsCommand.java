package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

public class ImportarPetsCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConfiguration);
            petService.importarPets();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
