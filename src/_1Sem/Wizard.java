package _1Sem;

public class Wizard extends Hero{
    public Wizard(String nameHero) {
        super(50,
                50,
                1,
                new int[]{-35,-25},
                nameHero);
    }

    @Override
    public String toString() {
        return "Колдун " + nameHero + ", здоровье: " + health + "/" + health_max + ", броня: " + armor;
    }
}
