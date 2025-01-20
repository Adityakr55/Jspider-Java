class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int number = 1; // Starting number
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // For odd rows
                // Print numbers in ascending order
                for (int j = 0; j < i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
            } else { // For even rows
                // Store numbers in a temporary array for reversal
                int[] temp = new int[i];
                for (int j = 0; j < i; j++) {
                    temp[j] = number;
                    number++;
                }
                // Print the array in reverse
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(temp[j] + " ");
                }
            }
            System.out.println(); // Move to the next line
        }

        
        // 2nd method
        int k = 1;
        for(int i = 1;i<= n;i++)
        {
            if(i%2 != 0)
            {
                for(int j = 1;j<=i;j++)
                {
                    System.out.print(k+"\t");
                    k++;
                }
            }
            else
            {
                k = k + i-1;
                int m = k;
                for(int j = 1;j<=i;j++)
                {
                    System.out.print(k+"\t");
                    k--;
                }
                k = ++m;
            }
            
            System.out.println();
        }
    }
}