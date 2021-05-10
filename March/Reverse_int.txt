class Solution {
public int reverse(int x) { //123
        int rev = 0;
        int y;
        
            while(x != 0){
                y = x % 10; //3
                x = x / 10; // 12
                if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10)
                return 0;
                
                rev = y + rev * 10;  // 30
            }
            return rev;

        
        
    }

}
