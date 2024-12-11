package TP;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<Media> medias;
    private ArrayList<User> users;

    Library() {
        this.medias = new ArrayList<Media>();
        this.users = new ArrayList<User>();
    }

    public void getStatsEmprunts() {
        int i = Film.getEmprunts();
        int j = Book.getEmprunts();
        if (i > j) {
            System.out.println("Films are more emprunted than books.");
        } else if (j > i) {
            System.out.println("Books are more emprunted than films.");
        } else {
            System.out.println("Both films and books are emprunted the same way.");
        }
    }

    public void emprunterMedia(Media media, User user) {
        if (!(media instanceof Empruntable)) {
            System.err.println("This media is not able to be empruntable.");
            return;
        }
        ((Empruntable) media).emprunter();
        user.emprunterMedia(media);
        medias.remove(media);
    }

    public User getUserById(int id){
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public Media getMediaById(int id){
        for (Media media : medias) {
            if (media.id == id){
                return media;
            }
        }
        return null;
    }

    public void retounerMedia(Media media, User user) {
        if (!(media instanceof Empruntable)) {
            System.err.println("This media is not able to be empruntable.");
            return;
        }
        ((Empruntable)media).retouner();
        user.retournerMedia(media);
        medias.add(media);
    }

    public void sortByYearDSC() {
        sortByYearASC();
        Collections.reverse(medias);
        System.out.println("Médias triés par année décroissante.");
    }

    public void sortByYearASC() {
        if (medias.isEmpty()) {
            System.out.println("Liste de médias vide.");
            return;
        }
        for (int i = 0; i < medias.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < medias.size(); j++) {
                if (medias.get(j).year < medias.get(minIndex).year) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Collections.swap(medias, i, minIndex);
            }
        }
        System.out.println("Médias triés par année.");
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
