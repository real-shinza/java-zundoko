import java.util.Random;

public class Zundoko {
  public static void main(String[] args) {
    Random random = new Random();
    String[] options = {"ズン", "ドコ"};
    String pattern = "ズンズンズンズンドコ";
    StringBuilder sequence = new StringBuilder();

    while (true) {
      String result = options[random.nextInt(options.length)];
      sequence.append(result);
      System.out.print(result);
      if (sequence.toString().equals(pattern)) {
        System.out.print("キ・ヨ・シ!");
        break;
      } else if (!pattern.startsWith(sequence.toString())) {
        System.out.println();
        sequence.setLength(0);
      }
    }
  }
}
