import java.util.ArrayList;

public class Playlist {
    String name;
    ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return songs.size() == 0;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String[] songNames() {
        String[] songNames = new String[songs.size()];

        for(int i = 0; i < songs.size(); i++) {
            songNames[i] = songs.get(i).title;
        }

        return songNames;
    }

    public int totalDuration() {
        int totalDuration = 0;

        for (int i = 0; i < songs.size(); i++) {
            totalDuration += songs.get(i).durationInSeconds;
        }

        return totalDuration;
    }

    public void swap(Song song1, Song song2) {
        int song1Position = songs.indexOf(song1);
        int song2Position = songs.indexOf(song2);

        songs.set(song1Position, song2);
        songs.set(song2Position, song1);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

}
