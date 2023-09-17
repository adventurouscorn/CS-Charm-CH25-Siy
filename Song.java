public class Song{
    private String faveSong;

    public Song(String s){
        faveSong = s;
    }
    public String getFaveSong(){
        return faveSong;
    }
    public void changeFaveSong(String s){
        faveSong = s;
    }
}