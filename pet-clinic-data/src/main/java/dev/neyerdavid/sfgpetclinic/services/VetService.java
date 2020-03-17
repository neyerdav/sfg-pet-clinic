package dev.neyerdavid.sfgpetclinic.services;

import java.util.Set;

import dev.neyerdavid.sfgpetclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
