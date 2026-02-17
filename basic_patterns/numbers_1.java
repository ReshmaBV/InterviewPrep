//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//1        1
//12      21
//123    321
//1234  4321
//1234554321

class Pattern12 {
    public void pattern12(int n) {

        int maxNoPrints = n * 2;
        for (int i = 1; i <= n; i++) {
            print("inc", i);
            print("*", maxNoPrints - (i * 2));
            print("dec", i);
            System.out.print("\n");
        }
    }

    void print(String action, int n) {
        switch(action) {
            case "inc":
                for (int j = 1; j <= n ; j++) {
                    System.out.print(j);
                }
                break;
            case "dec":
                for (int j = n; j >= 1 ; j--) {
                    System.out.print(j);
                }
                break;
            case "*":
                for (int j = 1; j <= n ; j++) {
                    System.out.print(" ");
                }
                break;
            default :
                break;

        }
    }

    public static void main(String args[]) {
        Pattern12 p = new Pattern12();
        p.pattern12(4);
    }
}
