

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;


public class CollectionSort {
    static class Node{
        Node(int a, int b){
            this.a = a;
            this.b = b;
        }
        int a=0;
        int b=0;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1,55);
        Node node2 = new Node(2,54);
        Node node3 = new Node(3,53);
        Node node4 = new Node(4,52);
        Node node5 = new Node(5,51);
        Node node6 = new Node(6,50);
        String str1 = "i1";
        String str2 = "i2";
        String str3 = "i3";
        String str4 = "i4";
        String str5 = "i5";
        String str6 = "i6";
        HashMap<String,Node> map= new HashMap<String, Node>();
        map.put(str5,node5);
        map.put(str3,node3);
        map.put(str4,node4);
        map.put(str2,node2);
        map.put(str6,node6);
        map.put(str1,node1);
        List<Map.Entry<String,Node>> list = new ArrayList<>();
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Node>  entry = (Map.Entry<String,Node>)iterator.next();
            list.add(entry);
        }
        Collections.sort(list,new Comparator<Map.Entry<String,Node>>(){
            @Override
            public int compare(Map.Entry<String,Node> e1,Map.Entry<String,Node> e2 ){
                return e1.getKey().compareTo(e2.getKey()) ;
                //return e2.getValue().a - e1.getValue().a;
            }
        });

        Iterator iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(((Map.Entry<String,Node>)iter.next()).getKey());
        }


    }


}
