public class RightAngledTriangle {
  static void printStar(int star) {
    if (star == 0) {
      return;
    }
    System.out.print("* ");
    printStar(star - 1);
  }

  static void printLine(int lines) {
    if (lines == 0) {
      return;
    }

    printLine(lines - 1);
    printStar(lines);
    System.out.println();
  }

  public static void main(String[] args) {
    printLine(5);

    // int num = 5;

    // for (int row = 1; row <= num; row++) {
    // for (int col = 1; col <= num; col++) {
    // if (col <= row) {
    // System.out.print("*");
    // }
    // System.out.print(" ");
    // }
    // System.out.println("");
    // }
  }
}
