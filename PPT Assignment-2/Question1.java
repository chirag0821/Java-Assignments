import java.util.*;

public class Question1 {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);

        Collections.shuffle(li);

        //advance for loop
        li.stream().forEach(n->{
            System.out.print(n + " ");
        });

        System.out.println();

        //for loop
        for(int n : li){
            System.out.print(n + " ");
        }
    }    
}
