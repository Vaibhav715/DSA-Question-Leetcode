class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        char arr1[] = new char[l1];
        char arr2[] = new char[l2];

        for (int i = 0; i < l1; i++) {
            arr1[i] = s.charAt(i);
        }

        for (int i = 0; i < l2; i++) {
            arr2[i] = t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        return true;
        else
        return false;
    }
}