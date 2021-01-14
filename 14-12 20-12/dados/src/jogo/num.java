
package jogo;

public class num {
      public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
        }catch (NumberFormatException e) {
             return false;
        }
        return true;
    }
}
