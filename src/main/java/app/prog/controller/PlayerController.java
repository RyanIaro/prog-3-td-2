package app.prog.controller;

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

    @GetMapping("/players")
    public List<PlayerEntity> getPlayers() {
        return service.getPlayers();
    }
}
