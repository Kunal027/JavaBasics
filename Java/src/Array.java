public class Array {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 1;
        lotteryNumbers[1] = 100;
        lotteryNumbers[2] = 54;
        lotteryNumbers[3] = 88;
        lotteryNumbers[4] = 98;

        int[] anotherNumber = {15,33,54,45,44};

        for (int another : anotherNumber)
        {
            System.out.println(another);
        }
        System.out.println("............................");
        for(int lotteryNum : lotteryNumbers)
        {
            System.out.println(lotteryNum);
        }

        int[][] weelLotterNum = {
                {1,2,3,4,5},
                {45,65,89,65,78},
                {54,5,25,78,45},

        };

        for (int i = 0; i < weelLotterNum.length; i++) {
            for (int j = 0; j < weelLotterNum[i].length;  j++) {
                System.out.println(weelLotterNum[i][j] + "");
            }
            System.out.println();
        }
    }
}