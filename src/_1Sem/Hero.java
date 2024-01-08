package _1Sem;

public abstract class Hero {

    protected int health, health_max, armor;
    int[] damage;
    String nameHero;

    public Hero(int health, int health_max, int armor, int []damage, String nameHero) {
        this.health = health;
        this.health_max = health_max;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
    }
}
