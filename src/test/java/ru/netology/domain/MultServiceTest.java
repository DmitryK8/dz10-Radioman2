package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void getSumStation() {
        radio.setSumStation(18);
        int expected = 18;
        int actual = radio.getSumStation();
        assertEquals(expected, actual);

    }

    @Test
    void setSumStation() {
        int expected = 18;
        int actual = radio.getSumStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentStation18() {
        radio.setCurrentStation(18);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation17() {
        radio.setCurrentStation(17);
        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation() {
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation1() {
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation0() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation00() {
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation8() {
        radio.setCurrentStation(7);
        radio.setNextStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation0() {
        radio.setCurrentStation(17);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation1() {
        radio.setCurrentStation(0);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation2() {
        radio.setCurrentStation(1);
        radio.setNextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation0() {
        radio.setCurrentStation(1);
        radio.setBackStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation17() {
        radio.setCurrentStation(0);
        radio.setBackStation();
        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation8() {
        radio.setCurrentStation(9);
        radio.setBackStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation16() {
        radio.setCurrentStation(17);
        radio.setBackStation();
        int expected = 16;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume88() {
        radio.setCurrentVolume(88);
        int expected = 88;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume101() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume0() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume00() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume100() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume99() {
        radio.setCurrentVolume(99);
        radio.setIncreaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume100() {
        radio.setCurrentVolume(100);
        radio.setIncreaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        radio.setCurrentVolume(0);
        radio.setIncreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume8() {
        radio.setCurrentVolume(7);
        radio.setIncreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume101() {
        radio.setCurrentVolume(101);
        radio.setReduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume8() {
        radio.setCurrentVolume(9);
        radio.setReduceVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume0() {
        radio.setCurrentVolume(1);
        radio.setReduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume00() {
        radio.setCurrentVolume(-1);
        radio.setReduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }
}