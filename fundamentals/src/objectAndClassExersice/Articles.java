package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Articles {
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void Edit (String newContent) {this.content = newContent;}
        public void ChangeAuthot (String newAuthor) {this.author = newAuthor;}
        public void Rename (String newTitle) {this.title = newTitle;}


        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] commmand = reader.readLine().split(", ");
        Article article = new Article(commmand[0],commmand[1],commmand[2]);
        int corrector = Integer.parseInt(reader.readLine());

        while (corrector-- > 0 ){
            String line = reader.readLine();
            String[] token =  line.split(": ");
            if (token[0].equals("Edit")){
                article.Edit(token[1]);
            }else if (token[0].equals("ChangeAuthor")){
                article.ChangeAuthot(token[1]);
            }else if (token[0].equals("Rename")){
                article.Rename(token[1]);
            }
        }
        System.out.println(article.toString());
    }
}
