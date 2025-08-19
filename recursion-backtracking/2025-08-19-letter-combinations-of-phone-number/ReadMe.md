# Day 6 

# Problem: [Leetcode 17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)

### 🧠 Approach

- Added a char of current index string and called the recursive function to solve the remaining problem assuming as digits.substring(index+1, last) as new digits.
- So, that we can backtrack and remove added ones and explore all possible strings.

### ✅ Key Insight
> doing one choice at a time and undoing it before trying the next.


### ⏱️ Time Complexity
- O(4^n * n)

### 📝 Space Complexity (Auxilary space)
- Recursion Tree Stack: O(n)
- resultant list: (4^n * n)


