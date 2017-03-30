class PacManPlayer {
  //instance variables
  private int lives;
  private int score;
  private String image; 
  private boolean powerUp;
  private static int numOfPlayers = 0; 
  // static variables are class variables
  // shared between all objects of the PacManPlayer class
  // static means that memory allocation happens once
  
  public PacManPlayer() {
    lives = 3;
    score = 0;
    image = "msPacMan.png";
    powerUp = false;
    numOfPlayers++;
  }
  
  public PacManPlayer(String img) {
    lives = 3;
    score = 0;
    image = img;
    powerUp = false;
  }
  
  //getters
  public int getLives() {
    return lives;
  }
  
  public int getScore() {
    return score;
  }
  
  public static int getNumOfPlayers() {
    return numOfPlayers;
  }
  
  //setters
  public void setLives(int num) {
    if (num > 0 && num <= 10)
      lives = num;
  }
  
  public String toString () {
    return image + " score: " + score;
  }
                         
}