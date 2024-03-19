public class Main {
    public static void main(String[] args) {

        boolean isBlocked = true;

        int coffeeAmount = 2330;
        int milkAmount = 1000;
        int skimmedMilkAmount = 1290;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean MilkRequired = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована");
        } else if (coffeeAmount >= cappucinoCoffeeRequired && MilkRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так");
        }














    }
}