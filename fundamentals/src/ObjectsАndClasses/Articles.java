package ObjectsАndClasses;

import java.util.Scanner;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit (String newContent){
        this.content = newContent;
    }
    public  void  changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",this.title,this.content,this.author);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(", ");
        Articles article = new Articles(data[0],data[1],data[2]);
        int a = Integer.parseInt(scan.nextLine());

        while (a -- > 0){
            String[] tokens = scan.nextLine().split(": ");
            String command = tokens[0];

            if (command.equals("Edit")){
                article.edit(tokens[1]);

            }else if (command.equals("ChangeAuthor")){
                article.changeAuthor(tokens[1]);

            }else {
                article.rename(tokens[1]);

            }
        }
        System.out.println(article.toString());




    }
}
