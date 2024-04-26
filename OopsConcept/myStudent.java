package OopsConcept;

public class myStudent {
    public static void main(String[] args) {
        Eatables Firsteat = new Eatables("pizza");
        System.out.println(Firsteat.Name);
    }
}

class Eatables {
    String Name;
    boolean isVeg;

    Eatables(String addName) {
        this.Name = addName;
    }

    Eatables(Eatables eat) {
        this.Name = eat.Name;
        this.isVeg = eat.isVeg;
    }
}
