/*
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
*/

/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    String num = String.valueOf(b);
    String[] digits = num.split("(?<=.)");
    
    for(int i=2; i>=0; i--){
      int c = Integer.valueOf(digits[i]);
      System.out.println(a*c);
    }

    System.out.println(a*b);

    sc.close();
  }
}
*/

/*
마지막문제는 글자를 잘라야겠는건 알겠는데 숫자로 받았을 경우 어떻게 해야하나 고민을 많이했다.
참고링크 : https://www.delftstack.com/ko/howto/java/how-to-get-the-separate-digits-of-an-int-number/
결과적으로 위 방법으로 글자를 잘라도 순서대로 나오기 때문에 다른 방법을 찾아봄
*/

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    String B = sc.next();

    sc.close();

    System.out.println(A * (B.charAt(2) - '0'));
    System.out.println(A * (B.charAt(1) - '0'));
    System.out.println(A * (B.charAt(0) - '0'));
    System.out.println(A * Integer.parseInt(B));
  }
}

/*
  charAt()으로 인덱스 위치에 있는 문자(Character)값을 반환한다.
  하지만 단순히 charAt()을 사용할 경우 인덱스에 참조하는 값이 아스키코드값을 반환하므로,
  -'0'을 붙여줌으로써 원하는 값을 가져올 수 있다.
*/