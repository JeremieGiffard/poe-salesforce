package DebutJava;

public class Tp14BisTableau {

        public static void main(String[] args) {
            int Array[] = {2,7,5,6,7,1,6,2,1,7,2};
            int currentCount =0;
            int BiggestCounter=0;
            int frequence =0;
            for(int i= 0; i<Array.length; i++){

                for (int j = i; j < Array.length; j++)
                {
                    if (Array[i] == Array[j])
                    {
                        currentCount++;
                    }
                }
                if (currentCount>BiggestCounter){
                    BiggestCounter=currentCount;
                    frequence=Array[i];
                }
                currentCount = 0;
            }
            System.out.println("l’élément le plus fréquent est le " + frequence + " et que sa fréquence d’apparition est " + BiggestCounter);
        }
    }

