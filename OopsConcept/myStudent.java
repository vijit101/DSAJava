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
}
