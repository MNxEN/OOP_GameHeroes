package _1Sem;

public class Monk extends Hero{
    public Monk(String nameHero) {
        super(50,
                50,
                1,
                new int[]{-35,-25},
                nameHero);
    }

    @Override
    public String toString() {
        return "Монах " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}
