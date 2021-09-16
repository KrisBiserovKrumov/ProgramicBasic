package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> product = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            product.add(reader.readLine());
        }
        Collections.sort(product,Collections.reverseOrder());

        for (int i = 1; i <= n ; i++) {
            System.out.println(i + "." + product.get(i - 1));

        }
    }
}
