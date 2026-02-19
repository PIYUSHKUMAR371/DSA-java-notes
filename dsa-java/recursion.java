public class recursion {
    
    //recursion = When a thing is defined in terms of itself
    //            Apply the result of a procedure to the result of the same procedure
    //            A recursive method calls itself . Can be a substitute for iteration
    //            Divide a problem into sub-problems of the same type as the original 
    //            Commonly used with advanced sorting algorithms, tree traversals, graph traversals, dynamic programming

    //advantages
    //1.easier to read/write
    //2.easier to debug

    //disadvantages
    //1.sometimes slower
    //2.takes more memory

    public static void main(String[] args) {
        
        walk(5);
        factorial(7);
        System.out.println("factorial of 7 is " + factorial(7));
        System.out.println(power(2,8));
        
    }
    private static void walk(int steps){
        if(steps < 1)return ; //base case
        System.out.println("you take a step");
        walk(steps - 1); //recursive call
    }
    private static int factorial(int num){
        if(num == 0)return 1; //base case
        return num * factorial(num - 1); //recursive call
    }
    private static int power(int base, int exp){
        if(exp == 0)return 1; //base case
        return base * power(base, exp - 1); //recursive call
    }
}
