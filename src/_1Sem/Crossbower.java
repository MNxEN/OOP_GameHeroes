package _1Sem;

public class Crossbower extends Hero{
    public Crossbower(String nameHero) {
        super(75,
                75,
                5,
                new int[]{10,20},
                nameHero);
    }

    @Override
    public String toString() {
        return "Арбалетчик " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}
