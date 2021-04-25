package com.coco.challenges;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step it was noted if it was an uphill, , or a downhill, step. Hikes always start and end at sea level, and each step up or down represents a
 *
 * unit change in altitude. We define the following terms:
 *
 *     A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 *     A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 *
 * Given the sequence of up and down steps during a hike, find and print the number of valleys (or mountains) walked through (or over).
 *
 * Example
 *
 * The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high. Finally, the hiker returns to sea level and ends the hike.
 */
public class Hiking {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int altitude = 0;
        int valleys = 0;
        boolean goingUphill = false;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                goingUphill = true;
                altitude++;
            } else {
                altitude--;
                goingUphill = false;
            }
            if (altitude == 0 && goingUphill) {
                valleys++;
            }
        }
        return valleys;
    }

    public static int countingMountains(int steps, String path) {
        // Write your code here
        int altitude = 0;
        int mountains = 0;
        boolean goingDownhill = false;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                goingDownhill = false;
                altitude--;
            } else {
                altitude++;
                goingDownhill = true;
            }
            if (altitude == 0 && goingDownhill) {
                mountains++;
            }
        }
        return mountains;
    }
}
