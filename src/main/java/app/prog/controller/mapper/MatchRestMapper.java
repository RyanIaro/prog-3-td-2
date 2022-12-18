package app.prog.controller.mapper;

import app.prog.controller.response.MatchResponse;
import app.prog.model.MatchEntity;
import org.springframework.stereotype.Component;

@Component
public class MatchRestMapper {
    public MatchResponse toRest(MatchEntity domain) {
        return MatchResponse.builder()
                .id(domain.getId())
                .date(domain.getDate())
                .teamA(domain.getTeamA().getName())
                .teamB(domain.getTeamB().getName())
                .build();
    }
}
