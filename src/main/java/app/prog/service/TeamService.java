package app.prog.service;

import app.prog.model.TeamEntity;
import app.prog.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getTeams() {
        return repository.findAll();
    }

    /*public List<TeamEntity> createTeams(List<TeamEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }

    public TeamEntity deleteTeam(Integer id) {
        Optional<TeamEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.delete(optional.get());
            return optional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }*/
}
