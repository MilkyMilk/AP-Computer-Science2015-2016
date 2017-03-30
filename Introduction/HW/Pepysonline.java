public class Pepysonline { 
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        // at least one 1 in 6 rolls
        int cnt1 = 0;
        for (int i = 0; i < N; i++) {
            int ones = 0;
            for (int j = 0; j < 6; j++)
                if (6 * Math.random() < 1)
                    ones++;
            if (ones >= 1) cnt1++;
        }

        // at least two 1's in 12 rolls
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            int ones = 0;
            for (int j = 0; j < 12; j++)
                if (6 * Math.random() < 1)
                    ones++;
            if (ones >= 2) cnt2++;
        }


        System.out.println(1.0 * cnt1 / N);
        System.out.println(1.0 * cnt2 / N);

    }

}