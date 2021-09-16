package associativeExersice;

import java.util.*;

public class putAndPrint {
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new LinkedHashMap<>();

        phonebook.put("John" , new ArrayList<>());
        phonebook.put("Lissa" , new ArrayList<>());
        phonebook.put("Pesho" , new ArrayList<>());

        phonebook.get("Pesho").addAll(Arrays.asList("444 - 333","222 - 333","111 - 333"));

        phonebook.get("John").add("666 - 777");
        phonebook.get("John").add("666 - 888");
        phonebook.get("Lissa").add("777 - 888");
        phonebook.get("Lissa").add("888 - 888");

        for (Map.Entry<String,List<String>> nameAndPhones : phonebook.entrySet()){
            System.out.println(nameAndPhones.getKey());

            for (String phone : nameAndPhones.getValue()){
                System.out.println(" -- " + phone);
            }
        }
    }
}
