import java.util.Scanner;
public class Tester {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students would you like to create?");
        Student[] stu = new Student[input.nextInt()];
        for (int i = 0; i < stu.length; i ++) {
            System.out.println("Enter first name, last name, age, gpa for Student " + (i + 1));
            stu[i] = new Student(input.next(), input.next(), input.nextInt(), input.nextDouble());
        }
        Student oldest = stu[0];
        Student smartest = stu[0];
        for (Student student: stu) {
            if (student.age > oldest.age) {
                oldest = student;
            }
            if (student.gpa > smartest.gpa) {
                smartest = student;
            }
        }
        System.out.println("The oldest student: " + oldest.toString());
        System.out.println("The student with the highest GPA: " + smartest.toString());
        for (int i = stu.length - 1; i >= 0; i --) {
            for (int j = 0; j < i; j ++) {
                if ((int)(stu[j].lastName.charAt(0)) > (int)(stu[j + 1].lastName.charAt(0))) {
                    Student temp = stu[j + 1];
                    stu[j + 1] = stu[j];
                    stu[j] = temp; 
                }
            }
        }
        for (Student student: stu) {
            System.out.println(student.toString());
        }
    }
}
class Student {
    String firstName = "";
    String lastName = "";
    int age = 0;
    double gpa = 0;   
    public Student () {
    }
    public Student (String firstName, String lastName, int age, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }
    public String toString(){
        return firstName+" "+lastName+", age: "+age+", gpa: "+gpa;
    }
    
}