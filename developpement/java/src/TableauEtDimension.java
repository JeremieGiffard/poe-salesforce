public class TableauEtDimension {
    public static void main(String[] args) {
//        2 3 4
//        6 7 8
        double scores[][]=new double[2][3];
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                System.out.println(scores[i][j]);
            }
        }
        int[][] nombres={
                {1,9,3},
                {4,3,2,1},
                {6,8}
        };
        System.out.println("Afficher tableau nombres\n==========");
        System.out.println("{");
        for(int i=0;i<nombres.length;i++){
            System.out.print("{ ");
            for(int j=0;j<nombres[i].length;j++){
                System.out.print(nombres[i][j]+" ");
            }
            System.out.println("}");
            System.out.println();
        }
        System.out.println("}");

//        2 dans le tableau nombres
        System.out.println(nombres[1][2]);
        nombres[1][2]=45;
        System.out.println(nombres[1][2]);
    }
}
