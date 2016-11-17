package k;

import java.util.Scanner;

public class DieGame {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int[] ans = new int[20];
    int count = 0;

    while (keyboard.hasNext()) {
    
      int[] die = { 1, 2, 5, 3, 4 };
      int command = keyboard.nextInt();

      if (command == 0) {
        break;
      }

      for (int i = 0; i < command; i++) {
        String s = keyboard.next();
        if (s.equals("north")) {
          die[1] = die[0];
          die[0] = die[2];
          die[2] = 7 - die[1];

        } else if (s.equals("south")) {
          die[2] = die[0];
          die[0] = die[1];
          die[1] = 7 - die[2];
        } else if (s.equals("west")) {
          die[3] = die[0];
          die[0] = die[4];
          die[4] = 7 - die[3];
        } else if (s.equals("east")) {
          die[4] = die[0];
          die[0] = die[3];
          die[3] = 7 - die[4];
        }

      }
      ans[count] = die[0];
      count++;
    }

    for (int i = 0; i < count; i++) {
      System.out.println(ans[i]);
    }

    keyboard.close();
  }

}
