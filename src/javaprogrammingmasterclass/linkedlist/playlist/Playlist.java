package javaprogrammingmasterclass.linkedlist.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private ArrayList<Album> albums;
    private LinkedList<Song> playList;

    public Playlist() {
        this.playList = new LinkedList<>();
        this.albums = new ArrayList<>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public void setPlayList(LinkedList<Song> playList) {
        this.playList = playList;
    }

    public Album getAlbumByName(String albumName) {

        if (checkIfAlbumPresent(albumName)) {
            for (int i = 0; i <= albums.size(); i++
            ) {
                if (albums.get(i).getName().equals(albumName)) {
                    return albums.get(i);
                }

            }
        }
        System.out.println("Album not found!");
        return null;
    }

    public boolean addSongToPlaylist(String albumName, String title) {
        if (getAlbumByName(albumName) != null && getAlbumByName(albumName).getSongByName(title) != null) {
            playList.add(getAlbumByName(albumName).getSongByName(title));
            return true;
        } else
            System.out.println("Adding song to playlist was unsuccessful!");
        return false;
    }

    public boolean addAlbum(Album album) {
        if (!checkIfAlbumPresent(album.getName())) {
            albums.add(album);
            return true;
        } else
            System.out.println("Album is already present!");
        return false;
    }

    private boolean checkIfAlbumPresent(String albumName) {
        boolean isPresent = false;
        if (albums.isEmpty()) {
            return isPresent;
        }
        for (int i = 0; i < albums.size(); i++) {

            if (albums.get(i).getName().equals(albumName)) {
                isPresent = true;
            }
        }
        return isPresent;

    }

    public void play() {
        ListIterator<Song> listIterator = this.playList.listIterator();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        if (playList.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        } else {
            System.out.println("Playing: " + listIterator.next());
        }

        while (!quit) {
            String command = scanner.next();
            scanner.nextLine();

            switch (command.toLowerCase()) {
                case "next":
                    if (listIterator.hasNext()) {
                        System.out.println("You skipped to the next song" +
                                "which is: " + listIterator.next());
                    }
                    break;
                case "previous":
                    if (listIterator.hasPrevious()) {
                        System.out.println("You skipped to the previous song" +
                                "which is: " + listIterator.previous());
                    }
                    break;
                case "quit":
                    quit = true;
                    break;
            }
        }
    }
}
