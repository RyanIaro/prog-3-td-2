package app.prog.controller;

import app.prog.controller.mapper.PlayerRestMapper;
import app.prog.controller.response.PlayerResponse;
import app.prog.model.PlayerEntity;
import app.prog.model.TeamEntity;
import app.prog.service.PlayerService;
import app.prog.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream().map(mapper::toRest).toList();
    }
}
