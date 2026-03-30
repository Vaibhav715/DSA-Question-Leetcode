class Solution {
    public boolean checkStrings(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        char even1[] = new char[(l1+1)/2];
        char even2[] = new char[(l2+1)/2];
        char odd1[] = new char[l1/2];
        char odd2[] = new char[l2/2];
        int a = 0;
        int b = 0;

        for(int i =0 ; i<l1; i++){
            if(i%2 == 0){
            even1[a] = s1.charAt(i);
            even2[a] = s2.charAt(i);
            a++;
            }
            else{
            odd1[b] = s1.charAt(i);
            odd2[b] = s2.charAt(i);
            b++;
            }
        }
        Arrays.sort(even1);
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);

if(Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2))
return true;
else
return false;
    }
}