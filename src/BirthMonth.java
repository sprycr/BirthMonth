import java.util.Scanner;

public class BirthMonth {//class
  public static void main(String[] args) {//main method
    Scanner in = new Scanner(System.in);
    System.out.println("Please input your birth month: ");
    if (in.hasNextInt()) {
      int monthno = in.nextInt();// input birth month
      if (monthno <= 12 && monthno >= 1) {// if birth month is between 1 and 12
        System.out.println("your birth month is: " + monthno);// output "your birth month is " + birth month
      }
      else {// else
        System.out.println("please input a month between January(1) and December(12). you entered: " + monthno);
      } // end if

    }// end if
    else {
      String trash = in.nextLine();
      System.out.println("Please enter a valid number. you entered: " + trash);
    }

  }
}// end class
