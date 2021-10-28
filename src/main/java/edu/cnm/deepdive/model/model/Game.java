package edu.cnm.deepdive.model.model;

import java.util.Random;

public class Game {

  private final Tally tally;
  private final Random rng;

  public Game(Random rng) {
    this.rng = rng;
    tally = new Tally();
  }

  public Round play(int rounds) {
    Round round = null;
    for (int i = 0; i < rounds; i++) {
      round = new Round();
      round.play(rng);
      if (round.isWin()) {
        tally.win();
      } else {
        tally.lose();
      }
    }
    return round;
  }

  public int getPlays() {
    return tally.getPlays();
  }

  public double getPercentage() {
    return tally.getPercentage();
  }
    public int getWins() {
      return tally.getWins();
    }
    public int getLosses() {
      return tally.getLosses();
    }
  }


