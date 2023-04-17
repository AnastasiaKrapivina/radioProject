package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testRadioStationNumber() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationNumberMinBorder() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioStationNumberMaxBorder() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumber() {
        Radio rad = new Radio();

        rad.setNext(8);

        int expected = 9;
        int actual = rad.getNext();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxBorder() {
        Radio rad = new Radio();

        rad.setNext(9);

        int expected = 0;
        int actual = rad.getNext();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNumber() {
        Radio rad = new Radio();

        rad.setPrev(8);

        int expected = 7;
        int actual = rad.getPrev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinBorder() {
        Radio rad = new Radio();

        rad.setPrev(0);

        int expected = 9;
        int actual = rad.getPrev();

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
    public void testVolumeMinBorder() {
        Radio rad = new Radio();

        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaxBorder() {
        Radio rad = new Radio();

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume() {
        Radio rad = new Radio();

        rad.setNextVolume(80);

        int expected = 81;
        int actual = rad.getNextVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolumeMaxBorder() {
        Radio rad = new Radio();

        rad.setNextVolume(101);

        int expected = 100;
        int actual = rad.getNextVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolume() {
        Radio rad = new Radio();

        rad.setPrevVolume(80);

        int expected = 79;
        int actual = rad.getPrevVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevVolumeMinBorder() {
        Radio rad = new Radio();

        rad.setPrevVolume(0);

        int expected = 0;
        int actual = rad.getPrevVolume();

        Assertions.assertEquals(expected, actual);
    }

}