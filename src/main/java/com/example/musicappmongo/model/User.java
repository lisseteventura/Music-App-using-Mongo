package com.example.musicappmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//we use documents in mongo instead of entity
@Document
public class User {
    @Id
    String id;
    //unique serial key
    @Indexed(unique = true)
    private String username;
    private String password;

    //add a reference for songs
    @DBRef
    private List<Song> songs;

    public User () {}

    public List<Song> getSongs(){
        return songs;
    }
    public void setSongs(List<Song> songs){
        this.songs = songs;
    }

    public String getId (){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
