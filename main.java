package testcase;

public class main {
    public static void main(String[] args){
        myObject test = new myObject();
        test.populateArrayList(); //clean case. 
        
        myObject test2 = new myObject();
        test.populateArrayList("bug"); //The bug case.
        }
        
      }
