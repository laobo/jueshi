package com.dxc.enums;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by duanxiangchao on 2015/11/9.
 */
public class EnumMapDemo {

    public static void main(String [] arg){
        Set<Herb> garden = new HashSet<Herb>();
        garden.add(new Herb("herb1", Herb.Type.ANNUAL));
        garden.add(new Herb("herb2", Herb.Type.PERENNIAL));
        garden.add(new Herb("herb3", Herb.Type.ANNUAL));
        garden.add(new Herb("herb4", Herb.Type.TWOYEARS));
        garden.add(new Herb("herb5", Herb.Type.TWOYEARS));
        garden.add(new Herb("herb6", Herb.Type.ANNUAL));
        Map<Herb.Type, Set<Herb>> map = test1(garden);
        System.out.println(map);
    }

    public static Map<Herb.Type, Set<Herb>> test1(Set<Herb> garden){
        Map<Herb.Type, Set<Herb>> herbByType = new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);
        for(Herb.Type t: Herb.Type.values()){
            herbByType.put(t, new HashSet<Herb>());
        }
        for(Herb herb: garden){
            herbByType.get(herb.getType()).add(herb);
        }
        return herbByType;
    }

}
