public class Matrix {
    public boolean isSquareMatrix(int[][] matrix){
        if(matrix == null)
            return false;
        if(matrix.length == 0)
            return false;

        for (int i = 0; i < matrix.length; i++) {
            if(matrix.length != matrix[i].length){
                return false;
            }
        }

        return true;
    }

    public double averageArrayElements(int[] array){
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        avg = (double) sum / array.length;
        return avg;
    }
}
