class Solution {

    public int distributeCandies(int[] candyType) {
        ArrayList arr = new ArrayList<Integer>();
        Arrays.sort(candyType);
        arr.add(candyType[0]);
        int lastIndex = 0;

        for (int i = 0; i < candyType.length; i++) {

            if (candyType[i] == Integer.parseInt(arr.get(lastIndex).toString())) {

            } else {
                arr.add(candyType[i]);
                lastIndex++;
            }
        }
        if(arr.size()<(candyType.length)/2)
        {
           return arr.size();
        }
        else
        {
            return (candyType.length)/2;
        }
    }
}
