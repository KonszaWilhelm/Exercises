package main;


import javaprogrammingmasterclass.linkedlist.playlist.Album;
import javaprogrammingmasterclass.linkedlist.playlist.Playlist;


public class Main {

    public static void main(String[] args) {




        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        album.addSong("Soldier of fortune", 3.13);

        Playlist playlist = new Playlist();
        playlist.addAlbum(album);

        System.out.println(album.getSongs());

        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 4.6);
        album2.addSong("I put the finger on you", 4.22);
        album2.addSong("Let's go", 4.3);
        album2.addSong("Inject the venom", 5.6);
        album2.addSong("Snowballed", 4.6);
        album2.addSong("Evil walks", 6.23);
        album2.addSong("C. O. D", 4.27);
        album2.addSong("Breaking the rules", 4.2);
        album2.addSong("Night of the long knives", 3.13);


        playlist.addAlbum(album2);

        System.out.println(album2.getSongs());


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(playlist.getAlbums().toString());
        System.out.println("********" + playlist.getAlbumByName("Stormbringer").getSongs());
        System.out.println("********" + playlist.getAlbumByName("For those about to rock").getSongs());


//        playlist.addSongToPlaylist("or those about to rock", "Evl walks");
        playlist.addSongToPlaylist("Stormbringer", "Lady double dealer");
        System.out.println("Playlist: " + playlist.getPlayList());


        playlist.addSongToPlaylist("For those about to rock", "Evil walks");
        System.out.println("Playlist: " + playlist.getPlayList());

        playlist.addSongToPlaylist("For those about to rock", "Snowballed");
        System.out.println("Playlist: " + playlist.getPlayList());

        playlist.addSongToPlaylist("Stormbringer", "Hold on");
        System.out.println("Playlist: " + playlist.getPlayList());

        playlist.addSongToPlaylist("For those about to rock", "Breaking the rules");

        System.out.println("Playlist: " + playlist.getPlayList());
        playlist.play();

    }


}




