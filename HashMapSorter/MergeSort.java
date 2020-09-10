import java.util.*;

public class MergeSort {
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

        MergeSort sort = new MergeSort();
        sort.sort(list,0,list.size()-1);

        Iterator iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(((Map.Entry<String,Node>)iter.next()).getKey());
        }


    }

    public void sort(List<Map.Entry<String,Node>> list, int left, int right){
        if(left>=right){
            return;
        }
        int mid =  left+(right-left)/2;
        sort(list,left,mid);
        sort(list,mid+1,right);
        merge(list,left,right);
    }
    public void merge(List<Map.Entry<String,Node>> list, int left, int right){
        List<Map.Entry<String,Node>> tmp = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            tmp.add(list.get(i));
        }
        int size = right - left+1;
        int i = 0;
        int mid = (size-1)/2;
        int j = mid+1;

        for (int k = left; k <= right ; k++) {
            if(i==mid+1){
                list.set(k,tmp.get(j));
                j++;

            }else if(j==size){
                list.set(k,tmp.get(i));
                i++;
            }
            else if(tmp.get(i).getKey().compareTo(tmp.get(j).getKey())>=0){
                list.set(k,tmp.get(i));
                i++;
            }else{
                list.set(k,tmp.get(j));
                j++;
            }
        }

    }

}
