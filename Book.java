package TP;

public class Book extends Media implements Empruntable{
    protected String author;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprunter'");
    }

    @Override
    public void retouner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retouner'");
    }

}
