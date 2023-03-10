package app.prog.service;

import app.prog.model.SponsorEntity;
import app.prog.model.TeamEntity;
import app.prog.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<SponsorEntity> getSponsors() {
        return repository.findAll();
    }

    /*public List<SponsorEntity> createSponsors(List<SponsorEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<SponsorEntity> updateSponsors(List<SponsorEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public SponsorEntity deleteSponsor(Integer id) {
        Optional<SponsorEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }*/
}
