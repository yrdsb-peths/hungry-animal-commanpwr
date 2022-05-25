import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ant extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld)getWorld();
            world.spawnBread();
            world.increaseScore();
        }
    }
}
