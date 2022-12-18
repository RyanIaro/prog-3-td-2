package app.prog.repository;

import app.prog.model.MatchEntity;
import app.prog.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Integer> {
}
