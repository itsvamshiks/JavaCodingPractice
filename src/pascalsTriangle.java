public class pascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if(numRows==0)
            return triangle;

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rn = 1;rn<numRows;rn++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rn-1);

            row.add(1);

            for(int j=1;j<rn;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;

    }
}
