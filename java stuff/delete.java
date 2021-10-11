import java.io.*;
// Use this code to delete any unwanted .class files you get when you execute .java files

class delete{
    public static void main(String[] args){
            File folder = new File(".");
            for (File file : folder.listFiles()) {
                if (file.getName().endsWith(".class")) {
                    file.delete();
                }
        }
    }
}