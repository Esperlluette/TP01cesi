package TP;

public class User {
    private int id;
    private String name;
    private Media[] emprunts;

    User(int id, String name){
        this.id = id;
        this.name = name;
        this.emprunts = new Media[]{};
    }

    public void emprunterMedia(){
        throw new UnsupportedOperationException("Unimplemented method 'emprunter'");
    }
    public void retournerMedia(){
        throw new UnsupportedOperationException("Unimplemented method 'emprunter'");
    }
    public void AfficherEmprunts() {
        for (Media media : emprunts) {
            media.getDetails();
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
