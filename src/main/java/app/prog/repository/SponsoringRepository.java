package app.prog.repository;

import app.prog.model.SponsoringEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsoringRepository extends JpaRepository<SponsoringEntity, Integer> {
}
