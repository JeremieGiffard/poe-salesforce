package JavaClass;

import java.util.HashMap;

public class HashMapConcepts {
    public static void main(String[] args) {
        /*HashMap<String,String> user= new HashMap<>();
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
        System.out.println(mois.get(4));*/


        String phrase = "When I am Myself, I am hAppy and have a goOd Result";

        // phrase = phrase.replace(" ", "").replace(",", "").toLowerCase();
        phrase = phrase.replaceAll("[\s,]", "").toLowerCase();

        HashMap<Character, Integer> occurences = new HashMap<>();
        for (int i = 0; i < phrase.length(); i++) {
            char lettre = phrase.charAt(i);
            if (occurences.containsKey(lettre)) {
                occurences.replace(lettre, occurences.get(lettre) + 1);
            } else {
                occurences.put(lettre, 1);
            }
        }
        System.out.println(occurences);


        Character maxVal = phrase.charAt(0);
        int max = occurences.get(maxVal);

        for (Character key : occurences.keySet()) {
            if (occurences.get(key) >= max) {
                max = occurences.get(key);
                maxVal = key;
            }
        }


        System.out.printf(" le char le plus frequent est << %s >> avec << %d >> occurences \n", maxVal, max);

    }
}