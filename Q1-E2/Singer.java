public class Singer{
    String Name;
    int noOfPerformances;
    double earnings;

    public Singer(String n, int a, double e){
        Name=n;
        noOfPerformances = a;
        earnings = e;
    }

    public void performForAudience(int n){
        noOfPerformances +=1;
        earnings += 100.0*n;
        System.out.println(String.format("Hi %s, You have a total of %d Performances, and your earnings are %f", Name, noOfPerformances, earnings));
    }
}