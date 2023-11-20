public class FireType extends Monster{
    public FireType(String name, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        super.atk*=1.3;
        super.def*=0.7;
    }

    @Override
    public void special(){
        super.hp+=0.2*super.maxHP;
        System.out.printf("%s did a cool pose that raised hp by %f\n",super.name,0.2*super.maxHP);
    }
}