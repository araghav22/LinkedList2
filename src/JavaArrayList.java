import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i<10 ;i++) {
            list.add(i,new Integer(i + 1));
        }

        list.remove(5);
        list.isEmpty();
        System.out.println(list.indexOf(4));

        for (Integer integer : list) {

            System.out.println(integer);

        }

    }
}
