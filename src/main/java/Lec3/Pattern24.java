package Lec3;

public class Pattern24 {
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
                System.out.print(row+" ");
                i++;
            }


            System.out.println();
            row++;
            space--;
            star = star + 2;
        }
    }
}
