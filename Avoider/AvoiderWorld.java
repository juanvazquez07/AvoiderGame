import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{
    private GreenfootSound bkgMusic;
    private Counter scoreBoard;
    private int enemySpawnRate;
    private int enemySpeed;
    private int nextLevel = 100;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        bkgMusic = new GreenfootSound("sounds/UFO_T-Balt.mp3");
        bkgMusic.playLoop();
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
        scoreBoard = new Counter("Score: ");
        addObject(scoreBoard, 70, 20);
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
        removeObject(enemy9);
        removeObject(enemy8);
        removeObject(enemy);
        removeObject(enemy2);
        removeObject(enemy10);
        removeObject(enemy3);
        removeObject(enemy4);
        removeObject(enemy5);
        removeObject(enemy6);
        removeObject(enemy7);
    }
    
    public void act(){
      if(Greenfoot.getRandomNumber(100) < enemySpawnRate){
        Enemy e = new Enemy();
        e.setSpeed(enemySpeed);
        addObject(e, Greenfoot.getRandomNumber(getWidth()-20)+10, -30);
        scoreBoard.setValue(scoreBoard.getValue() + 1);
      }
      increaseLevel();
    }
    
    public void endGame()
    {   
        bkgMusic.stop();
        AvoiderGameOverWorld go = new AvoiderGameOverWorld();
        Greenfoot.setWorld(go);
    }
    
    private void increaseLevel() {
      int score = scoreBoard.getValue();
      if( score > nextLevel ) {
        enemySpawnRate += 2;
        enemySpeed++;
        nextLevel += 100;
      }
    }
}
