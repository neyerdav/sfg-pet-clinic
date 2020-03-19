package dev.neyerdavid.sfgpetclinic.services;

import java.util.Set;

import dev.neyerdavid.sfgpetclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
