public class pascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList(rowIndex + 1); // new ArrayList<>();
        for(int i = 0 ; i <= rowIndex; i++) {
            row.add(1);
        }

        for (int i = 2; i <= rowIndex; i++) {
            for (int j = rowIndex - i + 1; j < rowIndex; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            // row.set(rowIndex, 1); // always the same
        }
        return row;
    }
}
