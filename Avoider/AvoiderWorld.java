import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Avatar avatar = new Avatar();
        addObject(avatar,268,153);
        Enemy enemy = new Enemy();
        addObject(enemy,527,5);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,351,22);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,260,9);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,202,8);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,138,22);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,83,18);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,32,13);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,470,11);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,398,65);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,289,71);
    }
    
    public void act(){
      if(Greenfoot.getRandomNumber(100) < 2){
        Enemy e = new Enemy();
        int x = 300;
        int y = 0;
        super.addObject(e, x, y);
      }
    }
}
