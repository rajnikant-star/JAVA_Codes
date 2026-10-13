import java.util.*;

public class OnlineStorreProductManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(101, "Laptop");
        hashMap.put(105, "Kayboard");
        hashMap.put(103,"Mouse");
        hashMap.put(108,"Moniter");
        hashMap.put(102,"HeadPhones");
        hashMap.put(110,"Webcam");
        hashMap.put(104,"printer");
        hashMap.put(107,"Speaker");

        linkedHashMap.put(101, "Laptop");
        linkedHashMap.put(105, "Kayboard");
        linkedHashMap.put(103,"Mouse");
        linkedHashMap.put(108,"Moniter");
        linkedHashMap.put(102,"HeadPhones");
        linkedHashMap.put(110,"Webcam");
        linkedHashMap.put(104,"printer");
        linkedHashMap.put(107,"Speaker");

        treeMap.put(101, "Laptop");
        treeMap.put(105, "Kayboard");
        treeMap.put(103,"Mouse");
        treeMap.put(108,"Moniter");
        treeMap.put(102,"HeadPhones");
        treeMap.put(110,"Webcam");
        treeMap.put(104,"printer");
        treeMap.put(107,"Speaker");
//2
        System.out.println("Enter product_Id: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product_Name: ");
        String s = sc.nextLine();
        hashMap.put(n,s);
        System.out.println(hashMap);
//3
        System.out.println("Enter product_Id: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product_Name: ");
        String s1 = sc.nextLine();
        if(hashMap.putIfAbsent(n1,s1) != null){
            System.out.println("Exist");
        }
        else System.out.println(hashMap);

        //4
        System.out.print("Enter search key: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        if(hashMap.containsKey(n2)){
            System.out.println(hashMap.get(n2));
        }
        else System.out.println("Not_Exist");
        //5
        System.out.print("PRoduct_Name: ");
        String s3 = sc.nextLine();
        if(hashMap.containsValue(s)){
            System.out.println("Exist");
        }
        //6
        System.out.println("id and Name: ");
        int n5 = sc.nextInt();
        sc.nextLine();
        String s5 = sc.nextLine();
        if(hashMap.containsKey(n5)){
            hashMap.replace(n5,s5);
            System.out.println(hashMap);
        }
        else System.out.println("id not Found");

        if(linkedHashMap.containsKey(n5)){
            linkedHashMap.replace(n5,s5);
            System.out.println(linkedHashMap);
        }
        else System.out.println("id not Found");
        //7

    }
}
