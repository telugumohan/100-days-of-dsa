# Day 5 

# Problem: [Leetcode 90. Subsets II](https://leetcode.com/problems/subsets-ii/description/)

### 🧠 Approach

- Initialized an empty List of List of Integers, to store the result, and called the backtrack function.
- backtrack function adds current List to our result, and we have 2 options either to pick if it's not picked earlier and not pick at same recursive depth.
- we do backtracking to cover all possible subsets by removing the recently added element.

### ✅ Key Insight
> We can avoid picking duplicates by checking if it's picked already at same recursive level, using the condition: 
> if(i > ind && nums[i] == nums[i-1]) continue;


### ⏱️ Time Complexity
- as we generate 2^n subsets and add each them to result, we have O(2^n * n)

### 📝 Space Complexity (Auxilary space)
- as our result has 2*n subsets each with n elements at worst case: O(2^n * n)
- At worst case, recursion stack space goes upto O(n).


