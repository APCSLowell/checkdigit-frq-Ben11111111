public class CheckDigit
{
  private int total, n;

  public static int getCheck(int num)
  {
    int sum = 0;
    int numberOfDigits = getNumberOfDigits(num);
    for (int i = 1; i <= numberOfDigits; i++) {
      int digit = getDigit(num, i);
      sum += (8 - i) * digit; 
    }
    return sum % 10;
  }

  public static boolean isValid(int numWithCheckDigit)
  {
 
    return numWithCheckDigit % 10 == getCheck(numWithCheckDigit / 10);
  }

  public static int getNumberOfDigits(int num)
  {
    if (num < 10)
      return 1;
    return 1 + getNumberOfDigits(num / 10);
  }

  public static int getDigit(int num, int n)
  {
    int pos = getNumberOfDigits(num) - n + 1;
    while (pos > 1) {
      num /= 10;
      pos--;
    }
    return num % 10;
  }
}
