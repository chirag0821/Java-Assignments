//Given  a  String,  find  the first  non-repeated  character  in  it  using Stream functions.
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args){
        String str = "this is sample text";
        str = str.toLowerCase();

        Map<Integer, Long> ch = str.codePoints().mapToObj(cp -> cp).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int position = ch.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
        System.out.println(String.valueOf(Character.toChars(position)));
    }    
}
