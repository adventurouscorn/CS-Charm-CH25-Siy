public class Song{
    String favoriteSong;

    public Song(String s){
        favoriteSong = s;
    }

    public void changeFavSong(String s){
        favoriteSong = s;
        System.out.println("your new favorite song is " + favoriteSong);
    }
}