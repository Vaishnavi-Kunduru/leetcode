class Solution {
    public boolean isPalindrome(int x) { //123
        
        if(x < 0)
            return false;
        
        int y;
        int rev = 0;
        int a = x; 
        
        while(x != 0){
        y = x % 10;  //2
        rev = y + rev * 10; //2 + 30
        x = x / 10; //12
        }  
        if( a == rev)
            return true;
        else
            return false;
    
    }
}
