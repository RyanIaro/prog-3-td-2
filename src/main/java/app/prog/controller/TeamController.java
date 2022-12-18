package app.prog.controller;

import app.prog.model.TeamEntity;
import app.prog.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;

    @GetMapping("/teams")
    public List<TeamEntity> getTeam() {
        return service.getTeams();
    }
}
