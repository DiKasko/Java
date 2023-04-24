public class Griffindor extends Hogwards {
    private int nobolity;
    private int honor;
    private int bravery;    public Griffindor(int magic, int transgression, int nobolity, int honor, int bravery) {
        super(magic, transgression);
        this.nobolity = nobolity;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void printInfo () {
        super.printInfo();
        System.out.println(nobolity + " " + honor + " " + bravery);
    }
    public void printTotal ()  {
        System.out.println("Griffildor:" + (this.nobolity + this.honor + this.bravery + super.getMagic() + super.getTransgression()));
    }
}
