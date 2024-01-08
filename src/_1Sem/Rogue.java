package _1Sem;

public class Rogue extends Hero {
    public Rogue(String nameHero) {
        super(100,
                100,
                30,
                new int[]{5,15},
                nameHero);
    }

    @Override
    public String toString() {
        return "Разбойник " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}
