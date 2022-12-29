import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//         String [] array = {"Timur","Gulnur","Meder","Mairam","Zarina"};
//
//         for (String a : array){
//             System.out.println(a + "   Men seni jakshy korom");
//         }
/**                                        P R A C T I C E                         */
//       method(16,45,2,34,23,45,43,23,211);
//    }
//    static void method(int... a ){
//        System.out.println(Arrays.toString(a));
//    }


        /**                                                      */

//        System.out.println(Arrays.toString(method(56, 43, 22, 34, 45, 64, 32)));
//
//        /**         ||              */

//        int[] array = method(45,32,34,21,22,44,56);
//        for(int a: array){
//            System.out.println(a);
//        }
//
//    }//main
//
//  static int [] method(int...a){
//        return a;
//  }


//        method("Nice"," to"," meet"," you!");
//
//    }
//        static void method(String... soz){
//            String[] array = soz;
//            for (String i: array) {
//                System.out.print(i.toUpperCase());
//            }
//                System.out.println("\nSozdordun kolichestvosu: "+ array.length);
//
//        }

//        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3 == 0) {
//                array[i] = 3333333;
//            }
//            array[array.length / 2] = -1;
//
//            System.out.println(array[i]);
//        }


        int[] array = new int[120];
        method(array);
    }  //main
    static void method(int[]array) {
        for (int i = 10; i < array.length; i+=10) {
            array[i]=i;
            if (array[i] % 3 == 0) {
                array[i] = 3333333;
            }
            array[array.length / 2] = -1;

            System.out.println(array[i]);
        }
    }






}
