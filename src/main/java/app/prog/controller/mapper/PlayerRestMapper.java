package app.prog.controller.mapper;

import app.prog.controller.response.MatchResponse;
import app.prog.controller.response.PlayerResponse;
import app.prog.model.MatchEntity;
import app.prog.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
