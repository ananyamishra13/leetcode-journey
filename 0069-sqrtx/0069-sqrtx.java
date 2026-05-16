class Solution {
    public static int mySqrt(int x) {
     double sqrt_x = Math.pow(x,0.5);       
     
              return (int)sqrt_x;

    }

    public static void main(String args[]){
        System.out.println("square root of no is " + mySqrt(4));
    }

}