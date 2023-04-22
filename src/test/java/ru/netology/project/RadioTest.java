package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioStationNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setQuantityRadioStationNumber(9);
        rad.setMaxRadioStationNumber(8);
        rad.setMinRadioStationNumber(2);
        rad.setRadioStationNumber(4);
        rad.setSoundVolume(80);

        Assertions.assertEquals(9, rad.getQuantityRadioStationNumber());
        Assertions.assertEquals(8, rad.getMaxRadioStationNumber());
        Assertions.assertEquals(2, rad.getMinRadioStationNumber());
        Assertions.assertEquals(4, rad.getRadioStationNumber());
        Assertions.assertEquals(80, rad.getSoundVolume());
    }

    @Test
    public void testRadioStationNumberTwoConstructor() {
        Radio rad = new Radio(20, 19, 0, 4, 0);

        rad.setQuantityRadioStationNumber(24);
        rad.setMaxRadioStationNumber(23);
        rad.setMinRadioStationNumber(2);
        rad.setRadioStationNumber(4);
        rad.setSoundVolume(80);

        Assertions.assertEquals(24, rad.getQuantityRadioStationNumber());
        Assertions.assertEquals(23, rad.getMaxRadioStationNumber());
        Assertions.assertEquals(2, rad.getMinRadioStationNumber());
        Assertions.assertEquals(4, rad.getRadioStationNumber());
        Assertions.assertEquals(80, rad.getSoundVolume());
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
        Radio rad = new Radio(20, 19, 0, 18, 0);

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
        Radio rad = new Radio(20, 19, 0, 0, 0);

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
        Radio rad = new Radio(15, 14, 0, 0, 0);

        rad.setRandomRadioStationNumber(15);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumberOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setSoundVolume(80);
        rad.setNext();


        Assertions.assertEquals(9, rad.getRadioStationNumber());
        Assertions.assertEquals(81, rad.getSoundVolume());
    }

    @Test
    public void testNextNumberTwoConstructor() {
        Radio rad = new Radio(25, 24, 0, 18, 80);

        rad.setNext();

        Assertions.assertEquals(19, rad.getRadioStationNumber());
        Assertions.assertEquals(81, rad.getSoundVolume());
    }

    @Test
    public void testNextMaxBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);
        rad.setSoundVolume(100);
        rad.setNext();


        Assertions.assertEquals(0, rad.getRadioStationNumber());
        Assertions.assertEquals(100, rad.getSoundVolume());
    }

    @Test
    public void testNextMaxBorderTwoConstructor() {
        Radio rad = new Radio(25, 24, 0, 24, 100);

        rad.setNext();

        Assertions.assertEquals(0, rad.getRadioStationNumber());
        Assertions.assertEquals(100, rad.getSoundVolume());
    }

    @Test
    public void testPrevOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);
        rad.setSoundVolume(80);
        rad.setPrev();

        Assertions.assertEquals(7, rad.getRadioStationNumber());
        Assertions.assertEquals(79, rad.getSoundVolume());
        ;
    }

    @Test
    public void testPrevTwoConstructor() {
        Radio rad = new Radio(20, 19, 0, 18, 80);

        rad.setPrev();

        Assertions.assertEquals(17, rad.getRadioStationNumber());
        Assertions.assertEquals(79, rad.getSoundVolume());
        ;
    }

    @Test
    public void testPrevMinBorderOneConstructor() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);

        rad.setPrev();

        Assertions.assertEquals(9, rad.getRadioStationNumber());
        Assertions.assertEquals(0, rad.getSoundVolume());
    }

    @Test
    public void testPrevMinBorderTwoConstructor() {
        Radio rad = new Radio(17, 16, 0, 0, 0);

        rad.setPrev();

        Assertions.assertEquals(16, rad.getRadioStationNumber());
        Assertions.assertEquals(0, rad.getSoundVolume());
    }

}