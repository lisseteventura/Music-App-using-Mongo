package com.example.musicappmongo.service;

import com.example.musicappmongo.model.Song;
import com.example.musicappmongo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public Song saveSong(Song newSong){
        return songRepository.save(newSong);
    }

    @Override
    public List<Song> listSongs(){
        return (List<Song>) songRepository.findAll();
    }
}
