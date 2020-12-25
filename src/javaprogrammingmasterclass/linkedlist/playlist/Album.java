package javaprogrammingmasterclass.linkedlist.playlist;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public boolean addSong(Song song) {
        if (!checkIfSongPresent(song.getTitle())) {
            songs.add(song);
            return true;
        } else
            System.out.println("Song is already present!");
        return false;
    }

    public void addSong(String title, double duration) {
        Song song = new Song(title, duration);

        if (!checkIfSongPresent(song.getTitle()))
            songs.add(song);
        else
            System.out.println("Song is already present!");
    }

    private boolean checkIfSongPresent(String title) {

        boolean isPresent = false;
        if (songs.isEmpty()) {
            return isPresent;
        }
        for (int i = 0; i < songs.size(); i++) {

            if (songs.get(i).getTitle().equals(title)) {
                isPresent = true;
            }
        }


        return isPresent;
    }

    public Song getSongByName(String title) {
        if (checkIfSongPresent(title)) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getTitle().equals(title)) {
                    return songs.get(i);
                }
            }
        }
        System.out.println("Song not found!");
        return null;
    }


    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
