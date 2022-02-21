import java.util.*;

public class Question2 {
    static final Comparator<String> cmp = new Comparator<String>() {
        public int compare(String str1, String str2){
            return str1.compareTo(str2);
        }
    };

    public static void main(String[] args){
        SortedSet<String> s = new TreeSet<String>(cmp);
        String arr[] = {"chirag","amol", "sahil", "sahil","sandesh","amol","chirag","ravi"};
        for(String str : arr){
            s.add(str);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}
