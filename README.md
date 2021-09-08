# baekjoon
backjoon online judge

https://www.acmicpc.net/

###### + 210909 : Scanner보다 BufferedReader쓰는게 더 효율적이라고 한다.
``` java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    ...
  }
}
```