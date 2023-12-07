import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] num = new int[]{1,0,3,4};
        Main main = new Main();
        int mult = main.MultipleNumbers(num);
        System.out.println(mult);
        int [] num1 = main.result(num);
        System.out.println(Arrays.toString(num1));


    }


    public int MultipleNumbers (int [] num) {
       int mult = num[0];
        for (int i = 1; i< num.length; i++) {
            if (CountNulls(num) ==1 && num[i]==0 ) {
                num [i] =1;
            }
         mult = mult* num [i];
        }

        return mult;
    }
    public  int [] result (int [] num)
 {
     int [] result = new int[num.length];
     for (int i =0; i< num.length; i++) {
         if (CountNulls(num) ==1 && num[i]==0 ) {
             result[i] = MultipleNumbers(num);

         }

         if (CountNulls(num) ==0) {
             result[i] = MultipleNumbers(num) / num[i];
         }
     }

     return result;
 }

    public int CountNulls (int [] num) {
        int k = 0;
        for (int i = 1; i< num.length; i++) {
            if (num [i] ==0) {
                k++;
            };
        }

        return k;
    }


}