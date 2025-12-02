// Tiling problem in Java (2xN floor with 2x1 tiles)
public class problem1 {
    static int tailingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalTails = tailingProblem(n - 1);
        int horizontalTails = tailingProblem(n - 2);
        return verticalTails + horizontalTails;
        /*
        Dry Run (n=4):
        tailingProblem(4)
        = tailingProblem(3) + tailingProblem(2)
        = (tailingProblem(2) + tailingProblem(1)) + (tailingProblem(1) + tailingProblem(0))
        = ((tailingProblem(1) + tailingProblem(0)) + 1) + (1 + 1)
        = ((1 + 1) + 1) + (1 + 1)
        = (2 + 1) + 2
        = 3 + 2
        = 5
        */
    }

    public static void main(String[] args) {
        int n = 4; // length of the floor
        System.out.println(tailingProblem(n));
    }
}