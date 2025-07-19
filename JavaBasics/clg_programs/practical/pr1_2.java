package clg_programs.practical;

import java.util.*;

class Student {
    String name;
    int id;
    double gpa;
    List<Course> courses = new ArrayList<>();

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    class Course {
        String courseName;
        int credits;

        Course(String courseName, int credits) {
            this.courseName = courseName;
            this.credits = credits;
        }

        @Override
        public String toString() {
            return courseName + " (" + credits + " credits)";
        }
    }

    public void enrollInSemester(String semesterName, String[] courseNames, int[] credits) {
        class SemesterEnrollment {
            void enroll() {
                System.out.println("\nEnrolling " + name + " for " + semesterName + " semester:");
                for (int i = 0; i < courseNames.length; i++) {
                    Course c = new Course(courseNames[i], credits[i]);
                    courses.add(c);
                    System.out.println("Added: " + c);
                }
            }
        }
        SemesterEnrollment enrollment = new SemesterEnrollment();
        enrollment.enroll();
    }

    class ScholarshipEligibility {
        boolean isEligible() {
            return gpa >= 8.0;
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", gpa=" + gpa + ", courses=" + courses + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}


public class pr1_2 {
    public static void main(String[] args) {
        Student s1 = new Student("Disu", 101, 8.5);
        Student s2 = new Student("Pushti", 102, 7.9);

        s1.enrollInSemester("3rd semester", new String[]{"Java", "DSA"}, new int[]{3, 4});
        s2.enrollInSemester("4th semester", new String[]{"Python", "DBMS"}, new int[]{3, 4});

        System.out.println("\nStudent Information:");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\nChecking scholarship:");
        System.out.println(s1.name + " eligible? " + s1.new ScholarshipEligibility().isEligible());
        System.out.println(s2.name + " eligible? " + s2.new ScholarshipEligibility().isEligible());

        System.out.println("\nComparing Students:");
        System.out.println("s1 equals s2? " + s1.equals(s2));
    }
}
