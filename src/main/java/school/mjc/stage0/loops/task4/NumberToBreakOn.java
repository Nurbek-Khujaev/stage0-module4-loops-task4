package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {


        boolean flag = numberToGoUntil > toBreakWith;

        for (int i = 0; i < numberToGoUntil; i++) {

            if (flag) {
                System.out.println("iterating till the end");
                flag = false;
            }

            if (i > toBreakWith) {
                break;
            }

            System.out.println(i);

        }


    }
}
