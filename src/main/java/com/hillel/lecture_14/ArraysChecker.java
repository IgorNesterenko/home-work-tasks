package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

        ArrayList<String> list1 = new ArrayList<>();
        for (int i = list.size()-1; i>=0; i--){
            list1.add(list.get(i));
        }
        return list1;
    }

    public String getLongestString(List<String> list) {

        String result = list.get(0);
        for (String elem : list) {
            if(elem.length() > result.length())
                result = elem;
        }
        System.out.println(result);
        return result;
    }

    public List<String> changeIndex(List<String> list) {
     String element1 = list.get(1);
     String element2 = list.get(3);
     list.set(3, element1);
     list.set(1, element2);

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

        ArrayList<String> newList = new ArrayList<>();
        for (int i=0; i<=list.size()-1; i++){
            if (!newList.contains((list.get(i))))
                newList.add(list.get(i));
        }
        return newList;
    }

    public List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;
    }
}
