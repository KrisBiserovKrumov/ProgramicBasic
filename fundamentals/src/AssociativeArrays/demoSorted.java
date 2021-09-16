package AssociativeArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class demoSorted {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> nums = Arrays.asList("pesho", "anatoli" , "gosho", "mariika");

        nums.stream().sorted(
                ( el, e2) -> {
                    int firstLenght = el.length();
                    int secondLenght = e2.length();
                    int lenghtCompare = Integer.compare(firstLenght, secondLenght);
                    if (lenghtCompare == 0){
                        int lexCompare = el.compareTo(e2);
                        return lexCompare;


                    }
                    return lenghtCompare;
                }
        ).forEach(System.out :: println);

    }
}
