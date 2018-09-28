import java.io.Console;

public class App {
    public static void main(String[] args)
    {
        Console console = System.console();
        System.out.println("Choose an option");
        System.out.println("1. Encrypt and Decrypt");
        System.out.println("2. Decryption\n");
        String MyOption = console.readLine();

        if ("1".equals(MyOption)){
            System.out.println("Enter word or letter to Encrypt and Decrypt\"\n");
            String Optionone = console.readLine();
            System.out.println("Enter key number between (1-26) to encrypt");
            String chosenNumber = console.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);
            String enc = Encode.encrypt(Optionone, chosenInt);
            String dec = Decode.decrypt(Encode.encrypt(Optionone,chosenInt ), chosenInt);
            System.out.println("Encrypted: "+enc);
            System.out.println("Decrypted: "+dec);

        }else if("2".equals(MyOption)){
            System.out.println("Enter word or letter to Decrypt");
            String Optiontwo = console.readLine();
            System.out.println("Enter key number between (1-26) to encrypt");
            String chosenNumber = console.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);
            String Dec = Decode.decrypt(Optiontwo,chosenInt);
            System.out.println("Decrypted: "+Dec);

        }else{
            System.out.println("Only words or letters allowed. Wrong Choice");
        }
    }
}
