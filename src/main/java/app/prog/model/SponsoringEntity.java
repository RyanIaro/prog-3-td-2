package app.prog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "have")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SponsoringEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private TeamEntity team;
    private SponsorEntity sponsor;
}
