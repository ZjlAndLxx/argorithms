package basicprogrammingmodel;

import java.util.Random;

/**
 * @author zhoujl
 *
 * 欧几里得算法,发明与2300多年前
 */
public class OjldAlgorithm {
    private final static int CTCLE_TIMES = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int temp1;
        int temp2;

        for (int i = 0;i <CTCLE_TIMES;i++){
            temp1 = random.nextInt(100);
            temp2 = random.nextInt(100);

            System.out.println("temp1:"+temp1+" temp2:"+temp2+" result:"+ojldGcd(temp1,temp2));
        }
    }

    /**
     * 求两个非负整数的最大公约数
     * @param number1
     * @param number2
     * @return
     */
    private static int ojldGcd(int number1, int number2){
        if (number2 == 0){
            return number1;
        }
        int r = number1 % number2;
        return ojldGcd(number2,r);
    }
}
