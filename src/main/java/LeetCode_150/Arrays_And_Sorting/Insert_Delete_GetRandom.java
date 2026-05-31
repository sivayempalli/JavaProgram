package LeetCode_150.Arrays_And_Sorting;

import java.util.*;

public class Insert_Delete_GetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(2);
        boolean param_2 = obj.insert(3);
        int param_3 = obj.getRandom();
        int param_4 = obj.getRandom();
        int param_5 = obj.getRandom();
        int param_6 = obj.getRandom();
        boolean param_7 = obj.remove(2);

        System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4+" "+param_5+" "+param_6+" "+param_7);

    }
}

class RandomizedSet {
    List<Integer> randomeList;
    Map<Integer,Integer> randomMap;
    Random random ;


    public RandomizedSet() {
        randomeList = new ArrayList<>();
        randomMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(randomMap.containsKey(val)){
            return false;
        }

        int size = randomeList.size();
        randomMap.put(val,size);
        randomeList.add(val);

        return  true;
    }

    public boolean remove(int val) {
        System.out.println(randomeList);
        System.out.println(randomMap);

        if(!randomMap.containsKey(val)){
            return  false;
        }
        int index = randomMap.get(val);
        int lastIndex  = randomeList.size();
        int lastElement = randomeList.get(lastIndex-1);

        //insert
        randomeList.set(index,lastElement);
        randomMap.put(lastElement, index);

        //delete
        randomeList.remove(lastIndex-1);
        randomMap.remove(val);

        return true;

    }

    public int getRandom() {
        int index = random.nextInt(randomeList.size());
        return randomeList.get(index);

    }

//    Set<Integer> randomSet ;
//    Iterator<Integer> iterator = randomSet.iterator();
//
//    public RandomizedSet() {
//        randomSet = new HashSet<>();
//    }
//
//    public boolean insert(int val) {
//        if(randomSet.contains(val)){
//            return false;
//        }
//        else{
//            randomSet.add(val);
//            return true;
//
//        }
//    }
//
//    public boolean remove(int val) {
//        if(randomSet.contains(val)){
//            randomSet.remove(val);
//            return true;
//        }
//        else{
//            return false;
//
//        }
//    }
//
//    public int getRandom() {
//        if(iterator.hasNext()){
//            return  iterator.next();
//        }
//        else{
//            iterator = randomSet.iterator();
//            if(iterator.hasNext()){
//                return  iterator.next();
//            }
//
//        }
//        return  0;
//    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
