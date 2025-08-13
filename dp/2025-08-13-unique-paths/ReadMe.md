# Day 3 

# Problem: [Leetcode 62. Unique Paths](https://leetcode.com/problems/unique-paths/description/)

### 🧠 Approach

- intialized a 2D array with all cells -1, which helps to store the solution of overlapping sub-problems 
- using memoization, top-down approach filled the dp array
- where dp[i][j] = dp[i-1][j] + dp[i][j-1], because for a cell(i, j) we can only come from either cell(i-1, j) or cell(i, j-1).

### ✅ Key Insight
> When ever we are solving a problem with many overlapping subproblems, then storing them and using, is the dynamic programming.


### ⏱️ Time Complexity
- to fill dp[m][n], we have O(m x n)

### 📝 Space Complexity (Auxilary space)
- for dp[m][n], O(m x n)
- for tree stack, O(m+n)


