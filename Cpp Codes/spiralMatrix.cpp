/*Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100*/

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> v;
        int top=0, bot=matrix.size()-1;
        int l=0, r=matrix[0].size()-1;
        while(top<=bot && l<=r)
        {
            for(int j=l; j<=r; j++)
                v.push_back(matrix[top][j]);
            top++;
            for (int i=top; i<=bot; i++)
                v.push_back(matrix[i][r]);
            r--;
            if (top <= bot) 
            {
                for (int j = r; j >= l; j--)
                    v.push_back(matrix[bot][j]);
                bot--;
            }
            if (l <= r) 
            {
                for (int i = bot; i >= top; i--)
                    v.push_back(matrix[i][l]);
                l++;
            }
        }
        return v;
    }
};
