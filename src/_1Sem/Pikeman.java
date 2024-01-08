package _1Sem;

public class Pikeman extends Hero {
    public Pikeman(String nameHero) {
        super(100,
                100,
                30,
                new int[]{5, 15},
                nameHero);
    }

    @Override
    public String toString() {
        return "Копейщик " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}