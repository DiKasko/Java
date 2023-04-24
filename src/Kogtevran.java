public class Kogtevran extends Hogwards {
    private int clever;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    public Kogtevran(int magic, int transgression, int clever, int wise, int witty, int fullOfCreativity) {
        super(magic, transgression);
        this.clever = clever ;
        this.wise = wise ;
        this.witty = witty ;
        this.fullOfCreativity = fullOfCreativity;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println(clever + " " + wise + " " + witty + " " + fullOfCreativity);
    }
    public void printTotal()  {
        System.out.println("Kogtevran:" + (this.clever + this.wise + this.witty + this.fullOfCreativity + super.getMagic() + super.getTransgression()));
    }

}