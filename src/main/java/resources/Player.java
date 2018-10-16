package resources;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private int id;
    private String normal_position;
    private String number;
    private int person_id;
    private int team_id;
}

