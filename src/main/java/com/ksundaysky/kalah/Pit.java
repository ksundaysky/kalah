package com.ksundaysky.kalah;

class Pit {
    private int seeds;

    Pit(int seeds) {
        this.seeds = seeds;
    }

    int removeSeeds() {
        int seedsInHand = seeds;
        seeds = 0;
        return seedsInHand;
    }

    void addSeed() {
        seeds++;
    }
}
