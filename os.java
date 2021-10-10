import java.lang.String;

public class os {
    public static void main(String[] args){
        String os = System.getProperty("os.name");
        if(os == "Linux"){
            System.out.println("Bruh imagine not using windows can't be me.");
        }
        else if(os == "Windows 10"){
            System.out.println("Bruh imagine having like 100 processes at startup, couldn't be me.");
        }
       
        System.out.println(os);
    }
}
