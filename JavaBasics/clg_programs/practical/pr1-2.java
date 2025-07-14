// // Student Portal with Inner Classes, Object Class
// // Methods, and Memory Concepts
// //class diagram-directly class tya databse ma dekay jaay-uml
// //overriden method()::equals(Object),tostring(),hashCode(),equalto(content check karse)
// //ifdon"t use inheritance the default specifer is used as package ma hoy

package clg_programs.practical;
import java.util.*;

// class Student {
//     private String name;
//     private int rollNo;
//     private String branch;

//     public Student(String name, int rollNo,String branch) {
//         this.name = name;
//         this.rollNo = rollNo;
//         this.branch=branch;
//     }

//     @Override
//     //toString method is used to return a string representation of the object
//     //it is used to print the object in a readable format
//     public String toString() {
       
//         return "Student{name='" + name + "', rollNo=" + rollNo + ", branch='" + branch + "'}";
//     }

//     @Override//object class ma method hoy
//     //equals method is used to compare two objects for equality 
//     // public boolean equals(Object obj) {
//     //     if (this == obj) return true;
//     //     if (!(obj instanceof Student)) return false;
//     //     Student student = (Student) obj;
//     //     return rollNo == student.rollNo && name.equals(student.name);
//     // }
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         Student student = (Student) obj;
//         // return rollNo == student.rollNo && name.equals(student.name);
//         return Objects.equals(name, student.name) && rollNo == student.rollNo && Objects.equals(branch, student.branch);

//     }

//     @Override
//     public int hashCode() {
//         // int result = name.hashCode();
//         // result = 31 * result + rollNo;
//         // result = 31 * result + branch.hashCode();
//         // return result;
//         return Objects.hash(name, rollNo, branch);
//     }

//     class InnerClass {
//         public void display() {
//             System.out.println("Inner class method called.");
//         }
//     }
//     public static void main(String[] args) {
//         Student student1 = new Student("disu", 101, "Computer Science");
//        Student student2 = new Student("disu", 101, "Computer Science");
//         Student student3 = new Student("pushti", 102, "Information Technology");  
        
//         // Using the toString method to print the object
//         System.out.println(student1);
        
//     }
// }

class Student
{
    String name;
    int id;
    double gpa;
    List<Course> courses = new ArrayList<>();

      public Student(String name, int id, double gpa)
       {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    class Course
    {
        String courseName;
        int credits;

         Course(String courseName, int credits)
        {
            this.courseName = courseName;
            this.credits = credits;
        }

        @Override
        public String toString()
        {
            return courseName + " (" + credits + " credits)";
        }
    }

    public void enrollInSemester(String semesterName, String[] courseNames, int[] credits) 
    {
         class SemesterEnrollment
          {
            void enroll()
            {
                System.out.println("\n Enrolling " + name + " for " + semesterName + " semester:");
                for (int i = 0; i < courseNames.length; i++)
                {
                    Course c = new Course(courseNames[i], credits[i]);
                    courses.add(c);
                    System.out.println(" Added: " + c);
                }
            }
          }
              SemesterEnrollment enrollment = new SemesterEnrollment();
             enrollment.enroll();
    }
     class ScholarshipEligibility 
     {
        boolean isEligible() 
        {
            return gpa >= 8.0;
        }
    }

     @Override
    public String toString()
    {
        return "Student{name='" + name + "', id=" + id + ", gpa=" + gpa + ", courses=" + courses + "}";
    }

    @Override
    public boolean equals(Object obj)
     {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    
    Student other = (Student) obj;
    return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(name, id);
    }

     public static void main(String[] args) 
     {
        Student s1 = new Student("Disu", 101, 8.5);
        Student s2 = new Student("Pushti", 102, 7.9);

        
        s1.enrollInSemester("3 semester", new String[]{"Java", "DSA"}, new int[]{3, 4});
        s2.enrollInSemester("4 semester", new String[]{"Python", "DBMS"}, new int[]{3, 4});

        System.out.println("\n Student Information:");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\nChecking scholarship:");
        System.out.println(s1.name + " eligible? " + s1.new ScholarshipEligibility().isEligible());
        System.out.println(s2.name + " eligible? " + s2.new ScholarshipEligibility().isEligible());

        System.out.println("\nComparing Students:");
        System.out.println("s1 equals s2? " + s1.equals(s2));

     }
}


