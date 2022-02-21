import java.util.*;

public class Question3 {
    public static void TrimList( List<String> strs ){
        ListIterator <String> it = strs.listIterator();
        while(it.hasNext()){
            it.set(it.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> li = Arrays.asList(" chirag ", " sahil ", " amol ", " sandesh "," adarsh ");
        TrimList(li);
        for (String str : li) {
            System.out.format("\"%s\"%n", str);
        }
    }

}
