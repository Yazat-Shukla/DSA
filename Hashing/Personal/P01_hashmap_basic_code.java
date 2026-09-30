import java.util.*;
public class P01_hashmap_basic_code {
    public static void main(String[] args){
        //country{key},population{value}
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion operation
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
//
//        //search
//        if(map.containsKey("China")) {
//            System.out.println("Key is present in the map");
//        }
//        System.out.println(map.get("China"));
//        System.out.println(map.get("Chin"));

//    int[] arr = {12,15,18};
//    for (int i = 0;i<3;i++){
//        SYstem.out.println(arr[i]+" ");
//    }
//    System.out.println();
//    for (int val: arr){
//        SYstem.out.print(val+" ");
//    }
//    System.out.println();
    //Map.Entry<Integer,Integer>e:Map.entrySet();
//    for (Map.Entry<String,Integer> e : map.entrySet()){
//        System.out.println(e.getKey());
//        System.out.println(e.getValue());
//    }
//    Set<String> keys = map.keySet();
//    for (String key:keys){
//        System.out.println(key+" "+map.get(key));
//    }

     map.remove("China");
     System.out.println(map);
    }
}
