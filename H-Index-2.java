/**


citations = [0,1,3,5,6,7,8,9,10,11]

- N papers have H citation
- N - H  <= H citation

[1,2,100]

0 1

TC - O(logn)
SC - O(1)

**/
class Solution {
    public int hIndex(int[] citations) {

        int start = 0;
        int end = citations.length - 1;
        int total = citations.length;
        
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if (total - mid == citations[mid])
            {
                return citations[mid];
            }
            else if (total - mid > citations[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        
        return total - start;
    }
}
