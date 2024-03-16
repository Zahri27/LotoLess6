import java.util.Arrays;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {

    Random random = new Random();
    int[] lotteryNumbers = new int[7];
    int[] playerNumbers = new int[7];
      for (int i = 0; i < 7; i++) {
          lotteryNumbers[i] = random.nextInt(10);
          playerNumbers[i] = random.nextInt(10);
      }
            Arrays.sort(lotteryNumbers);
            Arrays.sort(playerNumbers);
            System.out.println("Числа, загаданные организацией лотереи: " + Arrays.toString(lotteryNumbers));
            System.out.println("Числа, угаданные игроком: " + Arrays.toString(playerNumbers));
            int matchingNumbers = 0;
            for (int i = 0; i < 7; i++) {
                if (lotteryNumbers[i] == playerNumbers[i]) {
                    matchingNumbers++;
                }
            }
            System.out.println("Количество совпадений: " + matchingNumbers);

        }
    }


