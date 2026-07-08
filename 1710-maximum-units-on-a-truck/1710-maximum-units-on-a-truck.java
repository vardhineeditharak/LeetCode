class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        int curr = 0;
        int i = boxTypes.length - 1;
        while (i >= 0 && curr < truckSize) {
            int[] t = boxTypes[i];
            int count;
            if (curr + t[0] <= truckSize)
                count = t[0];
            else
                count = truckSize - curr;
            curr += count;
            ans += count * t[1];
            i--;
        }
        return ans;
    }
}