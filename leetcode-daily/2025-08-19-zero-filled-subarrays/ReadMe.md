# Day 6 

# Problem: [Leetcode 2348. Number of Zero-Filled Subarrays](https://leetcode.com/problems/number-of-zero-filled-subarrays/description/?envType=daily-question&envId=2025-08-19)

### 🧠 Approach

- Initialized a count variable with zero, which counts the no. of subarrays can form from a subarray of zeros.
- Added each of count into answer and returned.

### ✅ Key Insights
> Number of subarrays formed from an array of size n = (n * (n+1))/2;


### ⏱️ Time Complexity
- O(n)

### 📝 Space Complexity (Auxilary space)
- O(1)

### ⚠️ Mistakes I Made
- Ignored to add the count to result when last element is zero.
- Then, added it after for loop, to ensure all subarrays of zeros are added correctly.