
import java.nio.file.Path;
import java.nio.file.Paths;


public class Task15
{
    public static void main(String[] args) {
          Path p=Paths.get("D:\\JAVA\\JavaBasics\\class_programs\\abc.txt");
          System.out.println(p.getFileName());
          System.out.println(p.getName(0));
    }
}