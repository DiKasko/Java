public class Hogwards {
    private int magic;
    private int transgression;
    public Hogwards(int magic, int transgression) {
        this.magic = magic;
        this.transgression = transgression;
    }
    public int getMagic()  {
        return magic;
    }
    public int getTransgression() {
        return transgression;
    }
    public void printInfo () {
        System.out.print(magic + " " + transgression + " ");
    }
}