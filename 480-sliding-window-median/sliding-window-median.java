
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {

        Comparator<Integer> comparator = (a, b) -> {
            if (nums[a] != nums[b]) {
                return Integer.compare(nums[a], nums[b]);
            }
            return Integer.compare(a, b);
        };

        TreeSet<Integer> Left = new TreeSet<>(comparator.reversed());
        TreeSet<Integer> Right = new TreeSet<>(comparator);

        double[] result = new double[nums.length - k + 1];
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            // Add new element
            if (Left.isEmpty() || nums[i] <= nums[Left.first()]) {
                Left.add(i);
            } else {
                Right.add(i);
            }

            // Balance the sets
            if (Left.size() > Right.size() + 1) {
                Right.add(Left.pollFirst());
            }

            if (Left.size() < Right.size()) {
                Left.add(Right.pollFirst());
            }

            // Remove element outside the window
            if (i >= k) {
                int removeIndex = i - k;

                Left.remove(removeIndex);
                Right.remove(removeIndex);

                // Balance again
                if (Left.size() < Right.size()) {
                    Left.add(Right.pollFirst());
                }

                if (Left.size() > Right.size() + 1) {
                    Right.add(Left.pollFirst());
                }
            }

            // Calculate median
            if (i >= k - 1) {

                if (k % 2 != 0) {
                    result[resultIndex++] = nums[Left.first()];
                } else {
                    result[resultIndex++] =
                        ((double) nums[Left.first()] +
                         (double) nums[Right.first()]) / 2.0;
                }
            }
        }

        return result;
    }
}