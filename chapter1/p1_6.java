class P1_6 {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
      {1, 2, 3, 5, 4},
      {2, 1, 3, 4, 5},
      {3, 2, 4, 1, 5},
      {1, 4, 5, 2, 3},
      {5, 4, 2, 1, 3}
    }; 
    int[][] expected = new int[][] {
      {5, 1, 3, 2, 1},
      {4, 4, 2, 1, 2},
      {2, 5, 4, 3, 3},
      {1, 2, 1, 4, 5},
      {3, 3, 5, 5, 4}
    };

    int[][] newMatrix = rotateMatrix(matrix);
    System.out.println(areTheSameArray(expected, newMatrix));
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

  static int[][] rotateMatrix(int[][] arr) {
    int height = arr.length;
    int width = arr[0].length;
    int[][] newArr = new int[height][width];
    for (int i=0; i<width; i++) {
      for (int j=0; j<height; j++) {
        newArr[j][height-i-1] = arr[i][j]; 
      }
    }
    return newArr;
  }
}