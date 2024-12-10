package TP;

public class Magazine extends Media {
    protected String edition;

    Magazine(int id, String name, String edition, int year){
        super.id = id;
        super.name = name; 
        this.edition = edition;
        super.year = year;
    }

    @Override
    public void getDetails() {
        System.out.println("id : " + super.id + 
        "\nname : " + super.name +
        "\nedition : " + this.edition + 
        "\nyear : " + super.year);}

}
