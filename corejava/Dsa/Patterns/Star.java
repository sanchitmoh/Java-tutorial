package Dsa.Patterns;

public class Star {
    public static void main(String[] args) {
        System.out.println("right:");
        for(int i=1; i<=5;i++){// Outer loop for rows
            for(int j=1;j<=i; j++){// Inner loop for columns
                System.out.print("* ");
            }            System.out.println();
        }


//*
//* *
//* * *
//* * * *
//* * * * *

        System.out.println("Inverted right:");
for(int s=1; s<=5;s++){// Outer loop for rows
            for(int t=5;t>=s; t--){// Inner loop for columns
                System.out.print("* ");
            }            System.out.println();
        }


        System.out.println("Rectangle Pattern:");
for(int a=1;a<=5;a++){
    for(int b=1;b<=6;b++){
        System.out.print("* ");

    }
    System.out.println();
}

System.out.println("Hollow Rectangle Pattern:");
for(int c=1;c<=5;c++){
    for(int d=1;d<=6;d++){
        // Print star for the first and last row, and first and last column
        if(c==1||d==1||c==5||d==6){
            System.out.print("* ");
        } else {
            System.out.print("  "); // Print space for hollow part
        }
    }
    System.out.println();
}

        System.out.println("half pyramid inverted 180 deg:");
    int g=5;
        for(int e=1;e<=g;e++){// Outer loop for rows
            for(int f=1;f<=g-e;f++){// Inner loop for space
                System.out.print(" ");
            }
            for(int f=1;f<=e;f++){// Inner loop for columns
                System.out.print("* ");
            }            System.out.println();
        }


        System.out.println("half pyramid inverted with number :");
        int n=5;
        for(int i=1;i<=n;i++){// Outer loop for rows
            for(int j=1;j<=n-i+1;j++){// Inner loop for columns
                System.out.print((j%2)+" ");
            }            System.out.println();
        }


        System.out.println("half pyramid  with number  :");
        int m=5;
        for(int i=1;i<=m;i++){// Outer loop for rows
            for(int j=1;j<=i;j++){// Inner loop for columns
                System.out.print((j%2)+" ");
            }            System.out.println();
        }



        System.out.println("half pyramid  with number  :");
        int o=5;
        for(int i=1;i<=o;i++){// Outer loop for rows
            for(int j=1;j<=i;j++){// Inner loop for columns
                System.out.print((j)+" ");
            }            System.out.println();
        }

        System.out.println("reversed half pyramid  with number  :");

        int p=5;
        for(int i=5;i>=1;i--){//Outer loop for rows
            for(int j=1;j<=i;j++)//inner loop for columns
            {
                System.out.print((j)+" ");
            }            System.out.println();
        }

        System.out.println("Floyd's Triangle:");

        int num=5;
        int count=1;
        for(int i=1;i<=num;i++){// Outer loop for rows
            for(int j=1;j<=i;j++){// Inner loop for columns
                System.out.print((count%2)+" ");
                count++;
            }            System.out.println();
        }


        System.out.println("Pascal's Triangle:");

        System.out.println("010 triangle:");
        int rows=5;
        for(int i=1; i<=rows; i++){// Outer loop for rows
            for(int j=1; j<=i;j++) {
                // Inner loop for column


                int sum = i + j;
                    if (sum % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }

            }
            System.out.println();
        }

    }
}