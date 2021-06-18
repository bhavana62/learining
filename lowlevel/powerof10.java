public class power {
    public static boolean isPowerOf10(int x) {

        if (x == 1) {
            return true;
        }

        if (x % 10 != 0 || x == 0) {
            return false;
        }

        if (x == 10) {
            return true;
        }

        return isPowerOf10(x/10);
    }


        public static boolean doTestPass()
        {
            int[] isPowerList = {1,10,100,10000};
            int[] isNotPowerList = {3,50,-1};

            for (int i : isPowerList) {
                if (!isPowerOf10(i)) {
                    System.out.println("Test failed for " + i);
                    return false;
                }
            }
            for (int j : isNotPowerList) {
                if (isPowerOf10(j)) {
                    System.out.println("Test failed for " + j);
                    return false;
                }
            }
            System.out.println("All test Passed");
            return true;
        }
        public static void main(String[] args)
        {
            doTestPass();
        }

}
