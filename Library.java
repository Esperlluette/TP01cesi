package TP;

public class Library {
    private Media[] medias;
    private User[] users;

    Library() {
        this.medias = new Media[] {};
        this.users = new User[] {};
    }

    public void emprunterMedia(Media media, User user) {
        throw new UnsupportedOperationException("Emprunt d'un média par un user pas encore implémenté.");
    }

    public void retounerMedia(Media media, User user) {
        throw new UnsupportedOperationException("retour d'un média par un user pas encore implémenté.");
    }

    public Media[] sortByYear() {
        throw new UnsupportedOperationException("tri des médias par année pas encore implémenté.");
    }

    public Media[] sortByTitle() {
        throw new UnsupportedOperationException("tri des medias par titre pas implémenté.");
    }

    public Media[] lookByTitle(String title) {
        Media[] matchs = new Media[] {};
        for (Media media : this.medias) {
            if (media.name == title) {
                matchs[matchs.length + 1] = media;
            }
        }
        return matchs;
    }

    public void addMedia(Media media) {
        this.medias[this.medias.length + 1] = media;
    }

    public void addUser(User user) {
        this.users[this.users.length + 1] = user;
    }
}
