class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            List<Integer> al2 = new ArrayList<>();

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i) {
                    al2.add(1);
                } else {
                    int val = al.get(i - 2).get(j - 2) +
                            al.get(i - 2).get(j - 1);

                    al2.add(val);
                }
            }

            al.add(al2);
        }

        return al;
    }
}