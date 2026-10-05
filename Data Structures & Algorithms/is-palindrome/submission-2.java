class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length-1;

        while(l<r){
            if (!Character.isLetterOrDigit(arr[l])){
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[r])){
                r--;
                continue;
            }

            if(!(Character.toLowerCase(arr[l])==Character.toLowerCase(arr[r]))) return false;

            l++;
            r--;

        }

        return true;
    }
}