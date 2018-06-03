
import csci152.adt.Map;
import csci152.impl.BSTHashTableMap;
import csci152.impl.BSTMap;
import csci152.impl.LLQHashTableMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aivar Abrashuly
 */
public class Week14 {
    public static void main(String[] args) {
        //lab22_1();
        //lab22_2();
        lab22_3();
    }
    
    public static void lab22_1() {
        Map<Integer, String> map = new BSTMap();
    
    try {
            //Call removeAny twice:
            map.removeAny();
            } catch (Exception ex) {
            System.out.println(ex);
        }
    
        //Defining five unique mappings:
        map.define(10, "Messi");
        map.define(7, "Pedro");
        map.define(11, "Neymar");
        map.define(8, "Iniesta");
        map.define(3, "Pique");
        System.out.println(map.toString());
        
        
        //Remove specific mapping, which is currently in the map:
        map.remove(8);
        System.out.println(map.toString());
        
        //Remove a mapping where key is not actuall in the map:
        map.remove(9);
        System.out.println(map.toString());
        
        //Define 2 new mapping which have same keys, but different values:
        map.define(7, "Coutinho");
        map.define(11, "Dembele");
        System.out.println(map.toString());
        
        //Define 3 new mappings whose keys are not already present in the map:
        map.define(9, "Suarez");
        map.define(4, "Rakitic");
        map.define(23, "D.Suarez");
        System.out.println(map.toString());
        
        try {
            //Call removeAny twice:
            map.removeAny();
            map.removeAny();
            System.out.println(map.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        // Clear the map:
        map.clear();
        System.out.println(map.toString());
        
        // Add 2 new unique mappings:
        map.define(7, "Ronaldo");
        map.define(11, "Salah");
        System.out.println(map.toString());
        
    }
    
    public static void lab22_2() {
        Map<Integer, String> map = new LLQHashTableMap(5);
    
    try {
            //Call removeAny twice:
            map.removeAny();
            } catch (Exception ex) {
            System.out.println(ex);
        }
    
        //Defining five unique mappings:
        map.define(10, "Messi");
        map.define(7, "Pedro");
        map.define(11, "Neymar");
        map.define(8, "Iniesta");
        map.define(3, "Pique");
        System.out.println(map.toString());
        
        
        //Remove specific mapping, which is currently in the map:
        map.remove(8);
        System.out.println(map.toString());
        
        //Remove a mapping where key is not actuall in the map:
        map.remove(9);
        System.out.println(map.toString());
        
        //Define 2 new mapping which have same keys, but different values:
        map.define(7, "Coutinho");
        map.define(11, "Dembele");
        System.out.println(map.toString());
        
        //Define 3 new mappings whose keys are not already present in the map:
        map.define(9, "Suarez");
        map.define(4, "Rakitic");
        map.define(23, "D.Suarez");
        System.out.println(map.toString());
        
        try {
            //Call removeAny twice:
            map.removeAny();
            map.removeAny();
            System.out.println(map.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        // Clear the map:
        map.clear();
        System.out.println(map.toString());
        
        // Add 2 new unique mappings:
        map.define(7, "Ronaldo");
        map.define(11, "Salah");
        System.out.println(map.toString());
        
    }
    
    public static void lab22_3() {
        Map<Integer, String> map = new BSTHashTableMap(5);
    
    try {
            //Call removeAny twice:
            map.removeAny();
            } catch (Exception ex) {
            System.out.println(ex);
        }
    
        //Defining five unique mappings:
        map.define(10, "Messi");
        map.define(7, "Pedro");
        map.define(11, "Neymar");
        map.define(8, "Iniesta");
        map.define(3, "Pique");
        System.out.println(map.toString());
        
        
        //Remove specific mapping, which is currently in the map:
        map.remove(8);
        System.out.println(map.toString());
        
        //Remove a mapping where key is not actuall in the map:
        map.remove(9);
        System.out.println(map.toString());
        
        //Define 2 new mapping which have same keys, but different values:
        map.define(7, "Coutinho");
        map.define(11, "Dembele");
        System.out.println(map.toString());
        
        //Define 3 new mappings whose keys are not already present in the map:
        map.define(9, "Suarez");
        map.define(4, "Rakitic");
        map.define(23, "D.Suarez");
        System.out.println(map.toString());
        
        try {
            //Call removeAny twice:
            map.removeAny();
            map.removeAny();
            System.out.println(map.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        // Clear the map:
        map.clear();
        System.out.println(map.toString());
        
        // Add 2 new unique mappings:
        map.define(7, "Ronaldo");
        map.define(11, "Salah");
        System.out.println(map.toString());
        
    }
    }

