package xmren;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* This class demonstrates documentation comments.
* @author rxm
* @version 1.0
*/
public class Test47 {
   /**
   * This method returns the square of num.
   * This is a multiline description. You can use
   * as many lines as you like.
   * @param num The value to be squared.
   * @return num squared.
   */
   public double square(double num) {
      return num * num;
   }
   /**
   * This method inputs a number from the user.
   * @return The value input as a double.
   * @exception IOException On input error.
   * @see IOException
   */
   public double getNumber() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader inData = new BufferedReader(isr);
      String str;
      str = inData.readLine();
      return (new Double(str)).doubleValue();
   }
   /**
   * This method demonstrates square().
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
   public static void main(String args[]) throws IOException
   {
      Test47 ob = new Test47();
      double val;
      System.out.println("Enter value to be squared: ");
      val = ob.getNumber();
      val = ob.square(val);
      System.out.println("Squared value is " + val);
      
      
      String a[] = { "A", "E", "I" };
      String b[] = { "O", "U" ,"I"};
      List<String> list = new ArrayList(Arrays.asList(a));
      list.addAll(Arrays.asList(b));
      Object[] c = list.toArray();
      System.out.println(Arrays.toString(c));
      
   }
}