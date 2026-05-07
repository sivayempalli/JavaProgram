package Lec2;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;

        while(row <= n){
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            i=1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }


            System.out.println();
            row++;
            space--;
            star = star + 2;
        }
    }
}
