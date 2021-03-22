package ru.mirea.ikbo1319.task08.memento;

public class OperatingSystem {
    private int amountOfFiles;
    private String username;

    public OperatingSystem(int amountOfFiles, String username) {
        this.amountOfFiles = amountOfFiles;
        this.username = username;
    }

    public void deleteAllFiles() {
        amountOfFiles = 0;
    }

    public Backup makeBackup() {
        return new Backup(amountOfFiles, username);
    }

    public void recover(Backup backup) {
        amountOfFiles = backup.getAmountOfFiles();
        username = backup.getUsername();
    }

    @Override
    public String toString() {
        return "amount of files: " + amountOfFiles + " username: " + username;
    }
}
