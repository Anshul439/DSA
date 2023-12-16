package Recursion;

class Solution{

    public static void main(String[] args) {
        printTillN(7);
    }
    static int count = 1;

    static void printTillN(int N){
        if (count == N+1) {
            return;
        }
        System.out.print(count + " ");
        count++;
        printTillN(N);
    }
}