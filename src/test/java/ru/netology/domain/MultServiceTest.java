package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultServiceTest {


    @Test
    public void currentStation10() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation9() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation8() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentStation00() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation8() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.setNextStation();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setNextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setNextStation();
        int expected = 2;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void backStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setBackStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void backStation9() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setBackStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void backStation8() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setBackStation();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void backStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.setBackStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume8() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume00() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentVolume11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setIncreaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume8() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.setIncreaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume110() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume8() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setReduceVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolume00() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.setReduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
}