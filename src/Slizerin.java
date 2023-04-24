public class Slizerin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slizerin(int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println(cunning + " " + determination + " " + ambition + " " + resourcefulness + " " + lustForPower);
    }
    public void printTotal() {
        System.out.println("Slizerin:" + (this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower + super.getMagic() + super.getTransgression()));
    }
}