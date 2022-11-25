import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Main{
    
    public static void main(String[] args) {
      Scanner SC = new Scanner(System.in);
      HashSet<String> group1 = new HashSet<>();
      HashSet<String> group2 = new HashSet<>();
      HashSet<String> self = new HashSet<>();
      
      int bdayNum = 3;
      for(int i = 1; i <= bdayNum; i++){
          System.out.print("Enter birth month " + i + ": ");
          String birthmonth1 = SC.nextLine();
          group1.add(birthmonth1);
      }
      for(int i = 1; i <= bdayNum; i++){
          System.out.print("Enter birth month " + i + ": ");
          String birthmonth2 = SC.nextLine();
          group2.add(birthmonth2);
      }
      
      Set union = new HashSet(group1);
      Set inter = new HashSet(group1);
      Set diff = new HashSet(group1);
      union.addAll(group2);
      inter.retainAll(group2);
      diff.removeAll(group2);
      
      System.out.println("Group 1: " + group1);
      System.out.println("Group 2: " + group2);
      
      System.out.print("Enter your birthmonth: ");
      String bdaymo = SC.nextLine();
      self.add(bdaymo);
      
      System.out.println("Union: " + union);
      System.out.println("Intersection: " + inter);
      System.out.println("Difference: " + diff);
      
      Set sameBday1 = new HashSet(group1);
      sameBday1.removeAll(self);
      Set sameBday2 = new HashSet(group2);
      sameBday2.removeAll(self);
      int sameBday3 = sameBday1.size() + sameBday2.size();
      
      if(sameBday3==6){
          System.out.println("You don't have the same birth month with any of your classmates.");
      }
      else if(sameBday3==5){
          System.out.println("You have the same birth month with one of your classmates.");
      }
      else if(sameBday3==4){
          System.out.println("You have the same birth month with two of your classmates.");
      }
       else if(sameBday3==3){
          System.out.println("You have the same birth month with three of your classmates.");
      }
       else if(sameBday3==2){
          System.out.println("You have the same birth month with four of your classmates.");
      }
       else if(sameBday3==1){
          System.out.println("You have the same birth month with five of your classmates.");
      }
       else{
          System.out.println("You have the same birth month with all of your classmates.");
      }
    }
}
