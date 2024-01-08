package _1Sem;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        heroesWhite = generateCommand(0);
        heroesBlack = generateCommand(3);
        heroesWhite.forEach(n-> System.out.println(n.toString()));
        System.out.println("**************");
        heroesBlack.forEach(n-> System.out.println(n.toString()));
    }

    static String GetNameHeroes() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].toString();
    }

    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    static ArrayList<Hero> generateCommand(int n) {
        ArrayList<Hero> commandHeroesList = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1, 5)+n;
            switch (rand) {
                case 1:
                    commandHeroesList.add(new Crossbower(GetNameHeroes()));
                    break;
                case 2:
                    commandHeroesList.add(new Pikeman(GetNameHeroes()));
                    break;
                case 3:
                    commandHeroesList.add(new Monk(GetNameHeroes()));
                    break;
                case 4:
                    commandHeroesList.add(new Peasant(GetNameHeroes()));
                    break;
                case 5:
                    commandHeroesList.add(new Rogue(GetNameHeroes()));
                    break;
                case 6:
                    commandHeroesList.add(new Sniper(GetNameHeroes()));
                    break;
                case 7:
                    commandHeroesList.add(new Wizard(GetNameHeroes()));
                    break;
            }
        }
        return commandHeroesList;
    }
}
