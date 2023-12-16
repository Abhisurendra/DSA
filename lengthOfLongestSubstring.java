class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        
        int n =s.length();
        int len = 0;
        for (int i = 0; i < n; i++){
            char c= s.charAt(i);
            while (set.contains(c)){
                char head = queue.poll();
                set.remove(head);
            }
            set.add(c);
            queue.offer(c);
            len = Math.max(len, queue.size());
        }
        return len;
    }
}