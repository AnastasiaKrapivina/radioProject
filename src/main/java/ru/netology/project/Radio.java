package ru.netology.project;

public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getNext() {
        return currentRadioStationNumber;
    }

    public int getPrev() {
        return currentRadioStationNumber;
    }

    public void setRadioStationNumber(int i) {
        if (i < 0) {
            return;
        }
        if (i > 9) {
            return;
        }
        currentRadioStationNumber = i;
    }

    public int setNext(int i) {
        if (i < 9) {
            currentRadioStationNumber = i + 1;
        }
        if (i == 9) {
            currentRadioStationNumber = 0;
        }
        return currentRadioStationNumber;
    }

    public int setPrev(int i) {
        if (i > 0) {
            currentRadioStationNumber = i - 1;
        }
        if (i == 0) {
            currentRadioStationNumber = 9;
        }
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return soundVolume;
    }

    public int getNextVolume() {
        return soundVolume;
    }

    public int getPrevVolume() {
        return soundVolume;
    }

    public void setVolume(int i) {
        if (i < 0) {
            return;
        }
        if (i > 100) {
            return;
        }
        soundVolume = i;
    }

    public int setNextVolume(int i) {
        if (i < 100) {
            soundVolume = i + 1;
        }
        if (i >= 100) {
            soundVolume = 100;
        }
        return soundVolume;
    }

    public int setPrevVolume(int i) {
        if (i > 0) {
            soundVolume = i - 1;
        }
        if (i == 0) {
            soundVolume = 0;
        }
        return soundVolume;
    }
}

