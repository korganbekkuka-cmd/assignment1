package aitu;

public class Group {
    private String title;
    private Student[] students;
    private int capacity;
    private int numberOfStudents;

    public Group() {
        this("CS-1");
    }

    public Group(String title) {
        this.title = title;
        capacity = 4;
        students = new Student[capacity];
        numberOfStudents = 0;
    }

    public void addStudent(Student s) {
        if (numberOfStudents == capacity) {
            capacity *= 2;
            Student[] newArr = new Student[capacity];
            for (int i = 0; i < numberOfStudents; i++)
                newArr[i] = students[i];
            students = newArr;
        }
        students[numberOfStudents++] = s;
    }

    public double getAverageGpa() {
        double sum = 0;
        for (int i = 0; i < numberOfStudents; i++)
            sum += students[i].getGpa();
        return numberOfStudents == 0 ? 0 : sum / numberOfStudents;
    }

    public void printHallOfFame() {
        for (int i = 0; i < numberOfStudents; i++)
            if (students[i].isHonors())
                System.out.println(students[i].getFullName());
    }

    public boolean removeStudent(int id) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < numberOfStudents - 1; j++)
                    students[j] = students[j + 1];
                numberOfStudents--;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return title + " " + numberOfStudents + " " + getAverageGpa();
    }

    public static void main(String[] args) {
        Group g = new Group("AITU-CS");

        g.addStudent(new Student("Ali", "Khan"));
        g.addStudent(new Student("Dana", "Lee"));

        System.out.println("Task 2: Group");

        System.out.print(g);
        g.printHallOfFame();
    }
}
