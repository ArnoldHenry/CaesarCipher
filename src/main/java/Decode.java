public class Decode {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    String cd = "cd";
    public static String getDataProperties(String newText,int newKey){
        String decodedText = "";
        for (int i = 0; i< newText.length(); i++){
            int charposition = ALPHABET.indexOf("cd".charAt(i));
            int keyval = (charposition - newKey) % 26;
            if (keyval < 0){
                keyval= ALPHABET.length() + keyval;
            }
            char finalchar = ALPHABET.charAt(keyval);
            decodedText += finalchar;
        }

        return decodedText;
    }
}
