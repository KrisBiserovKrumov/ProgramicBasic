package AssociativeArrays;

import java.util.*;

public class demoTelephone {
    public static void main(String[] args) {
//        HashMap<String,String> phonebook = new HashMap<>();
//        phonebook.put("Lisa Smitt", "089888583764");
//        phonebook.put("John Smitt", "08934656");
//        phonebook.put("Kevin Smitt", "08942365754");
//
//        System.out.println(phonebook.get("John Smitt"));


        HashMap<String, List<String>> phonebook = new HashMap<>();
        phonebook.put("Lisa Smitt", new ArrayList<>());
        phonebook.put("John Smitt", new ArrayList<>());
        phonebook.put("Kevin Smitt", new ArrayList<>());

        List<String> phoneJohnSmitt = phonebook.get("John Smitt");
        phoneJohnSmitt.add("08956457643642");
        phoneJohnSmitt.add("089564");
        phoneJohnSmitt.add("08956111111");

        phonebook.get("Lisa Smitt").add("606 666");

        List<String> phone = Arrays.asList("666 777", " 0943599356", " 7008 8002");

        phonebook.get("Kevin Smitt").addAll(phone);

        for (Map.Entry<String , List<String>> nameAndPhone : phonebook.entrySet()){
            System.out.println(nameAndPhone.getKey());

            List<String> phonee = nameAndPhone .getValue();
            for (String ph : phone) {
                System.out.println( " -- " + ph);
                
            }
        }


    }
}
