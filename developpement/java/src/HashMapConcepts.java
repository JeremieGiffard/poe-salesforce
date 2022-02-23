import java.util.HashMap;

public class HashMapConcepts {
    public static void main(String[] args) {
        HashMap<String,String> user= new HashMap<>();
        user.put("email","jgiffard@hotmail.fr");
        user.put("username","jerem");
        user.put("fullName","jeremie giffard");

        HashMap<Integer,String> mois=new HashMap<>();

        String[] nomMois={"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","septembre","Octobre","Novembre","Descembre"};
        int compteur=1;
        for (String m:nomMois){
            mois.put(compteur,m);
            compteur++;
        }
        System.out.println(mois.get(4));


        String phrase="When i am myself, i am happy";
    }
}
