class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(char[] ar: arr) {
            Arrays.fill(ar, '.');
        }
        List<List<String>> res = new ArrayList<>();
        backtrack(n, arr, 0, res);
        return res;
    }           
        private void backtrack(int n, char[][] arr, int index, List<List<String>> res) {
        // base case
        if(index == n) {
            List<String> list = new ArrayList<>();
            for(char[] ar: arr) {
                StringBuilder sb = new StringBuilder();
                for(char ch: ar) sb.append(ch);
                list.add(sb.toString());
            }
            res.add(list);
            return;
        }

        for(int j = 0; j < n; j++) {
            if(isSafe(arr, n, index, j)) {
                arr[index][j] = 'Q';
                backtrack(n, arr, index+1, res);
                arr[index][j] = '.';
            }
        }
    }
    private boolean isSafe(char[][] arr, int n, int i, int j) {
        // column
        for(int k = 0; k < i; k++) {
            if (arr[k][j] == 'Q') return false;
        }
        // right-diagonal
        int k = i, m = j;
        while(k >= 0 && m < n) {
            if(arr[k][m] == 'Q') return false;
            k--;
            m++;
        }
        // left-diagonal
        k = i;
        m = j;
        while(k >= 0 && m >= 0) {
            if(arr[k][m] == 'Q') return false;
            k--;
            m--;
        }
        return true;
    }
}