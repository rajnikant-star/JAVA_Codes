import java.util.*;

public class StudentsMArksManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            list.add(sc.nextInt());
        }
            System.out.print(list);
        System.out.println();
        for(int i=0;i<10;i=i+2){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("Search Mark: ");
        int smark = sc.nextInt();
            if(list.contains(smark)){
                System.out.println(list.indexOf(smark));
            }
            else System.out.println("Mark not Found");
        System.out.println("Enter new mark for index 3: ");
        int nmark = sc.nextInt();
            list.set(3,nmark);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println("Size of ArrayList"+list.size());
        System.out.println("Max Marks: "+Collections.max(list));
        System.out.println("Min Marks: "+Collections.min(list));
    }
}
