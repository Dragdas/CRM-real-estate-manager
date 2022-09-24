package pl.crm.app.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.crm.app.domain.models.Owner;
import pl.crm.app.errorHandling.exceptions.OwnerNotFoundException;
import pl.crm.app.repositories.OwnerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwner(final Long ownerId) throws OwnerNotFoundException {
        return ownerRepository.findById(ownerId).orElseThrow(OwnerNotFoundException::new);
    }

    public Owner saveOwner(final Owner owner) {
        return ownerRepository.save(owner);
    }

    public void deleteOwner(final Long ownerId) {
        ownerRepository.deleteById(ownerId);
    }
}
