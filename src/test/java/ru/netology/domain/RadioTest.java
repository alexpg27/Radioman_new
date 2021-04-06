package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void changeNextStation() {
        Radio radio = new Radio(20);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio(20);

        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void pushNextAfterMaxStation() {
        Radio radio = new Radio(5);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pushPrevAfterMinStation() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void stationAboveMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void stationBelowMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void increasTheVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());

    }

    @Test
    public void turnDownTheVolume() {
        Radio radio = new Radio();

        radio.lowerVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void pushPlusAfterMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void pushMinusAfterMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.lowerVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeAboveMaximum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeBelowMinimum() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}