 class Creature {
    private int legCount;
    protected int wingCount;
    
    public Creature(int legCount) {
        this.legCount = this.legCount;
        this.wingCount = 0;
    }
    
    public String toString() {
        return "legs=" + this.legCount + " wings=" + wingCount;
    }
}

public class Animal extends Creature {
    public Animal(int legCount) {
	super(legCount);
	 this.wingCount = 0;
    }

}
