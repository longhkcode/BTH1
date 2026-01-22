package BTH1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    File file = new File("src/BTH1/input.txt");
    ArrayList<Integer> ar = new ArrayList<>();

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        ar.add(Integer.parseInt(scanner.nextLine()));
      }
    } catch (FileNotFoundException e) {
      System.out.println("Khong tim thay file");
      return;
    }
    for (int n : ar)
    {
      int count = countPerfectNumber(n);
      System.out.println("so luong so hoan hao la : " + count);
    }
  }

  public static boolean ktSoHoanHao(int a)
  {
    if (a < 2) return false;
    int sum = 0;
    for (int i=1;i<= a/2;i++)
    {
      if (a % i == 0)
      {
        sum+=i;
      }
    }
    if (sum == a) return true;
    return false;
  }

  public static int countPerfectNumber(int n)
  {
    int count = 0;
    for (int i = 1;i<n;i++) {
      if (ktSoHoanHao(i)) count ++;
    }
    return count;
  }

}
