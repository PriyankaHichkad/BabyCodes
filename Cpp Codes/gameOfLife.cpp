/*According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current state of the m x n grid board. In this process, births and deaths occur simultaneously.

Given the current state of the board, update the board to reflect its next state.

Note that you do not need to return anything.

Example 1:
Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
 

Constraints:

m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] is 0 or 1.*/

class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        int n = board.size();
        int m = board[0].size();
        vector<vector<int>> count_live(n, vector<int>(m,0));
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(board[i][j] == 1)
                { 
                    if(i>0) count_live[i-1][j]++; 
                    if(i<n-1) count_live[i+1][j]++; 
                    if(j>0) count_live[i][j-1]++; 
                    if(j<m-1) count_live[i][j+1]++; 
                    if(i>0 && j>0) count_live[i-1][j-1]++; 
                    if(i>0 && j<m-1) count_live[i-1][j+1]++; 
                    if(i<n-1 && j>0) count_live[i+1][j-1]++; 
                    if(i<n-1 && j<m-1) count_live[i+1][j+1]++; 
                }
            }
        }
            for(int i=0; i<n; i++)
            {
            for(int j=0; j<m; j++)
            {
                if(board[i][j] == 1)
                {
                    if(count_live[i][j]<2 || count_live[i][j]>3) 
                        board[i][j] =0;
                } 
                else
                {
                    if(count_live[i][j] == 3) 
                        board[i][j] = 1;
                }
            }
        }
    }
};
