package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioStationNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(4);

        Assertions.assertEquals(4, rad.getRadioStationNumber());
        Assertions.assertEquals(9, rad.getMaxRadioStationNumber());
        Assertions.assertEquals(0, rad.getMinRadioStationNumber());
        Assertions.assertEquals(10, rad.getQuantityRadioStationNumber());
    }

    @Test
    public void testRadioStationNumberTwoConstructor() {
        Radio rad = new Radio(20);

        rad.setRadioStationNumber(4);

        Assertions.assertEquals(4, rad.getRadioStationNumber());
        Assertions.assertEquals(19, rad.getMaxRadioStationNumber());
        Assertions.assertEquals(0, rad.getMinRadioStationNumber());
        Assertions.assertEquals(20, rad.getQuantityRadioStationNumber());
    }

    @Test
    public void testRandomRadioStationNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandomRadioStationNumberTwoConstructor() {
        Radio rad = new Radio(20);

        rad.setRandomRadioStationNumber(18);

        int expected = 18;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioRandomNumberMinBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioRandomNumberMinBorderTwoConstructor() {
        Radio rad = new Radio(20);

        rad.setRandomRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandomNumberMaxBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRandomRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandomNumberMaxBorderTwoConstructor() {
        Radio rad = new Radio(15);

        rad.setRandomRadioStationNumber(15);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setNext();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumberTwoConstructor() {
        Radio rad = new Radio(25);

        rad.setRadioStationNumber(18);
        rad.setNext();

        int expected = 19;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);
        rad.setNext();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxBorderTwoConstructor() {
        Radio rad = new Radio(25);

        rad.setRadioStationNumber(24);
        rad.setNext();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setPrev();

        int expected = 7;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNumberTwoConstructor() {
        Radio rad = new Radio(20);

        rad.setRadioStationNumber(18);
        rad.setPrev();

        int expected = 17;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);
        rad.setPrev();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinBorderTwoConstructor() {
        Radio rad = new Radio(17);

        rad.setRadioStationNumber(0);
        rad.setPrev();

        int expected = 16;
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