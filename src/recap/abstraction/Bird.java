package recap.abstraction;

public class Bird extends Creature implements Wings, Claws{

    public Bird(String name, int legs, String breathingMethod, String reproductionMethod) {
        super(name, legs, breathingMethod, reproductionMethod);
    }
    public Bird(String name, int legs, String breathingMethod, String reproductionMethod, boolean hasWings, boolean hasClows) {
        super(name, legs, breathingMethod, reproductionMethod);
        this.hasWings = hasWings;
        this.hasClows = hasClows;
    }

    public boolean hasWings;
    public boolean hasClows;

    @Override
    public void fly() {
        if(hasWings) System.out.println(name + " can fly!");
        else System.out.println(name + " cannot fly");
    }

    @Override
    public void moving() {
        if(legs == 0) System.out.println( name + " cannot walk");

        if(hasWings) System.out.println(name + " is flying!");
        else System.out.println(name + " doesn`t have wings and cannot fly");
    }

    @Override
    public void breathing() {
        switch(breathingMethod.toLowerCase()){
            case "lungs":
                System.out.println(name + " is air breathing");
                break;
            case "gills":
                System.out.println(name + " is water breathing");
                break;
            default:
                System.out.println("This breathing method doesn`t exist");
        }
        System.out.println("It is using lungs to use oxygen!");
    }

    @Override
    public void reproduction() {
        switch(reproductionMethod.toLowerCase()){
            case "eggs":
                System.out.println(name + " is using eggs for reproduction!");
                break;
            case "giving birth":
                System.out.println(name + " is giving birth for reproduction");
                break;
            default:
                System.out.println("This reproduction method doesn`t exist");
        }
        System.out.println("Birds are laying their eggs on their nests");
    }

    @Override
    public void grabs() {
        System.out.println(name + (hasClows ? " can " : " cannot ") + " grab the branch");
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Eagle", 2,"lungs", "eggs", true, false);

        bird.moving();
        bird.breathing();
        bird.reproduction();
    }
}
