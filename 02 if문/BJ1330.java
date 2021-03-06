/*
문제
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.

A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
제한
-10,000 ≤ A, B ≤ 10,000
*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();        
        sc.close();
        
        String[] numArr = num.split(" ");
        int a = Integer.parseInt(numArr[0]);
        int b = Integer.parseInt(numArr[1]);
        
        if(a>b){
          System.out.println(">");
        }else if(a<b){
          System.out.println("<");
        }else{
          System.out.println("==");
        }
    }
}
*/

//문제 이해를 잘못했는지 위처럼 풀었는데 아래처럼 풀어도 상관없었다.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        
        if(A>B) System.out.println(">");
        else if(A<B) System.out.println("<");
        else System.out.println("==");
    }
}