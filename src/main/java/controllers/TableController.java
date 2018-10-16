package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class TableController {

    @RequestMapping(path = "/tables")
    @ResponseBody
    String home() {
        return "Tables goes here!!";
    }

}
