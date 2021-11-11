package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetSumStation(){
        Radio radio = new Radio();
        radio.setSumStation(18);
        int expected = 18;
        int actual = radio.getSumStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation17() {
        Radio radio = new Radio();
        radio.setCurrentStation(17);
        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation180() {
        Radio radio = new Radio();
        radio.setCurrentStation(18);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation00() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation170() {
        Radio radio = new Radio();
        radio.setCurrentStation(17);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation17() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        radio.nextStation();
        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.backStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation18() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.backStation();
        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.backStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void backStation16() {
        Radio radio = new Radio();
        radio.setCurrentStation(17);
        radio.backStation();
        int expected = 16;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentVolume88() {
        Radio radio = new Radio();
        radio.setCurrentVolume(88);
        int expected = 88;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume00() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume00() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }
}
