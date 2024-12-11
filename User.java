package TP;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Media> emprunts;

    User(int id, String name){
        this.id = id;
        this.name = name;
        this.emprunts = new ArrayList<Media>();
    }

    public void emprunterMedia(Media media){
        emprunts.add(media);
    }
    public void retournerMedia(Media media){
        emprunts.remove(media);
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
