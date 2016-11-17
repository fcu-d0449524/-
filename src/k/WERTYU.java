package k;

import java.util.Scanner;

public class WERTYU {

  public static void main(String[] args) {
    
    String row = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

    Scanner keyboard = new Scanner(System.in);

    while (keyboard.hasNext()) {
      String line = keyboard.nextLine();

      for (int i = 0; i < line.length(); i++) {
        if (line.charAt(i) != ' ') {
          for (int j = 0; j < row.length(); j++) {
            if (line.charAt(i) == row.charAt(j)) {
              System.out.print(row.charAt(j - 1));
            }
          }
        } else {
          System.out.print(' ');
        }
      }
      System.out.println();
    }
    
    keyboard.close();
  }

}
