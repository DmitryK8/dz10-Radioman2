package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int sumStation = 18;

    public Radio() {

    }

    public Radio(int sumStation) {
        this.sumStation = sumStation;
    }

    public int getSumStation() {
        return sumStation;
    }

    public void setSumStation(int sumStation) {
        if (sumStation < 0) {
            return;
        }
        this.sumStation = sumStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > sumStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < sumStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void backStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = sumStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}