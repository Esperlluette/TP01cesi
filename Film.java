package TP;

public class Film extends Media implements Empruntable {
    protected String realisateur;
    protected String duree;
    private static int emprunts = 0;
    private static int ongoingEmprunts = 0;

    Film(int id, String name, String realisateur, String duree, int year) {
        super.id = id;
        super.name = name;
        this.realisateur = realisateur;
        this.duree = duree;
        super.year = year;
    }

    @Override
    public void getDetails() {
        System.out.println("id : " + super.id +
                "\nname : " + super.name +
                "\nrealisateur : " + this.realisateur +
                "\nduree : " + this.duree +
                "\nyear : " + super.year);
    }



    @Override
    public void emprunter() {
       setEmprunts(getEmprunts()+1);
       setOngoingEmprunts(getOngoingEmprunts()+1);
    }

    @Override
    public void retouner() {
        setEmprunts(getEmprunts()-1);
        setOngoingEmprunts(getOngoingEmprunts()-1);
    }

    public static void setOngoingEmprunts(int ongoingEmprunts) {
        Film.ongoingEmprunts = ongoingEmprunts;
    }
    public static int getOngoingEmprunts() {
        return ongoingEmprunts;
    }
    public static void setEmprunts(int emprunts) {
        Film.emprunts = emprunts;
    }

    public static int getEmprunts() {
        return emprunts;
    }

}
