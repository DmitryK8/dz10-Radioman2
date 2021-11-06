package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int sumStation = 18;

    public int getSumStation() {
        return this.sumStation;
    }

    public void setSumStation(int sumStation) {
        this.sumStation = sumStation;
    }

    public Radio(int currentStation, int currentVolume, int sumStation) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.sumStation = sumStation;
    }

    public Radio() {
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0) {
            if (newCurrentStation <= 17) {
                this.currentStation = newCurrentStation;
            }
        }
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setNextStation() {
        if (this.currentStation < 17) {
            ++this.currentStation;
        } else {
            this.currentStation = 0;
        }

    }

    public void setBackStation() {
        if (this.currentStation > 0) {
            --this.currentStation;
        } else {
            this.currentStation = 17;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setIncreaseVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

    }

    public void setReduceVolume() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        }
    }
}
