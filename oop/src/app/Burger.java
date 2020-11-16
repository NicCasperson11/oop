package app;

public class Burger extends Food {

    private static final int NUM_BUNS = 2;
    private int numberBacon;
    private int numberPatties;
    private int numberTomatoes;
    private boolean hasKetchup;
    private boolean hasMayo;
    private String name;

    public Burger(int bacon, int patties, int tomatoes, boolean ketchup, boolean mayo, String name) {
        this.numberBacon = bacon;
        this.numberPatties = patties;
        this.numberTomatoes = tomatoes;
        this.hasKetchup = ketchup;
        this.hasMayo = mayo;
        this.name = name;
    }


    public static int getNumBuns() {
        return NUM_BUNS;
    }

    public static int getNumBacon() {
        return numberBacon;
    }

    public static int getTomatoes() {
        return numberTomatoes;
    }

    public static boolean hasKetchup() {
        return hasKetchup;
    }
}