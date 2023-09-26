public class Arrays {
    public static void main(String[] args){
        int x = 10;
        for (x = 0; x <= 10; x += 2){
        }
        System.out.print(x);
        String[] Brand = {"Nike", "Adidas", "Puma", "Umbro", "Jordan"};
        Brand[1] = "Jr";
        System.out.println(Brand[2]);
            System.out.println(Brand[1]);
            System.out.println(Brand.length);
             // ARRAYS LOOP
             String[] Team = {"Barce", "City", "Unted", "Liverpool", "Bayern"};
             for (int i = 0; i < Team.length; i ++){
                 System.out.println(Team[i]);
                 for (String j : Team){
                    System.out.println(j);
                    // MULTI-DIMENTIONAL ARRAYS
                    int[][] Nums = {{1,2,3,4}, {5,6,7}};
                    Nums[1][0] = 8;
                    System.out.println(Nums[1][0]);
                    System.out.println(Nums[1][2]);
                    // LOOPING MULTI-DIMENSIONAL ARRAYS
                    int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int e = 0; e < myNumbers.length; e ++){
           for (int f = 0; f < myNumbers[e].length; f ++){
                System.out.println(myNumbers[e][f]);
                }
                      }
                    }
                 }
             }
}