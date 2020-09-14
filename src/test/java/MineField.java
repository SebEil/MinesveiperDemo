

public class MineField {

    public String[] input;

    public MineField(String[] input) {
        this.input = input;
    }

    public String[] displayMinefield(){
        String[] result = new String[input.length];
        for (int row = 0; row< input.length; row++){
            String rowString = "";
            for (int col = 0; col < input[row].length(); col++) {
                if (hasMine(row, col)){
                    rowString += "*";
                } else {
                    int hint = 0;
                    for (int r=row-1; r<=row+1; r++){
                        for (int c = col-1; c <=col+1; c++) {
                            if (hasMine(r,c)){
                                hint += 1;
                            }
                        }
                    }
                    rowString += hint;
                }

            }
            result[row] = rowString;
        }
        return result;
    }

    public boolean hasMine(int row, int col){
        if (row < 0 || input.length <= row) {
            return false;
        }
        if (col < 0 || input[row].length() <= col) {
            return false;
        }
        return input[row].charAt(col) == '*';
    }
}
