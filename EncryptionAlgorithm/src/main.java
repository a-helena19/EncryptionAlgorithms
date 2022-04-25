public class main {
    public static void main(String[] args) {
        final String secretKey = "ssshhhhhhhhhhh!!!!";

        System.out.println("Please enter your message:");
        // Enter the Message to get Encrypted here
        String originalString = "Welcome to twinformatics";
        System.out.println(originalString + "\n");

        System.out.println("Encrypting entered message ...");
        String encryptedString = Encryption.encrypt(originalString, secretKey) ;
        System.out.println(encryptedString+ "\n");

        System.out.println("Decrypting entered message ...");
        //change the variable (encryptedString) to originalString if you would like to decrypt a message
        String decryptedString = Encryption.decrypt(encryptedString, secretKey) ;
        System.out.println(decryptedString+ "\n");
    }
}

