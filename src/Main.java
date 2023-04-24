public class Main {
    public static void main(String[] args) {
        Griffindor HarryPotter = new Griffindor(23, 43, 65,54, 93);
        Griffindor HermioneJeanGranger = new Griffindor(43, 54,65,89,34);
        Puffendui PercivalRackham = new Puffendui(11, 65, 76, 59, 71);
        Puffendui PomonaSprout = new Puffendui(65, 76, 65, 45,68);
        Puffendui Scamander = new Puffendui(76, 23, 45,76,71);
        Kogtevran LunaLovegood = new Kogtevran(32, 25, 34, 87, 29, 56);
        Kogtevran markusBelbi = new Kogtevran(43,86,65,34,54, 53);
        Slizerin Malfoy = new Slizerin(41, 32, 76, 46, 76, 39, 65);
        Slizerin SalazarSlytherin = new Slizerin(88, 34, 32, 45, 46, 29, 70);


        System.out.print("HarryPotter ");
        HarryPotter.printInfo();
        HarryPotter.printTotal();
        System.out.print("HermioneJeanGranger ");
        HermioneJeanGranger.printInfo();
        HermioneJeanGranger.printTotal();
        System.out.print("PercivalRackham ");
        PercivalRackham.printInfo();
        PercivalRackham.printTotal();
        System.out.print("PomonaSprout ");
        PomonaSprout.printInfo();
        PomonaSprout.printTotal();
        System.out.print("Scamander ");
        Scamander.printInfo();
        Scamander.printTotal();
        System.out.print("LunaLovegood ");
        LunaLovegood.printInfo();
        LunaLovegood.printTotal();
        System.out.print("markusBelbi ");
        markusBelbi.printInfo();
        markusBelbi.printTotal();
        System.out.print("Malfoy ");
        Malfoy.printInfo();
        Malfoy.printTotal();
        System.out.print("SalazarSlytherin ");
        SalazarSlytherin.printInfo();
        SalazarSlytherin.printTotal();
    }
}