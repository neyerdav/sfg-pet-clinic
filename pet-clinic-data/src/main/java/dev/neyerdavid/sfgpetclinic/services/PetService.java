package dev.neyerdavid.sfgpetclinic.services;

import java.util.Set;


import dev.neyerdavid.sfgpetclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
