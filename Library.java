package TP;

import java.util.ArrayList;

public class Library {
    private ArrayList<Media> medias;
    private ArrayList<User> users;

    Library() {
        this.medias = new ArrayList<Media>();
        this.users = new ArrayList<User>();
    }

    public void emprunterMedia(Media media, User user) {
        throw new UnsupportedOperationException("Emprunt d'un média par un user pas encore implémenté.");
    }

    public void retounerMedia(Media media, User user) {
        throw new UnsupportedOperationException("retour d'un média par un user pas encore implémenté.");
    }

    public void sortByYear() {
        ArrayList<Media> sorted = new ArrayList<Media>();
        for (Media ancestor : medias) {
        Boolean b = true; 
        for (Media image : medias) {
            if (ancestor.year > image.year){
                b = false;
            }
        }
        if (b){
            sorted.add(ancestor);
        }
       }
       medias = sorted;
       System.out.println("Medias triés");
    }

    public Media[] sortByTitle() {
        throw new UnsupportedOperationException("tri des medias par titre pas implémenté.");
    }

    public ArrayList<Media> lookByTitle(String title) {
        ArrayList<Media> matchs = new ArrayList<Media>();
        for (Media media : this.medias) {
            if (media.name == title) {
                matchs.add(media);
            }
        }
        return matchs;
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public void addUser(User user) {
        users.add(user);
    }
}
