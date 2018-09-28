import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option");
        System.out.println("1. Encrypt and Decrypt");
        System.out.println("2. Decryption\n");
        String MyOption = console.readLine();

        if ("1".equals(MyOption)){
            System.out.println("Enter word or letter to Encrypt and Decrypt\"\n");
            String Optionone = console.readLine();
            String enc = Encode.encrypt(Optionone, 3);
            String dec = Decode.decrypt(Encode.encrypt(Optionone, 3), 3);
            System.out.println("Encrypted: "+enc);
            System.out.println("Decrypted: "+dec);

        }else if("2".equals(MyOption)){
            System.out.println("Enter word or letter to Decrypt");
            String Optiontwo = console.readLine();
            System.out.println(Decode.decrypt(Encode.encrypt(Optiontwo, 3), 3));

        }else{
            System.out.println("Only words or letters allowed. Wrong Choice");

        }


    }
}
