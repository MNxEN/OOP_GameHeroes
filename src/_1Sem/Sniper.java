package _1Sem;

public class Sniper extends Hero{
    public Sniper(String nameHero) {
        super(75,
                75,
                5,
                new int[]{10,20},
                nameHero);
    }

    @Override
    public String toString() {
        return "Снайпер " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}
