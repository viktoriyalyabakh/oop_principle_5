package recap.abstraction;

public class Fish extends Creature implements Fin{

    public Fish(String name, int legs, String breathingMethod, String reproductionMethod) {
        super(name, legs, breathingMethod, reproductionMethod);
    }

    public Fish(String name, int legs, String breathingMethod, String reproductionMethod, boolean hasFins) {
        super(name, legs, breathingMethod, reproductionMethod);
        this.hasFins = hasFins;
    }

    public boolean hasFins;

    @Override
    public void moving() {
        if(legs == 0) System.out.println( name + " cannot walk");

        if(hasFins) System.out.println(name + " is swimming!");
        else System.out.println(name + " doesn`t have fins and cannot swim");
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
        System.out.println("It is using gills to use oxygen!");
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
        System.out.println("Roe is called as fish egg");
    }

    @Override
    public void swimming(int finAmount) {
        if(hasFins){
            System.out.println(name + " is swimming");
            if(finAmount > 2){
                System.out.println(name + " is swimming super fast");
            }else if(finAmount == 2){
                System.out.println(name + " is swimming fast");
            }else System.out.println(name + " is swimming slow");
        }else System.out.println(name + " is not able to swim");
    }

    public static void main(String[] args) {
        Fish fish = new Fish("Salmon", 0, "gills", "eggs", true);

        fish.moving();
        fish.breathing();
        fish.reproduction();

    }
}
