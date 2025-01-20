import java.util.*;

class PowerSet {

    public static void getPowSet(int[] arr, int idx, List<Integer> current, List<List<Integer>> ans) {
        // Base case: if we've considered all elements
        if (idx == arr.length) {
            // Add a copy of the current subset to the answer list
            ans.add(new ArrayList<>(current));
            return;
        }
        
        current.add(arr[idx]);
        getPowSet(arr, idx + 1, current, ans);
        current.remove(current.size() - 1);
        getPowSet(arr, idx + 1, current, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        // Start with an empty subset
        getPowSet(arr, 0, new ArrayList<>(), ans);

        // Print all subsets
        System.out.println("Power Set:");
        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }

        sc.close();
    }
}