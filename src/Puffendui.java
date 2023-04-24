public class Puffendui extends Hogwards {
    private int hardworking;
    private int loyal;
    private int honest;
    public Puffendui(int magic, int transgression, int hardworking, int loyal, int honest) {
        super(magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public void printInfo () {
        super.printInfo();
        System.out.println(hardworking + " " + loyal + " " + honest);
    }
    public void printTotal () {
        System.out.println("Puffendui :" + (this.hardworking + this.loyal + this.honest + super.getMagic() + super.getTransgression()));
    }
    int Total = this.hardworking + this.loyal + this.honest + super.getMagic() + super.getTransgression();
}