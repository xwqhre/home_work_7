public class Medic extends Hero {
    int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic use superheal");

    }
    public void  increaseExperience(){
        healPoints = healPoints + (healPoints / 10);
    }
}