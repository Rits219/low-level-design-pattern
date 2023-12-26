package HashMap;

public class main {
    public static void main(String args[]) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>(15);
        myHashMap.put(1, "Hi");
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(1));

//        Map<String,String> hashMap=new HashMap<>();
//        hashMap.get(1);
    }
}
