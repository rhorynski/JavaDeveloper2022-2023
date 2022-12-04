package creatures;

public class Animal {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 800.0;
    // ma kilka funkcji
    // czy zyje czy mozna zabrac na spacer
    // to jest wzor
    public final String species;
    public String name;
    private Double weight;
    private Boolean isAlive;

    public Animal(String species) {

        this.isAlive = true; // kazde nowe zwierze jest zywe
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "wax" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        if (weight <= 0)
        {
            System.out.println("Sorry, bledna waga");
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        } else {
            this.weight = weight;
        }
    }

    public Double getWeight(){ return this.weight; }

   public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne ze zyje");
        } else {
            System.out.println("no niestety, troche za pozno");
        }
    }

    public void feed(Double foodWeight) {// (Double weightFood) {
        if (isAlive) {
            weight += (foodWeight * 0.3);
            //weight += weightFood;
            System.out.println("dzieki za zarcie");
        } else {
            System.out.println("troche za pozno");
        }
    }

    public void takeForAWalk(Double distance) {
        if (!isAlive) {
            System.out.println("Halo policja");
        } else {
            weight -= (distance * 0.1);
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzieki za spacer");
            }
        }
    }
}