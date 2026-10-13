import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Array_list {
    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>(
          Arrays.asList(78, 65, 90, 65, 82)
        );
        marks.add(95);  // 1
        marks.add(2,88);   //2
        System.out.println(marks.get(3));   //3
        marks.set(1,70);  //4
        System.out.println(marks.contains(90));   //5
        System.out.println(marks.indexOf(65));     //6
        System.out.println(marks.lastIndexOf(65));     //7
        System.out.println(marks.remove(4));    //8
        System.out.println(marks.remove(Integer.valueOf(65)));     //9
        System.out.println(marks.size());    //10
        System.out.println(marks.isEmpty());   //11
        marks.sort(null);    //12

        for(int x:marks){
            System.out.print(x+" ");   //13
        }
        System.out.println();
        Iterator<Integer> it = marks.iterator();    //14
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
