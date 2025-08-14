# Day 4

# Problem: [Leetcode 2264. Largest 3-Same-Digit Number in String](https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/?envType=daily-question&envId=2025-08-14)

### 🧠 Approach

- checked each substring of length 3, whether all digits in it are equal or not.
- stored the maximum value found and returned by making it a string of length 3 of same digits.


### ✅ Key Insight
> as required substring length is only 3, we can go and check all three chars for each index.

### ⏱️ Time Complexity
- O(n)

### 📝 Space Complexity (Auxilary space)
- O(1)

### ⚠️ Mistakes I Made
- Initially missed handling for digit '0', as this line (d*100 + d*10 + d)+""; can't return a '000'.
