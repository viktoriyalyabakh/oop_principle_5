package recap.abstraction;

public abstract class Creature {

    public Creature(String name, int legs, String breathingMethod, String reproductionMethod){
        this.name = name;
        this.legs = legs;
        this.breathingMethod = breathingMethod;
        this.reproductionMethod = reproductionMethod;
    }

    public String name;
    public int legs;
    public String breathingMethod;
    public String reproductionMethod;

    public abstract void moving();

    public abstract void breathing();

    public abstract void reproduction();

    public void living(){
        System.out.println(name + " is living!");
    }

}
