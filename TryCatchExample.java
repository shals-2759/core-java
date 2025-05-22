import java.util.Scanner; 
public class TryCatchExample { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
try { 
System.out.print("Enter the numerator: "); 
int numerator = scanner.nextInt(); 
System.out.print("Enter the denominator: "); 
int denominator = scanner.nextInt(); 
int result = numerator / denominator; 
System.out.println("Result: " + result); 
} catch (ArithmeticException e) { 
System.out.println("Error: Division by zero is not allowed."); } catch (Exception e) { 
System.out.println("Invalid input. Please enter integers only."); } finally { 
scanner.close(); 
} 
} 
} 
