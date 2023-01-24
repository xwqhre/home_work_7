public class Main {
    public static void main(String[] args) {

        Hero [] heroes = {new Warrior(), new Medic(), new Magic()} ;
        for (int i = 0; i < heroes.length; i++) {
            heroes [i].applySuperAbility();
            if (heroes[i] instanceof Medic ){
                Medic medic = ((Medic) heroes[i]);
                medic.increaseExperience();
            }
        }

    }
}