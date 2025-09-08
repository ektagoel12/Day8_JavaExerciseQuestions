package tech.zeta.collections;

import tech.zeta.collections.exceptions.B1_songAlreadyPresentException;
import tech.zeta.collections.exceptions.B1_songNotFoundException;

import java.util.LinkedList;

//      1. Create a LinkedList of strings representing a playlist of songs.
//      Implement methods to add a song to the end of the playlist,
//      add a song to the beginning of the playlist,
//      and remove a song from the playlist.
public class B1_playlist {
    private LinkedList<String> songs;

    public B1_playlist(){
        songs= new LinkedList<>();
    }

    public void addSongAtLast(String song){
        try{
            if(songs.contains(song)){
                throw new B1_songAlreadyPresentException(song+ " is already present in the playlist");
            }
            songs.addLast(song);
            System.out.println(song+ " added to the end of playlist");
        } catch(B1_songAlreadyPresentException e){
            System.out.println("Error "+ e.getMessage());
        }
    }

    public void addSongAtBeginning(String song){
        try{
            if(songs.contains(song)){
                throw new B1_songAlreadyPresentException(song+ " is already present in the playlist");
            }
            songs.addFirst(song);
            System.out.println(song+ " added to the beginning of playlist");
        } catch(B1_songAlreadyPresentException e){
            System.out.println("Error "+ e.getMessage());
        }
    }

    public void removeSong(String song){
        try{
            if(!songs.contains(song)){
                throw new B1_songNotFoundException(song+ " is not present in the playlist");
            }
            songs.remove(song);
            System.out.println(song+ " removed from the playlist");
        } catch(B1_songNotFoundException e){
            System.out.println("Error "+ e.getMessage());
        }
    }

    public void displayPlaylist() {
        System.out.println("\nCurrent Playlist:");
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (String song : songs) {
                System.out.println(song);
            }
        }
    }
}
