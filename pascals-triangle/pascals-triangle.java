class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> content = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                //처음이랑 끝은 1로 고정
                if (j == 0 || j == i) {
                    content.add(1);
                } else {
                    //[i-1][j-1]+[i-1][J]
                    content.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
                }
            }
            //add this new lists
            answer.add(content);
        }

        return answer;
        
    }
}