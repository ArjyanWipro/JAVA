package GenericsExtra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int studentCount=10;
        List<Student> students=new ArrayList<>();

        for(int i=0;i<10;i++){
            students.add(new Student());
        }

        students.add(new bitsStudent());
        printList(students);

        List<bitsStudent> bitsStudents=new ArrayList<>();
        for(int i=0;i<10;i++){
            bitsStudents.add(new bitsStudent());
        }

        printList(bitsStudents);
    }

    public static void printList(List students){
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
