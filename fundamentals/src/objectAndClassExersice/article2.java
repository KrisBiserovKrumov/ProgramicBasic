package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class article2 {
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }



        public String getTitle(){
            return this.title;
        }
        public String getContent(){
            return this.content;
        }
        public String getAuthor(){
            return this.author;
        }


        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] line = reader.readLine().split(", ");
            String title= line[0];
            String content = line[1];
            String author = line[2];
            Article article = new Article(title,content,author);
            articleList.add(article);




        }
        String sortBy = reader.readLine();
        if (sortBy.equals("title")){
            articleList.stream().sorted((e2,e1)-> e2.getTitle().compareTo(e1.getTitle())).forEach(System.out::println);
        }else  if (sortBy.equals("content")){
            articleList.stream().sorted((e2,e1)-> e2.getContent().compareTo(e1.getContent())).forEach(System.out::println);
        }else if (sortBy.equals("author")){
            articleList.stream().sorted((e2,e1)-> e2.getAuthor().compareTo(e1.getAuthor())).forEach(System.out::println);
        }
    }
}
