package TP;

public class Film extends Media implements Empruntable{
    protected String realisateur;
    protected String duree;

    Film(int id, String name, String realisateur,String duree, int year){
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprunter'");
    }

    @Override
    public void retouner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retouner'");
    }

}
