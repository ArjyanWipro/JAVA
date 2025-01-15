package InterfaceChallenge2;

import java.util.*;

public class Player {
    // write code here
    private String name;
    private String weapon;
    
    private int hitPoints;
    private int strength;
    
    public Player(String name, int hitPoints, int strength){
        this.name=name;

        this.hitPoints=hitPoints;
        this.strength=strength;
        
        weapon="Sword";
    }
    
    //getters
    public String getName(){
        return name;
    }

    public String getWeapon(){
        return weapon;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public int getStrength(){
        return strength;
    }

    //setters
    public void setName(String name){
        this.name=name;
    }

    public void setWeapon(String weapon){
        this.weapon=weapon;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints=hitPoints;
    }

    public void setStrength(int strength){
        this.strength=strength;
    }

    //read method

    public void read(List<String> listOfString){
        
        if (listOfString!=null) {
            
        }
    }
}
