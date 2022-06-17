import java.util.Scanner;
public class StringReverse {
   public static void main(String[] args) {
      
      System.out.println("Enter String:");
      Scanner sc = new Scanner(System.in);
      String stringInput = sc.nextLine();
      char[] test = stringInput.toCharArray();
      char[] gg = new char[test.length + 1];
      char[] newArr = new char[test.length + 1];
      int max = test.length ;
      for (int x = 0; x < max; x++){
          gg[x] = test[x];
      }
      for (int y = test.length -1, ctr =0; y>= 0; y--, ctr++){
        if(ctr == test.length){
          ctr += 1;
        }
        newArr[ctr]= gg[y];
      }
      System.out.println("" + new String(newArr));
      
   
  }
  

}