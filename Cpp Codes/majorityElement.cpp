/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109*/

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int a=0,b;
        map <int, int> m;
        for(int i=0; i<nums.size(); i++)
        {
            m[nums[i]]++;
            if(m[nums[i]]>a)
            {
                b=nums[i];
                a=m[nums[i]];
            }
        }
        return b;
    }
};
