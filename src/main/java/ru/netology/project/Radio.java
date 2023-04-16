package ru.netology.
public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

    public int getNext() {
        return currentRadioStationNumber;
    }

    public int getPrev() {
        return currentRadioStationNumber;
    }

   // public int getSoundVolume() {
    //    return soundVolume;
    //}

    public void setNext() {

        if (currentRadioStationNumber >= 9) {
            currentRadioStationNumber = 0;
        }
        if (currentRadioStationNumber >= 0) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void setPrev() {
        if (currentRadioStationNumber <= 0) {
            currentRadioStationNumber = 9;
        }
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber <= 9) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }

    }
}