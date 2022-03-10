import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> yala = new ArrayList<>(10);


        yala.add(1);
        yala.add(2);
        yala.add(3);
        yala.add(4);
        yala.add(5);
        yala.add(6);
        yala.add(7);
        yala.add(8);
        yala.add(9);
        yala.add(10);
        yala.add(11);
        yala.add(12);
        yala.add(13);
        yala.add(14);
        yala.add(15);
        yala.add(16);
        yala.add(17);
        yala.add(18);
        yala.add(19);
        yala.add(20);

        yala.set(1,50);

        yala.remove(1);
        yala.trimToSize();

        System.out.println(yala.contains(20));
    }
}