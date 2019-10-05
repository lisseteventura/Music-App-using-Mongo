package com.example.musicappmongo.service;

import com.example.musicappmongo.model.Song;

import java.util.List;

public interface SongService {
    //method to add songs and get list of songs
    public Song saveSong(Song newSong);
    public List<Song> listSongs();

}
