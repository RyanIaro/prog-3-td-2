package app.prog.repository;

import app.prog.model.SponsorEntity;
import app.prog.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
}
