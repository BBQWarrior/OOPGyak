package labor2_3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyDate[] myDates = new MyDate[1000];
        int counter = 0;

        for (int i = 0; i < 1000; i++){
            Random rand = new Random();
            int year = rand.nextInt(2022);
            int month = rand.nextInt(13);
            int day = rand.nextInt(32);

            if (DateUtil.isValidDate(year, month, day)){
                myDates[i] = new MyDate(year, month, day);
                System.out.println(myDates[i]);
            } else counter++;
        }

        System.out.println("Number of invalid dates: " + counter);
    }
}
