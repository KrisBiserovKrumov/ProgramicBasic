package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ExtractFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        List<String> fileInfo = Arrays.asList(text.substring(text.lastIndexOf("\\")+ 1).split("\\."));
        String fieldName = String.join(".",fileInfo.subList(0,fileInfo.size() -1));
        String extraction = fileInfo.get(fileInfo.size() - 1);
        System.out.printf("File name: %s%n",fieldName);
        System.out.printf("File extension: %s%n",extraction);
    }
}
