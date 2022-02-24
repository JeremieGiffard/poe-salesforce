import java.util.Scanner;

public class TP17_18ManipulerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez String : ");
        String lettre= input.nextLine();

        StringBuilder reverseString = new StringBuilder();
        reverseString.append(lettre); //passe lettre dans StringBuilder
        reverseString.reverse();
        String checkValue = String.valueOf(reverseString); //StringBuilder to String
        System.out.println("input : "+lettre+"\n"+"Output : "+reverseString);
        if(lettre.equals(checkValue)){
            System.out.println("\nAu fait, c'est un palindrome");
        }
    }
}
