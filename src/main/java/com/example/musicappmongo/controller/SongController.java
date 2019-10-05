package com.example.musicappmongo.controller;

import com.example.musicappmongo.model.Song;
import com.example.musicappmongo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/list")
    public List<Song> listSongs(){
        return songService.listSongs();
    }

    @PostMapping
    public Song saveSong(@RequestBody Song newSong){
        return songService.saveSong(newSong);
    }
}
