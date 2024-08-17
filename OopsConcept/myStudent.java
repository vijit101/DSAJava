package OopsConcept;

public class myStudent {
    public static void main(String[] args) {
        Eatables Firsteat = new Eatables("pizza", 3);
        Firsteat.menuPrices[0] = 10;
        Firsteat.menuPrices[1] = 20;
        Firsteat.menuPrices[2] = 30;
        Eatables neweat = new Eatables(Firsteat);
        System.out.println(neweat.menuPrices[0]);
        Firsteat.menuPrices[0] = 100;
        System.out.println(neweat.menuPrices[0]);

    }
}

class Eatables {
    String Name;
    boolean isVeg;
    int menuPrices[];

    Eatables(String addName, int sizeOfmenuPrices) {
        this.Name = addName;
        menuPrices = new int[sizeOfmenuPrices];
    }

    Eatables(Eatables eat) {
        this.Name = eat.Name;
        this.isVeg = eat.isVeg;
        this.menuPrices = new int[eat.menuPrices.length];
        // deep copy constructor

        for (int i = 0; i < eat.menuPrices.length; i++) {

            this.menuPrices[i] = eat.menuPrices[i];
        }
    }
}
