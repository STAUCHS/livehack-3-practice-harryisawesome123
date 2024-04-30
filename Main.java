class Main extends ConsoleProgram {
  public void run() {
      // Make test calls to your methods here
  }

  public int dateFashion(int you, int date) {

    int yes = 2;
    int no = 0;
    int maybe = 1;

    if (you >= 8 && date > 2 || date >= 8 && you > 2) {
      return yes;
    }
    else if (you <= 2 || date <= 2) {
      return no;
    }
    else {
      return maybe;
    }

  }

/* You and your date are trying to get a table at a restaurant. 
* The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
* The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). 
* With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
*/


// Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public int sortaSum(int a, int b) {
  int hoho = 20;
  int sum = a + b;

  if (sum <= 19 && sum >= 10) {
    return hoho;
  }

  else {
    return sum;
  }
}

/*Given a number n, return true if n is in the range 1..10, inclusive. 
Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
 */

 public boolean in1To10(int n, boolean outsideMode) {
  if (n >= 1 && n <= 10 && (outsideMode = false)) {
    return true;
  }

  else if (n <= 1 && (outsideMode = true) || n >= 10 && (outsideMode = true)) {
    return true;
  }

  else {
    return false;
  }
  
 }
 
/*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
 */

 public boolean old35(int n) {
  if (n < 0) {
    return false;
  }

  else if (n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0) {
    return true;
  }

  else {
    return false;
  }
}

// Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

public int teenSum(int a, int b) {
    int sum = a + b;
    int teen = 19;
  
    if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
      return teen;
    }

    else {
      return sum;
    }

    }

    /* Given a string str, if the string starts with "f" return "Fizz".
     If the string ends with "b" return "Buzz". 
     If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
      (See also: FizzBuzz Code)

 */
public String fizzString(String str) {
  String F = "Fizz";
  String B = "Buzz";

  // START IS F. END IS NOT B
  if (str.startsWith("f") && !(str.endsWith("b"))) {
    return F;
  }

  // START NOT F. END IS B
  else if (!(str.startsWith("f")) && str.endsWith("b")) {
    return B;
  }

  // START IS F. END IS B
  else if (str.startsWith("f") && str.endsWith("b")) {
    return F + B;
  }


    return str;
  }

  // Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
  public boolean inOrder(int a, int b, int c, boolean bOk) {
    if (bOk) {
      return c > b;
    } else {
      return b > a && c > b;
    }
  }
  
  // Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

  public boolean lessBy10(int a, int b, int c) {
    if (a <= b - 10 || a <= c - 10 || b <= a - 10 || b <= c - 10 || c <= a - 10 || c <= b - 10) {
      return true;
    }

    else {
      return false;
    }
  
  }

  /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. 
  Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
 */

 int all2 = 10;
 int allsame = 5;
 int different = 1;
 int zero = 0;

 public int redTicket(int a, int b, int c) {

  if (a == 2 && a == b && a == c) {
    return all2;
  }
  
  else if (a != 2 && a == b && a == c) {
    return allsame;
  }

  else if ( b != a && c != a) {
    return different;
  }

  else {
    return zero;
  }
 }
 /*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 
 Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 */

 public boolean shareDigit(int a, int b) {
  if ( a >= 10 && a <= 99 && a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10) {
    return true;
  }

  else {
    return false;
  } 
 }

 // Given a string, return a string where for every char in the original, there are two chars.

 public String doubleChar(String str) {
  
  String result = "";

  for (int i = 0; i < str.length(); i++) {
    char ch;
    ch = str.charAt(i);
    
    result += ch + "" + ch;
  }
  
  return result;
 }

 // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

 public int countCode(String str) {

  int count = 0;

  for (int i = 0; i < str.length() - 3; i++) {
    if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
      count++;
    }
  }
  return count;

 }

// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public boolean bobThere(String str) {
  
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
      return true;
    }
  }
  return false;
}

// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public String repeatEnd(String str, int n) {

  String thekinglol;
  thekinglol = str.substring(str.length() - n);

  String result = "";

  for (int i = 0; i < n; i++) {
    result += thekinglol;
  }

  return result;
}

/* Given a string, consider the prefix string made of the first N chars of the string. 
Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length(). */

public boolean prefixAgain(String str, int n) {
  String prefix = "";
  String rest = "";

  prefix = str.substring(0, n);

  rest = str.substring(n, str.length());

  if (rest.contains(prefix)) {
    return true;
  }
  return false;
  }


//  Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

public boolean sameStarChar(String str) {

  for (int i = 1; i < str.length() - 1; i++) {
    if (str.charAt(i) == '*') {
      if (str.charAt(i - 1) != str.charAt(i + 1)) {
        return false;
      }
    }
  }
return true;

}
}
