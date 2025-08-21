# Day 7 

# Problem: [Leetcode 51. N-Queens](https://leetcode.com/problems/n-queens/description/)

### 🧠 Approach

- for current row, iterated each column to check whether the position is safe to place Queen
- if eneded up with no ways to place queen, backtracked to check other positions of the same column.

### ✅ Key Insight
> To check whether a position is safe or not to place a Queen, we just need to check current top column, top right diagonal, top left diagonal.


### ⏱️ Time Complexity
- O(N * N!)

### 📝 Space Complexity (Auxilary space)
- O(N^2 + N) = ~ O(N^2)


