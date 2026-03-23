class Solution {
    public int romanToInt(String s) {
        s = s.toUpperCase();
        int value = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {

            if (i < len - 1) {
                String twoChar = s.substring(i, i + 2);
                switch (twoChar) {
                    case "IV":
                        value += 4;
                        i++;
                        continue;
                    case "IX":
                        value += 9;
                        i++;
                        continue;
                    case "XL":
                        value += 40;
                        i++;
                        continue;
                    case "XC":
                        value += 90;
                        i++;
                        continue;
                    case "CD":
                        value += 400;
                        i++;
                        continue;
                    case "CM":
                        value += 900;
                        i++;
                        continue;
                    default:
                        break; // Proceed to single character processing
                }
        
            }

            // Process single characters
            if (i < len) {
                char c = s.charAt(i);
                switch (c) {
                    case 'I':
                        value += 1;
                        break;
                    case 'V':
                        value += 5;
                        break;
                    case 'X':
                        value += 10;
                        break;
                    case 'L':
                        value += 50;
                        break;
                    case 'C':
                        value += 100;
                        break;
                    case 'D':
                        value += 500;
                        break;
                    case 'M':
                        value += 1000;
                        break;
                    default: throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
                
                }

            }
        }
         return value;
            }

    }
