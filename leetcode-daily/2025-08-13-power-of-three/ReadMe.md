# Day 3

# Problem: [Leetcode 326. Power of Three](https://leetcode.com/problems/power-of-three/description/?envType=daily-question&envId=2025-08-13)

### 🧠 Approach

- Repeatedly divide n by 3 (using recursion) as long as it is divisible by 3. If we reach n == 1, it is a power of three; otherwise, it is not.


### ✅ Key Insights
> If a number is a power of 3, repeatedly dividing it by 3 will eventually yield 1.
> Recursive division is natural here because the problem definition (“power of 3”) can be expressed in terms of a smaller instance of the same problem.

### ⏱️ Time Complexity
- as we are reducing the number to number/3, so we get a logarithamic time complexity of O(log n base 3) ~ O(log n)

### 📝 Space Complexity (Auxilary space)
- only space for recursive functions call stack, so we call the function for `log n base 3` times, so O(log n base 3) ~ O(log n)

### ⚠️ Mistakes I Made
- Initially missed handling for non-positive integers (n <= 0). Added this check to return false early.
