package com.being.developer.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println("Traiping rain water.");
        int elevations[] = { 3, 1, 2, 4, 0, 1, 3, 2 };
        for (int i : elevations) {
            System.out.print(" " + i);
        }
        int total = trappingRainWaterAmount(elevations);
        System.out.print("\ntotal: " + total);
        // output 8
    }

    private static int trappingRainWaterAmount(int elevations[]) {
        int maxElevationsLeft[] = new int[elevations.length];
        int maxElevationsRight[] = new int[elevations.length];
        maxElevationsLeft[0] = elevations[0];
        maxElevationsRight[elevations.length - 1] = elevations[elevations.length - 1];
        for (int i = 1; i < elevations.length; i++) {
            maxElevationsLeft[i] = Math.max(elevations[i], maxElevationsLeft[i - 1]);
        }

        for (int i = elevations.length - 2; i >= 0; i--) {
            maxElevationsRight[i] = Math.max(elevations[i], maxElevationsRight[i + 1]);
        }

        int total = 0;
        for (int i = 0; i < elevations.length; i++) {
            total = total + (Math.min(maxElevationsRight[i], maxElevationsLeft[i]) - elevations[i]);
        }

        return total;
    }
}
