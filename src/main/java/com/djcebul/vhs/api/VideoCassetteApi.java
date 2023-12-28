package com.djcebul.vhs.api;

import com.djcebul.vhs.dao.entity.VideoCassette;
import com.djcebul.vhs.manager.VideoCassetteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vhs")
public class VideoCassetteApi {

    private VideoCassetteManager videoCassetteManager;

    @Autowired
    public VideoCassetteApi(VideoCassetteManager videoCassetteManager) {
        this.videoCassetteManager = videoCassetteManager;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCassetteManager.findAll();
    }
    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index) {
        //Optional<VideoCassette> first = videoCassettes.stream().filter(e -> e.getId() == index).findFirst();
        return videoCassetteManager.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassetteManager.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassetteManager.save(videoCassette);
    }
    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) {
        videoCassetteManager.deleteById(index);
    }

}
