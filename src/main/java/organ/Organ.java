package organ;

import armor.Armor;
import organ.interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {
        hp -= (force*calcResist(armor.getDurability()))/100;
        if(hp<=0){
            hp=0;
        }
        armor.takeDamage(force);
        return (hp <= 0);
    }

    private double calcResist(double x) {
        return 100-x/2;
    }
}
