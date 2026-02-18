// Given an array nums of size n which may contain duplicate elements.

// return a list of pairs where each pair contains a unique element from the array and its frequency in the array.


// Example 1

// Input: nums = [1, 2, 2, 1, 3]

// Output: [[1, 2], [2, 2], [3, 1]]



public class Hashing {

    public static void main(String[] args) {
        Hashing sol = new Hashing();
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 3;
        List<List<Integer>> op = sol.countFrequencies(nums);
        System.out.println(op);
    }

    public List<List<Integer>> countFrequencies(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                int val = hm.get(nums[i]);
                hm.put(nums[i], val + 1);
            }
        }

        List<List<Integer>> op = new ArrayList<>();
        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            List<Integer> l = new ArrayList<>();
            l.add(it.getKey());
            l.add(it.getValue());
            op.add(l);
        }
        return op;
    }
}
