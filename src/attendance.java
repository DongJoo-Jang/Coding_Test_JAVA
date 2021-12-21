import java.util.*;
import java.io.*;

public class attendance {

   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in, "UTF-8");
       ArrayList studentInfo = new ArrayList();
       
       while(sc.hasNext()) {    
          String input = sc.nextLine().split(":")[2];
          String inputNum = "";
          String inputName = "";
       
          outer: for(char x : input.toCharArray()) {
             if(Character.isDigit(x)) {
                inputNum += x;
             }
             else if(!Character.isWhitespace(x)) {
                    inputName += x;
                    if(Character.isWhitespace(x)){
                           break outer;
                       }
                }
            }
       
          if(inputNum.length() >= 6 && inputName.length() >= 2) {
             int classof = Integer.parseInt(inputNum);
             if(!studentInfo.contains(classof) || !studentInfo.contains(inputName)) {
                studentInfo.add(classof + " " + inputName);
                Collections.sort(studentInfo);
                
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                out.println(studentInfo.toString().replace("[", "").replace("]", "").replace(", ", "\n")); 
                out.println("\n");
             }
          }
       }
   }
}