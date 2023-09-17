public class Singer{
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong = new Song("I Do not Have a Favorite Song yet");
    private static int totalPerformances;

    public Singer(String n, int a, double e, String s){
        name=n;
        noOfPerformances = a;
        earnings = e;
        favoriteSong.changeFaveSong(s);
    }

    public String getName(){
        return name;
    }
    public int getnoOfPerformances(){
        return noOfPerformances;
    }
    public double getEarnings(){
        return earnings;
    }
    public void addEarnings(float a){
        earnings+=a;
    }
    public void addNoOfPerformances(){
        noOfPerformances+=1;
    }
    public void changeFavSong(String s){
        String a = favoriteSong.getFaveSong();
        favoriteSong.changeFaveSong(s);
        System.out.println(name + "'s New favorite song is " + favoriteSong.getFaveSong() + ". Their old favorite song was " + a);
    }
    public void performForAudience(int n){
        totalPerformances+=1;
        noOfPerformances +=1;
        earnings += 100.0*n;
        System.out.printf("%s performed for their audience for the %oth time. The concert has earned them %o pesos! \n", name, noOfPerformances, 100*n);
    }

    public void performForAudience(int n, Singer b){
        float individualEarnings = 100*n/2;
        totalPerformances+=1;
        noOfPerformances +=1;
        earnings += individualEarnings;
        b.addEarnings(individualEarnings);
        b.addNoOfPerformances();
        System.out.printf("Welcome to %s's concert, featuring artist %s. There are now %o total performances. They earned %o pesos together, which will be split between the 2. \n", name, b.getName(), totalPerformances, 100*n);
    }
}