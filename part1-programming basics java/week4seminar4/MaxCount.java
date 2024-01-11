public class MaxCount {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 10) + 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int[] count = new int[11];
        // 0 0 0 0 0 ... 0
        // 0 5 3 7 4     4

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            count[num]++;
        }

        // 1 6 3 9 4 4 3 1 1 6 : nums
        //                   |

        // 0 3 0 2 2 0 2 0 0 1 0 count

        // num = 3 -> count[3]++

        int max = 0;
        int maxIndex = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }


        System.out.println("MAX=" + maxIndex + ", found " + max + " times");

    }
}
