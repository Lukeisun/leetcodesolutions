class KthLargest {

    int k;
    PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<Integer>();
        for( int i = 0; i < nums.length; i++ ) {
            queue.add(nums[i]);
        }
    }

    public int add(int val) {
        queue.add(val);
        while(queue.size() > k) queue.poll();
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
