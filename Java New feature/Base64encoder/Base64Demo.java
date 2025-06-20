import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        String originalText = "Hello world";
        
        // Encoding text to base64
        String encodedText = java.util.Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("Encoded text: " + encodedText);
    }
    
}
