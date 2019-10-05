package com.example.musicappmongo.repository;

import com.example.musicappmongo.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, String> {
}
