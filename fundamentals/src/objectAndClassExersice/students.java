package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class students {
    static class Students{
        String name;
        String lastName;
        double grade;

        public Students(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        String getName(){
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        String getLastName(){
            return this.lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        double getGrade () {
            return this.grade;
        }
        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " " + lastName +": " + String.format("%.2f",grade);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberStudents = Integer.parseInt(reader.readLine());
        List<Students> studentsGrade = new ArrayList<>();



        for (int i = 0; i <numberStudents ; i++) {
            String[] gradeByStudents = reader.readLine().split(" ");
            String name = gradeByStudents[0];
            String lastName = gradeByStudents[1];
            double grade = Double.parseDouble(gradeByStudents[2]);
            Students student = new Students(name,lastName,grade);
            studentsGrade.add(student);
        }
        studentsGrade.stream()
                .sorted((e1,e2)-> Double.compare(e2.getGrade(),e1.getGrade())).forEach(System.out::println);


    }
}
