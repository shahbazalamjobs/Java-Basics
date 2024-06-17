/* 

1. Pattern 1

*
**
***
****

*/
  
class Pattern1 {

    public static void pattern(int n) {
        // Row loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(8);
    }
}



// 2. Pattern 2

/*

****
****
****
****

*/

class Pattern2 {

    public static void pattern(int n) {
        // Row loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}



// 3. Pattern 3

/*

****
***
**
*

*/

// sol 1

class Pattern3 {

    public static void pattern(int n) {
        // Row loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = n; col >=row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}

// sol 2: column = n - r + 1;

class Main {

    public static void pattern(int n) {
        // Row loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = n-row + 1 ; col >=1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}




// 4. Pattern 4

/*

1
12
123
1234

*/


class Pattern4 {

    public static void pattern(int n) {
        // Row loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}



// 5. Pattern 5

/*

*
**
***
****
***
**
*


formula: 

row 1 -> 2n-1
if row>n -> col = n - (row - n ); -> 2 * n - row

else col = n

*/


class Main {

    public static void pattern(int n) {

        // Row loop
        for (int row = 0; row <= 2 * n; row++) {
        int totalColsInRow = (row>n) ? 2 * n - row : row;
            // Inner loop
            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}



// 6. Pattern 6

/*
   1
  212
 32123
4321234
*/

class Main {

    public static void pattern(int n) {  
        for(int row = 1; row <= n; row++) {

            // Spaces 
            for(int s = n - row; s>0; s--) {
                System.out.print(" ");
            }

            // For Decreasing No
            for(int col = row; col>=1; col--) {
                System.out.print(col);                
            }

            // For Increasing No
            for(int col = 2; col<=row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }    
    }

    public static void main(String[] args) {
        pattern(4);
    }
}




// 7. Pattern 7

/*

   *
  * *
 * * *
* * * *
 * * *
  * *
   *

*/


class Main {

    public static void pattern(int n) {

        // Row loop
        for (int row = 0; row < 2 * n; row++) {
        int totalColsInRow = (row>n) ? 2 * n - row : row;
        int totalSpaces = n - totalColsInRow;
        
            // Inner loop

            for(int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print("* "); // give one space
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}




// 8. Pattern 8

/*
   1 
  1 2
 1 2 3
1 2 3 4
 1 2 3
  1 2
   1
*/


class Main {

    public static void pattern(int n) {

        // Row loop
        for (int row = 0; row < 2 * n; row++) {
        int totalColsInRow = (row>n) ? 2 * n - row : row;
        int totalSpaces = n - totalColsInRow;
        
            // Inner loop

            for(int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print(col+1 + " "); // give one space
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}




// 9. Pattern 9

/*

*****
   *
  *
 *
*****

*/

class Main {

    public static void printPatternZ(int n) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || row + col == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatternZ(5);
    }
}
