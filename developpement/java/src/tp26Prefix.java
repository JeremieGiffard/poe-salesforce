import java.util.Scanner;

public class tp26Prefix {
    static boolean prefix(String arg, String arg2){  //surcharge
        boolean isPrefix = false;
        char[] mot = arg.toCharArray();
        StringBuilder prefix = new StringBuilder(arg2);
        for(char item:mot){
            int index = prefix.indexOf(""+item);
            if(index != -1){
                prefix.deleteCharAt(index);
            }else{
                break;
            }
        }
        if(prefix.length()==0) {
            isPrefix= true;
        }
        return isPrefix;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte : ");
        String texte= input.nextLine();

        System.out.println("Entrez un deusième texte : ");
        String texte2= input.nextLine();
        System.out.println("Prefix ? : "+prefix(texte,texte2));
    }
}
