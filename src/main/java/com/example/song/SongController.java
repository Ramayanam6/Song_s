/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.song;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

import com.example.song.SongService;
import com.example.song.Song;

@RestController

public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")

    public ArrayList<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/songs/{songId}")

    public Song getSongById(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);
    }

    @PostMapping("/songs")

    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")

    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")

    public void deleteSong(@PathVariable("songId") int songid) {
        songService.deleteSong(songId);
    }
}