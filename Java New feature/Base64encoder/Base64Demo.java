import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        String originalText = "Hello world";
        
        // Encoding text to base64
        String encodedText = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("Encoded text: " + encodedText);
        // Decoding base64 back to text
        byte[] decodeBytes = Base64.getDecoder().decode(encodedText);
        String decodedText= new String(decodeBytes);
        System.out.println("Decoded text-- " + decodedText);
    }
    
}
