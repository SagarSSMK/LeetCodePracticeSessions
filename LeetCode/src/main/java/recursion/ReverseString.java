package recursion;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        reverse("abc".toCharArray());
    }

    public static void reverse(char[] str){
      helper(str,0,str.length-1);
    }

    public static void  helper(char[] str,int left, int right){

        if(left>right) return;
        char temp = str[left];
        str[left++] = str[right];
        str[right--] = temp;
        helper(str,left,right);
    }
}
