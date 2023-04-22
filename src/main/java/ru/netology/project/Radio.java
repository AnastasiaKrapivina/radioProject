package ru.netology.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int quantityRadioStationNumber = 10;
    private int maxRadioStationNumber = quantityRadioStationNumber - 1;
    private int minRadioStationNumber = 0;
    private int radioStationNumber;
    private int soundVolume;

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
        int newSoundVolume = soundVolume + 1;
        if (newRadioStationNumber > maxRadioStationNumber) {
            setRadioStationNumber(minRadioStationNumber);
        } else {
            setRadioStationNumber(newRadioStationNumber);
        }
        if (newSoundVolume > 100) {
            setSoundVolume(100);
        } else {
            setSoundVolume(newSoundVolume);
        }
    }

    public void setPrev() {
        int newRadioStationNumber = radioStationNumber - 1;
        int newSoundVolume = soundVolume - 1;
        if (newRadioStationNumber < minRadioStationNumber) {
            setRadioStationNumber(maxRadioStationNumber);
        } else {
            setRadioStationNumber(newRadioStationNumber);
        }
        if (newSoundVolume < 0) {
            setSoundVolume(0);
        } else {
            setSoundVolume(newSoundVolume);
        }

    }
}

