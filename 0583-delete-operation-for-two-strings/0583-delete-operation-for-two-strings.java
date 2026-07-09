class Solution {
    Integer[][] dp;
    public int solve(String s1, String s2, int i, int j){
        // delete remaining if either string ends
        if(i>=s1.length() && j>=s2.length()){
            return 0;
        }else if(i==s1.length() && j<s2.length()){
            return Math.abs(s2.length()-j);
        }else if(i<s1.length() && j==s2.length()){
            return Math.abs(s1.length()-i);
        }


        if(dp[i][j]!=null) return dp[i][j];

        int res = Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j)){
            int a = solve(s1, s2, i+1, j+1);
            res = Math.min(res, a);
        }

        int b = 1 + solve(s1, s2, i+1, j); // delete from s1
        int c = 1 + solve(s1, s2, i, j+1); // delete from s2
        res = Math.min(res, b);
        res = Math.min(res, c);

        return dp[i][j] = res;
    }
    public int minDistance(String word1, String word2) {
        dp = new Integer[word1.length()][word2.length()];
        return solve(word1, word2, 0, 0);
    }
}