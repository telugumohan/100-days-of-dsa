# Day 7

# Problem: [Leetcode 1493. Longest Subarray of 1's After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=daily-question&envId=2025-08-24)

### 🧠 Approach

- solved using sliding window approach.
- shrinked the window if zeros count is greater than 1.
- stored max count of ones in a varible and returned.

### ✅ Key Insights
> Sliding window problem


### ⏱️ Time Complexity
- O(n)

### 📝 Space Complexity (Auxilary space)
- O(1)

### ⚠️ Mistakes I Made
- when all ones, I returned whole count, but the question is to delete an element either 1/0
- so, at storing max, updated it if there is a in our current window then we take all ones count, else we take count-1.
