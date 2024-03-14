package stringClass;
public class StringDemo {
    public static void main(String[] args) {
        // String methods
        String str = "Hello, World!";
        
        // String length
        System.out.println("Length of the string: " + str.length());
        
        // String concatenation
        String anotherStr = " This is Java.";
        String concatenatedStr = str.concat(anotherStr);
        System.out.println("Concatenated String: " + concatenatedStr);
        
        // Substring
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);
        
        // String replace
        String replacedStr = str.replace('l', 'x');
        System.out.println("Replaced String: " + replacedStr);
        
        // String to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseStr);
        
        // String to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseStr);
        
        // StringBuffer methods
        StringBuffer stringBuffer = new StringBuffer("Hello");
        
        // Append
        stringBuffer.append(" World");
        System.out.println("StringBuffer: " + stringBuffer);
        
        // Insert
        stringBuffer.insert(5, ", ");
        System.out.println("StringBuffer after insertion: " + stringBuffer);
        
        // Replace
        stringBuffer.replace(6, 11, "Java");
        System.out.println("StringBuffer after replace: " + stringBuffer);
        
        // Delete
        stringBuffer.delete(5, 10);
        System.out.println("StringBuffer after delete: " + stringBuffer);
        
        // StringBuilder methods
        StringBuilder stringBuilder = new StringBuilder("Hello");
        
        // Append
        stringBuilder.append(" World");
        System.out.println("StringBuilder: " + stringBuilder);
        
        // Insert
        stringBuilder.insert(5, ", ");
        System.out.println("StringBuilder after insertion: " + stringBuilder);
        
        // Replace
        stringBuilder.replace(6, 11, "Java");
        System.out.println("StringBuilder after replace: " + stringBuilder);
        
        // Delete
        stringBuilder.delete(5, 10);
        System.out.println("StringBuilder after delete: " + stringBuilder);
    }
}
