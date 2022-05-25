import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 340, 1, false); 
        Ant x = new Ant();
        addObject(x, 300, 325);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        spawnBread();
    }
    
    public void spawnBread()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Bread bread = new Bread();
        addObject(bread, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label(" Game Over :'( ", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
