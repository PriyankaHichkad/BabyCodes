/**Seven different symbols represent Roman numerals with the following values:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
Given an integer, convert it to a Roman numeral.

 

Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV
 
Constraints:

1 <= num <= 3999*/

class Solution {
public:
    string intToRoman(int num) {
        string s1=to_string(num);
        string s="";
        for(int i=0; i<s1.length(); i++)
        {
            if(s1[i]=='4')
            {
                int x=s1.length()-i-1;
                if(x==2) {s=s+"CD"; }
                else if(x==3) {s=s+"MMMM";}
                else if(x==1) {s=s+"XL";}
                else if(x==0) {s=s+"IV";}
            }
            else if(s1[i]=='9')
            {
                int x=s1.length()-i-1;
                if(x==2) {s=s+"CM";}
                else if(x==3) {s=s+"MMMMMMMMM";}
                else if(x==1) {s=s+"XC";}
                else if(x==0) {s=s+"IX";}
            }
            else
            {
                int x=s1.length()-i-1;
                char ch=s1[i];
                int z=(int)(ch)-48;
                if(x==3)
                {
                    for(int j=0; j<z; j++) {s=s+'M';}
                }
                else 
                {
                    if(x==2)
                    {
                        if(z>=5)
                        {
                            s=s+'D';
                            z=z-5;
                        }
                        for(int j=0; j<z; j++) {s=s+'C';}
                    }
                    else if(x==1)
                    {
                        if(z>=5)
                        {
                            s=s+'L';
                            z=z-5;
                        }
                        for(int j=0; j<z; j++) {s=s+'X';}
                    }
                    else if(x==0)
                    {
                        if(z>=5)
                        {
                            s=s+'V';
                            z=z-5;
                        }
                        for(int j=0; j<z; j++) {s=s+'I';}
                    }
                }
            }
        }
        return s;
    }
};
