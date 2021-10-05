import java.util.*;


public class Tester {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(1);
        myList.add(0);
        myList.add(-1);
        myList.add(-1);

        plusMinus myClass = new plusMinus();
        myClass.plusMinusFunc(myList);
    }
}
