public class Loop {
   public static void main (String[] args){
     //WHILE LOOP/ DO-WHILE LOOP
     int i = 0;
     while (i < 10){
         System.out.println(i);
         i ++;
         for (int j = 0; j <= 6; j ++){
            System.out.println(j);
         }
         int a = 0;
         do {
            System.out.println(a);
            a ++;
         }
            while (a < 6);
         }
         int b = 0;
         while (b < 6){
            b ++;
            System.out.println(b);
            if (b == 3){
                continue;
            }
            //FOR-EACH LOOP
            String[] cars = {"BMW", "Honda", "Toyota", "Lexus"};
            for (String car : cars) {
                System.out.println(car);
            }
            for (int c = 0; c < cars.length; c ++){
                System.out.println(cars[c]);
            }
         }
     }
   } 
