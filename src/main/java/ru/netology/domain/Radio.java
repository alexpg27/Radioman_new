package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {

            return;
        }
        currentVolume++;
    }

    public void lowerVolume() {
        if (currentVolume == minVolume) {

            return;
        }
        currentVolume--;
    }
}
