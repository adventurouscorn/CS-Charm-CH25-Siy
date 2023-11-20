public class GrassType extends Monster{
    public GrassType(String name, int hp, int base){
        super(name, "grass", "water", "grass", hp, base);
    }

    @Override
    public void special(){
        super.hp+=0.2*super.maxHP;
        System.out.printf("%s did a cool pose that raised hp by %f\n",super.name,0.2*super.maxHP);
    }

    public void rest(){
        hp += maxHP * 0.5;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
}