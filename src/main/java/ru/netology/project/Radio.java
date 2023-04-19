package ru.netology.project;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;

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
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        setRadioStationNumber(newRadioStationNumber);
    }

    public void setNext() {
        int newRadioStationNumber = radioStationNumber + 1;
        if (newRadioStationNumber > 9) {
            setRadioStationNumber(0);
        } else {
            setRadioStationNumber(newRadioStationNumber);
        }
    }

    public void setPrev() {
        int newRadioStationNumber = radioStationNumber - 1;
        if (newRadioStationNumber < 0) {
            setRadioStationNumber(9);
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

