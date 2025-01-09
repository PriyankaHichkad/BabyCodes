/**Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string s=strs[0];
        string s1="";
        for(int i=0; i<strs.size(); i++)
        {
            if(strs[i].length()==0) 
            {
                s="";
                break;
            }
            for(int j=0; j<strs[i].length() ; j++)
            {
                char ch=strs[i][j];
                if(s[j]==ch)
                {
                    s1=s1+ch;
                    if(j==(strs[i].length()-1)) s=s1;
                    continue;
                }
                else
                {
                    s=s1;
                    s1="";
                    break;
                }
            }
            s1="";
        }
        return s;
    }
};
