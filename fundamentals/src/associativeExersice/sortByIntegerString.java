package associativeExersice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class sortByIntegerString {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbs = Arrays.asList(1,4,7,9,3,5,6);

        numbs.stream().sorted((numb1,numb2)-> Integer.compare(numb1,numb2))
                . forEach(System.out:: println);



        List<String> name = Arrays.asList("pesho","gosho","dimitur");
        name.stream().sorted((name1,name2)-> Integer.compare(name1.length(),name2.length())
        )
                . forEach(System.out:: println);


    }
}
