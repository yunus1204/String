class Solution {
    public int partitionString(String s) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.contains(c)){
                set.clear();
                count++;
            }
            set.add(c);
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
