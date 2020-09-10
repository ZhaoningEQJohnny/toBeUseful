import java.util.*;

public class QuickSort {
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
        HashMap<String, Node> map= new HashMap<String, Node>();
        map.put(str5,node5);
        map.put(str3,node3);
        map.put(str4,node4);
        map.put(str2,node2);
        map.put(str6,node6);
        map.put(str1,node1);
        List<Map.Entry<String, Node>> list = new ArrayList<>();
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Node>  entry = (Map.Entry<String, Node>)iterator.next();
            list.add(entry);
        }

        QuickSort sort = new QuickSort();
        sort.sort(list,0,list.size()-1);

        Iterator iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(((Map.Entry<String, MergeSort.Node>)iter.next()).getKey());
        }


    }
    public void sort(List<Map.Entry<String, Node>> list, int low, int high){
        if(low>=high) return;
        int pivot = partition(list,low,high);
        sort(list,low,pivot-1);
        sort(list,pivot+1,high);
    }
    public int partition(List<Map.Entry<String, Node>> list, int low, int high){
        int p = list.get(high).getValue().a;
        int j = low;
        for (int i = low; i < high; i++) {
            if(list.get(i).getValue().a<p){
                Map.Entry<String,Node> entry = list.get(j);
                list.set(j,list.get(i));
                list.set(i,entry);
                j++;
            }
        }
        Map.Entry<String,Node> entry = list.get(j);
        list.set(j,list.get(high));
        list.set(high,entry);
        return j;
    }
}
