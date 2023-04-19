package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioStationNumber() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(4);

        int expected = 4;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandomRadioStationNumber() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioRandomNumberMinBorder() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandomNumberMaxBorder() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumber() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setNext();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxBorder() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);
        rad.setNext();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNumber() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setPrev();

        int expected = 7;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinBorder() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);
        rad.setPrev();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio rad = new Radio();

        rad.setVolume(80);

        int expected = 80;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume() {
        Radio rad = new Radio();

        rad.setVolume(80);
        rad.setNextVolume();

        int expected = 81;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeMaxBorder() {
        Radio rad = new Radio();

        rad.setVolume(100);
        rad.setNextVolume();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolume() {
        Radio rad = new Radio();

        rad.setVolume(80);
        rad.setPrevVolume();

        int expected = 79;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeMinBorder() {
        Radio rad = new Radio();

        rad.setVolume(0);
        rad.setPrevVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}