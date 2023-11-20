public class WaterType extends Monster{
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        super.atk*=0.7;
        super.def*=1.3;
    }

    @Override
    public void special(){
        super.def+=2;
        super.hp-=0.1*super.maxHP;
        System.out.printf("%s did a cool pose that raised defense by 2 points but lowered hp by %f\n",super.name,0.1*super.maxHP);
    }
}
