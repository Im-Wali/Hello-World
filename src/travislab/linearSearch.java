/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travislab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jihun
 */
public class linearSearch {
    
    public static void main(String[] args){

        List<String> StringList = new ArrayList<>();
        List<Integer> IntegerList = new ArrayList<>();
        
        int re1,re2,re3,re4;
        
        StringList.add("a");
        StringList.add("b");
        StringList.add("c");
        StringList.add("d");
        
        IntegerList.add(4);
        IntegerList.add(3);
        IntegerList.add(2);
        IntegerList.add(1);
        
        //first position
        //third position
        //handle not finding a match
        
        re1 = linearSearchs(StringList, x->x.equals("a"));
        re2 = linearSearchs(StringList, x->x.equals("b"));
        re3 = linearSearchs(StringList, x->x.equals("c"));
        re4 = linearSearchs(StringList, x->x.equals("d"));
        System.out.println(re1 + ", " + re2  + ", " + re3 + ", " + re4);
        
        re1 = linearSearchs(IntegerList, x->x.equals(1));
        re2 = linearSearchs(IntegerList, x->x.equals(2));
        re3 = linearSearchs(IntegerList, x->x.equals(3));
        re4 = linearSearchs(IntegerList, x->x.equals(4));
        System.out.println(re1 + ", " + re2  + ", " + re3 + ", " + re4);
        
        re1 = linearSearchs(IntegerList, x->x.equals(5));
        System.out.println(re1);
    }
    
    public static <T> int linearSearchs (List<T> list, Predicate<T> check){
        int index = 0 ;
        
        for(T thing : list){
            if(check.test(thing))
                return index;
            index++;
        }
        return -1;
    }
}


