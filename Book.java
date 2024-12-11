package TP;

public class Book extends Media implements Empruntable{
    protected String author;
    private static int emprunts = 0;
    private static int ongoingEmprunts = 0;


    Book(int id, String name, String author, int year){
        super.id = id;
        super.name = name; 
        this.author = author;
        super.year = year;
    }

    @Override
    public void getDetails() {
        System.out.println("id : " + super.id + 
        "\nname : " + super.name + 
        "\nauthor : " + this.author + 
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
        Book.ongoingEmprunts = ongoingEmprunts;
    }
    public static int getOngoingEmprunts() {
        return ongoingEmprunts;
    }
    
    public static void setEmprunts(int emprunts) {
        Book.emprunts = emprunts;
    }
    public static int getEmprunts() {
        return emprunts;
    }


}
