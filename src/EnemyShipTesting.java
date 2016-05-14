import java.util.Scanner;

/**
 * Created by Asus on 5/13/2016.
 */
public class EnemyShipTesting {


    public static void main(String[] args) {
        //EnemyShip ufoShip =new UFOEnemyShip();
        HeroShipFactory shipfactory=new HeroShipFactory();
        HeroShip theHero = null;
        EnemyShipFActory shipFActory=new EnemyShipFActory();
        EnemyShip theEnemy = null;

        Scanner userInput=new Scanner(System.in);
        System.out.println("What type of ship?? (U/R/B)");
        if(userInput.hasNextLine())
        {
            String typeofShip=userInput.nextLine();
            theEnemy =shipFActory.makeEnemyShip(typeofShip);
        }
        if(userInput.hasNextLine())
        {
            String ship=userInput.nextLine();
            theHero =shipfactory.makingHeroShip(ship);
        }

        if(theEnemy!=null && theHero!=null)
        {
            doStuffEnemy(theEnemy,theHero);
        }
        else System.out.println(" Enter a U or B or R an 2nd input is W or G  or M next time");





       /*without using enemyshipfactory
        EnemyShip theEnemy = null;
        Scanner userInput=new Scanner(System.in);
        String enemyShipOption="";
        System.out.println("What type of ship?? (U/R)");
        if(userInput.hasNextLine())
        {
            enemyShipOption=userInput.nextLine();

        }
        if(enemyShipOption.equals("U"))
        {
            theEnemy=new UFOEnemyShip();
        }
        else if(enemyShipOption.equals("R"))
        {
            theEnemy=new RocketEnemyShip();
        }
        doStuffEnemy(theEnemy);
        */
    }


    public static void doStuffEnemy(EnemyShip anEnemyShip,HeroShip anHeroShip)
    {
        anEnemyShip.displayEnemyShip();
        anHeroShip.displayHero();
        anHeroShip.displayLife();

        //System.out.println("Hero Present Life: "+anEnemyShip.getLife());
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoot();
        anEnemyShip.enemyShipSpeed();
        double z=anHeroShip.getLife()-anEnemyShip.getDamage();
        if (z>0)System.out.println("AFter attcked, The life of "+anHeroShip.getNameHero()+"is: "+z);
        else System.out.println(anHeroShip.getNameHero()+" is Dead ");
    }
}
