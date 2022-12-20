import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public abstract class Student {

    // its abstract because we have 2 types of creatable object (undergradueate and
    // gradeted)
    // these instance veriables are final, because they can't be edited after
    // decleration
    final int id_number;
    final String name;
    final int year;

    // gpa part
    public double GPA;

    ArrayList<Course> listOfCourses;
    int numCourses;
    ArrayList<Community> listOfCommunity;

    public Student(int id_number, String name, int year) {
        this.id_number = id_number;
        this.name = name;
        this.year = year;
        listOfCourses = new ArrayList<>();
        listOfCommunity = new ArrayList<>();
    }

    public void showGrades() {
        for (int i = 0; i < numCourses; i++) {
            if (listOfCourses.get(i).grade.getAverage() != -1) {
                System.out.println(listOfCourses.get(i).course_code + " - " + listOfCourses.get(i).course_name);
                listOfCourses.get(i).grade.showGrades();
            } else {
                System.out.println(listOfCourses.get(i).course_code + " - " + listOfCourses.get(i).course_name);
                System.out.println("Lecturer doesn't announced the grades yet !!!");
            }
        }

    }

    public void showGrades(Course course) {
        for (int i = 0; i < numCourses; i++) {
            if (course.course_code == listOfCourses.get(i).course_code) {
                if (listOfCourses.get(i).grade.getAverage() != -1) {
                    System.out.println(course.course_code + " - " + course.course_name);
                    listOfCourses.get(i).grade.showGrades();
                } else {
                    System.out.println(course.course_code + " - " + course.course_name);
                    System.out.println("Lecturer doesn't announced the grades yet !!!");
                }
            }

        }

    }

    public void calculateGPA() {
        float total = 0;
        int totalcredit = 0;
        for (int i = 0; i < numCourses; i++) {
            Double score;
            if (listOfCourses.get(i).grade.getAverage() != -1) {
                if (listOfCourses.get(i).grade.getAverage() <= 100 && listOfCourses.get(i).grade.getAverage() >= 90) {
                    score = 4.00;
                } else if (listOfCourses.get(i).grade.getAverage() <= 89
                        && listOfCourses.get(i).grade.getAverage() >= 85) {
                    score = 3.50;

                } else if (listOfCourses.get(i).grade.getAverage() <= 84
                        && listOfCourses.get(i).grade.getAverage() >= 80) {
                    score = 3.00;
                } else if (listOfCourses.get(i).grade.getAverage() <= 79
                        && listOfCourses.get(i).grade.getAverage() >= 74) {
                    score = 2.50;
                } else if (listOfCourses.get(i).grade.getAverage() <= 74
                        && listOfCourses.get(i).grade.getAverage() >= 65) {
                    score = 2.00;
                } else if (listOfCourses.get(i).grade.getAverage() <= 64
                        && listOfCourses.get(i).grade.getAverage() >= 60) {
                    score = 1.50;
                } else if (listOfCourses.get(i).grade.getAverage() <= 59
                        && listOfCourses.get(i).grade.getAverage() >= 55) {
                    score = 1.00;
                } else if (listOfCourses.get(i).grade.getAverage() <= 54
                        && listOfCourses.get(i).grade.getAverage() >= 50) {
                    score = 0.50;
                } else
                    score = 0.00;

                total = total + (float) (score * listOfCourses.get(i).credit);
                totalcredit = totalcredit + listOfCourses.get(i).credit;
            }
        }
        GPA = total / totalcredit;
    }

}