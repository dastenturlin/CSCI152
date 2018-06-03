/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson21;

import adt.Map;
import impl.LLQueueMap;

/**
 *
 * @author dasten
 */
public class Lesson21 {
    public static void main(String[] args) throws Exception
    {
        Map <Integer, String> scomp = new LLQueueMap();
    
        //scomp = sports competition
    
        try {
            scomp.removeAny();
        } catch (Exception e) {
            System.out.println(e);
        }
    System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.define(2010, "Vancouver");
        scomp.define(2008, "Beijing");
        scomp.define(2012, "London");
        scomp.define(2014, "Sochi");
        scomp.define(2016, "Rio");
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.remove(2008);
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.remove(2006);
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.define(2010, "South Africa");
        scomp.define(2014, "Brazil");
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        
        scomp.define(2002, "Salt Lake City");
        scomp.define(2004, "Athens");
        scomp.define(2006, "Torino");
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.removeAny();
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.removeAny();
        System.out.print(scomp.getSize());
        System.out.println(scomp);  
        
        scomp.clear();
        System.out.print(scomp.getSize());
        System.out.println(scomp);
        
        scomp.define(2018, "Pyongchang");
        scomp.define(2020, "Tokyo");
        System.out.print(scomp.getSize());
        System.out.print(scomp);
        

       // scomp.contains(2020);
    }
}
