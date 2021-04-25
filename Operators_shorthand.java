/*Some operators are used for short hand:

ex int x = 3 > 1 ? 5 : 10;

this is symantically equivalent to

int x;
if (3 > 1){
  x = 5;
}else{
  x = 10;
}

salva veritate? */
example: 
package com.codegym.task.task02.task0217;

/* 
Minimum of four numbers

*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) < c) {
            return (min(a, b) <= d) ? min(a, b) : d;
        } else {
            return (c <= d) ? c : d;
        }
    }
    public static int min(int a, int b) {
        return (a <= b) ? a : b;

    }
    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
