package com.griffin.ceilingfangriffin;

import com.griffin.ceilingfangriffin.enums.*;

import java.time.LocalDate;

/**
 * Represents a ceiling fan with adjustable speed and direction
 */
public class CeilingFan {
    private Speed speed;
    private Direction direction;
    private LocalDate currentDate;

    /**
     * Constructor for Ceiling Fan, sets speed to off and direction to clockwise
     */
    public CeilingFan() {
        this.speed = Speed.OFF;
        this.direction = Direction.CLOCKWISE;
        this.currentDate = LocalDate.now();
    }

    /**
     * Gets the current speed of the fan.
     *
     * @return speed
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * Gets the current direction of the fan.
     *
     * @return direction
     */
    public Direction getDirection () {
        return direction;
    }

    /**
     * Increases the speed of the fan.
     * OFF -> LOW -> MEDIUM -> HIGH -> OFF.
     * If speed is high, it will go to off, otherwise it will go to the next speed
     */
    public void speedCord() {
        if (!isChristmasDay()) {
            speed = (speed == Speed.HIGH) ? Speed.OFF : Speed.values()[speed.ordinal() + 1];
        }
        else System.out.println("It's Christmas");
    }

    /**
     * Reverses the direction of the fan.
     */
    public void directionCord() {
        if (!isChristmasDay()) {
            direction = (direction == Direction.CLOCKWISE) ? Direction.COUNTERCLOCKWISE : Direction.CLOCKWISE;
        }
        else System.out.println("It's Christmas");
    }

    /**
     * Checks if the current date is Christmas (December 25th).
     *
     * @return true if it's Christmas, otherwise returns false.
     */
    public boolean isChristmasDay() {
        return currentDate.getMonthValue() == 12 && currentDate.getDayOfMonth() == 25;
    }

    /**
     * Sets the current date, implemented primarily for testing.
     *
     * @param date
     */
    public void setCurrentDate(LocalDate date) {
        this.currentDate = date;
    }
}
