package dev.neyerdavid.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.neyerdavid.sfgpetclinic.model.Owner;
import dev.neyerdavid.sfgpetclinic.model.Vet;
import dev.neyerdavid.sfgpetclinic.services.OwnerService;
import dev.neyerdavid.sfgpetclinic.services.VetService;
import dev.neyerdavid.sfgpetclinic.services.map.OwnerServiceMap;
import dev.neyerdavid.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService owenerService;
    private final VetService vetService;

    public DataLoader(OwnerService owenerService, VetService vetService) {
        this.owenerService = owenerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");
        owenerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael");
        owner2.setLastName("Weston");
        owenerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);
        System.out.println("Loaded data");
    }
}
