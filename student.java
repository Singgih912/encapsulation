public class student extends person {
    private int numCourses = 0;
    private String[] courses = new String[30]; // max 30 courses
    private int[] grades = new int[30];

    public student(String name, String address) {
        super(name, address);
    }
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void printGrades() {
        System.out.print("Grades: ");
        for (int i = 0; i < numCourses; i++) {

            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }

public double getAverageGrade() {
    if (numCourses == 0) return 0.0;
    int sum = 0;
    for (int i = 0; i < numCourses; i++) {
        sum += grades[i];
    }
    return sum / (double) numCourses;
}

@Override
public String toString() {
    return "student: " + super.toString();
}
}