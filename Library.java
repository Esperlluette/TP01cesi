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

    public void emprunterMedia(Media media, User user) {
        throw new UnsupportedOperationException("Emprunt d'un média par un user pas encore implémenté.");
    }

    public void retounerMedia(Media media, User user) {
        throw new UnsupportedOperationException("retour d'un média par un user pas encore implémenté.");
    }

    public void sortByYearDSC(){
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
