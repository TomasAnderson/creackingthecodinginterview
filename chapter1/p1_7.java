import java.util.*;

class P1_7 {
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 4, 5, 6, 1, 0},
      {1, 3, 5, 0, 2, 4, 6},
      {1, 3, 5, 3, 2, 1, 3},
      {0, 2, 3, 4, 6, 8, 8}
    };
    int[][] expected = {
      {0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0},
      {0, 3, 5, 0, 2, 1, 0},
      {0, 0, 0, 0, 0, 0, 0}
    };
    int[][] result = setZero(matrix);
    printArray(result);
    System.out.println(areTheSameArray(expected, result));   
  }

  static int[][] setZero(int[][] arr) {
    int[] hasZeroInRow = new int[arr.length];
    int[] hasZeroInColumn = new int[arr[0].length];
    Arrays.fill(hasZeroInRow, 0);
    Arrays.fill(hasZeroInColumn, 0);
    
    int i, j;
    for (i=0; i<arr.length; i++) {
      for(j=0; j<arr[0].length; j++) {
        if (arr[i][j] == 0) {
          hasZeroInRow[i] = 1;
          hasZeroInColumn[j] = 1;
        }
      }
    }

    int[][] result = new int[arr.length][arr[0].length];
    for (i=0; i<arr.length; i++) {
      if (hasZeroInRow[i] == 0) {
        for (j=0; j<arr[0].length; j++) {
          if (hasZeroInColumn[j] == 0) {
            result[i][j] = arr[i][j];
          }
        }        
      } else {
        Arrays.fill(result[i], 0);
      }
    }
    return result;
  }

  static void printArray(int[][] arr) {
    String str = "\n";
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[0].length; j++) {
        str += arr[i][j] + " ";
      }
      str += "\n";
    }
    System.out.println(str);
  }

  static Boolean areTheSameArray(int[][] arr1, int[][] arr2) {
    if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
      return false;
    } else {
      int width = arr1.length, height = arr1[0].length;
      Boolean result = true;
      for (int i=0; i<width; i++) {
        for (int j=0; j<height; j++) {
          if (arr1[i][j] != arr2[i][j]) {
            result = false;
          }
        }
      }
      return result;
    }
  } 
}