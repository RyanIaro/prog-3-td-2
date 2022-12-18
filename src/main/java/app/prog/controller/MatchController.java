package app.prog.controller;

import app.prog.model.MatchEntity;
import app.prog.model.TeamEntity;
import app.prog.service.MatchService;
import app.prog.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;

    @GetMapping("/teams")
    public List<MatchEntity> getMatches() {
        return service.getMatches();
    }
}
