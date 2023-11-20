public class Main {
    public static void main(String[] args){
        FireType Charizard = new FireType("Charizard", 78, 90);
        GrassType Venusaur = new GrassType("Venusaur", 80, 80);
        WaterType Blastoise = new WaterType("Blastoise", 79, 90);

        //fight 1
        while (Venusaur.getHP()!=0 && Charizard.getHP()!=0){
            Venusaur.chooseMove(Charizard);
            Charizard.chooseMove(Venusaur);
        }
        Venusaur.resetHealth();
        Charizard.resetHealth();

        //fight 2
        while (Blastoise.getHP()!=0 && Charizard.getHP()!=0){
            Blastoise.chooseMove(Charizard);
            Charizard.chooseMove(Blastoise);
        }
        Blastoise.resetHealth();
        Charizard.resetHealth();

        //fight 3
        while (Venusaur.getHP()!=0 && Blastoise.getHP()!=0){
            Blastoise.chooseMove(Venusaur);
            Venusaur.chooseMove(Blastoise);
        }
        Blastoise.resetHealth();
        Venusaur.resetHealth();


    }
}
