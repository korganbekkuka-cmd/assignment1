package aitu;

import java.util.Random;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private double[] grades;

    private static int nextId = 250001;
    private static String domain = "astanait.edu.kz";

    public Student() {
        this("John", "Wick");
    }

    public Student(String f, String l) {
        id = nextId++;
        firstname = f;
        lastname = l;
        grades = new double[0];
    }

    public Student(String f, String l, double[] g) {
        this(f, l);
        grades = g;
    }

    public int getId() { return id; }
    public String getFullName() { return firstname + " " + lastname; }

    public double getGpa() {
        if (grades.length == 0) return 0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    public boolean isHonors() {
        return getGpa() >= 3.5;
    }

    public String getEmail() {
        return id + "@" + domain;
    }

    public void addGrade(double g) {
        double[] newArr = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++)
            newArr[i] = grades[i];
        newArr[grades.length] = g;
        grades = newArr;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ali", "Khan");
        students[1] = new Student("Dana", "Lee");
        students[2] = new Student("Arman", "Nur");

        Random r = new Random();

        for (Student s : students) {
            for (int i = 0; i < 5; i++)
                s.addGrade(2.0 + r.nextDouble() * 2);
            System.out.println(
                    s.getId() + " " +
                            s.getFullName() + " " +
                            s.getEmail() + " " +
                            s.getGpa()
            );
        }
    }
}
