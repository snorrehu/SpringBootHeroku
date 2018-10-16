package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import resources.Player;
import resources.PlayerRepository;

import java.util.List;

@RestController
public class PlayerResource {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/players")
    public List<Player> retrieveAllPlayers() {
        return playerRepository.findAll();
    }
}
