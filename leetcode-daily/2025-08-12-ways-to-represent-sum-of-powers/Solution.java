class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod = 1_000_000_007;
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                p.add((int) (Math.pow(2, i)));
            }
        }
        long[] pre = new long[p.size()];
        pre[0] = p.get(0);
        for (int i = 1; i < pre.length; i++) {
            pre[i] = ((pre[i - 1] % mod) * (p.get(i) % mod)) % mod;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l > 0) {
                long numerator = pre[r];
                long denominatorInverse = modPow(pre[l - 1], mod - 2, mod);
                ans[i] = (int) ((numerator * denominatorInverse) % mod);
            } else {
                ans[i] = (int) pre[r];
            }
        }
        return ans;
    }

    private long modPow(long x, long n, int mod) {
        if (n == 0)
            return 1;
        long half = modPow(x, n / 2, mod);
        long full = (half * half) % mod;
        if (n % 2 == 1)
            full = (full * x) % mod;
        return full;
    }

}
