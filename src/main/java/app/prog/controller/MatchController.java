package app.prog.controller;

import app.prog.controller.mapper.MatchRestMapper;
import app.prog.controller.response.MatchResponse;
import app.prog.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;
    private final MatchRestMapper mapper;

    @GetMapping("/teams")
    public List<MatchResponse> getMatches() {
        return service.getMatches().stream().map(mapper::toRest).toList();
    }
}
