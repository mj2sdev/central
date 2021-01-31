package io.mj2sdev.central.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mj2sdev.central.model.Doodle;
import io.mj2sdev.central.repository.mongodb.DoodleRepo;

@CrossOrigin
@RestController
@RequestMapping("/murus")
public class MurusController {

    @Autowired
    private DoodleRepo doodleRepo;

    @GetMapping("/pullDoodle")
    public List<Doodle> pullDoodle() {
        return doodleRepo.findAll();
    }

    @PostMapping("/pushDoodle")
    public String pushDoodle(@RequestBody Doodle doodle) {
        System.out.println(doodle.toString());
        doodleRepo.insert(doodle);
        return "success";
    }
}
