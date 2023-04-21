package ru.netology.project;

public class Radio {
    private int quantityRadioStationNumber = 10;
    private int maxRadioStationNumber = 9;
    private int minRadioStationNumber = 0;
    private int radioStationNumber;


    private int soundVolume;

    public Radio(int quantityRadioStationNumber) {
        this.maxRadioStationNumber = quantityRadioStationNumber -1;
        this.quantityRadioStationNumber = quantityRadioStationNumber;
       }
    public Radio() {
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }
    public int getQuantityRadioStationNumber() {
        return quantityRadioStationNumber;
    }
    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }
    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return soundVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {

        radioStationNumber = newRadioStationNumber;
    }

    public void setRandomRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        setRadioStationNumber(newRadioStationNumber);
    }

    public void setNext() {
        int newRadioStationNumber = radioStationNumber + 1;
        if (newRadioStationNumber > maxRadioStationNumber) {
            setRadioStationNumber(minRadioStationNumber);
        } else {
            setRadioStationNumber(newRadioStationNumber);
        }
    }

    public void setPrev() {
        int newRadioStationNumber = radioStationNumber - 1;
        if (newRadioStationNumber < minRadioStationNumber) {
            setRadioStationNumber(maxRadioStationNumber);
        } else {
            setRadioStationNumber(newRadioStationNumber);
        }
    }

    public void setVolume(int newSoundVolume) {

        soundVolume = newSoundVolume;
    }

    public void setNextVolume() {
        int newSoundVolume = soundVolume + 1;
        if (newSoundVolume > 100) {
            setVolume(100);
        } else {
            setVolume(newSoundVolume);
        }
    }

    public void setPrevVolume() {
        int newSoundVolume = soundVolume - 1;
        if (newSoundVolume < 0) {
            setVolume(0);
        } else {
            setVolume(newSoundVolume);
        }
    }
}

