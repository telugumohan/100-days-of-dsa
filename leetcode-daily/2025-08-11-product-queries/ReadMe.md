# Day 1 

# Problem: [Leetcode 2438. Range Product Queries of Powers](https://leetcode.com/problems/range-product-queries-of-powers/description/?envType=daily-question&envId=2025-08-11)

### 🧠 Approach

- find powers of 2 that sum up to given number(n) using set bits of 'n', and store them in a list.
- pre-compute the porduct using prefix array.
- find answer for each query[l, r] by dividng prefix[r]/prefix[l-1]

### ✅ Key Insights
> when a number written in binary form, all the set bits are the powers of 2, whose total sum of that power of 2 equal to that number.
> Division under modulo means multiplying by the modular multiplicative inverse.
> When MOD is prime, we can use Fermat’s Little Theorem: b⁻¹ ≡ b^(M−2) (mod M)


### ⏱️ Time Complexity
- finding set bits list - O(1)
- pre-computing products - O(1)
- for q queries - O(q * log(Mod)), but Mod = 10^9+7, a constant, so O(q)
- Therefore, final time complexity = O(1) + O(1) + O(q) = O(q).

### 📝 Space Complexity (Auxilary space)
- set bits list and prefix array can go max upto 32 size, so O(1)
- for returning an integer array answer, we need a array of size O(q)
- so, total space complexity = O(q)

### ⚠️ Mistakes I Made
- tried the modular division similar to modular multiplication.
- learnt it's solved using modular multiplicative inverse.
