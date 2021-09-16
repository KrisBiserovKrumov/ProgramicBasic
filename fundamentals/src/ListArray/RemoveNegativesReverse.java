package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativesReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numms = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numms.removeIf(e -> e < 0);
        Collections.reverse(numms);
        if (numms.isEmpty()){
            System.out.println("empty");
        }else{
            numms.forEach(integer -> System.out.print(integer + " "));
        }

    }
}
