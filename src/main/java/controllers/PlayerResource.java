package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import resources.Player;
import resources.PlayerRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerResource {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/players")
    public List<Player> retrieveAllPlayers() {
        return playerRepository.findAll();
    }

    /*
    @GetMapping("/players/{id}")
    public Player retrieveStudent(@PathVariable int id) {
        Optional<Player> player = playerRepository.findById(id);

        if (!player.isPresent())
            throw new PlayerNotFoundException("id-" + id);

        return player.get();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudent.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable long id) {

        Optional<Student> studentOptional = studentRepository.findById(id);

        if (!studentOptional.isPresent())
            return ResponseEntity.notFound().build();

        student.setId(id);

        studentRepository.save(student);

        return ResponseEntity.noContent().build();
    }
    */
}
