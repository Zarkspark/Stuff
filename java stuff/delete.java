
import java.io.*;
// Use this code to delete any unwanted .class files you get when you execute .java files

public class delete{
    public static void main(String[] args){
        System.out.println("This java file is used to cleanup any kind of .class files left when compiling code.");
    }

    public static void delete(){
        File folder = new File(".");
        for (File file : folder.listFiles()) {
                if (file.getName().endsWith(".class")) {
                    file.delete();
                }
        }
    }

}