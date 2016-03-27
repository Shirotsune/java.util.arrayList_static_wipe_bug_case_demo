package testcase;

import java.util.ArrayList;

public class myObject {

    protected static int test;
    protected static ArrayList<myObject> testList;

    public myObject(){
        this.test = 42;
        this.testList = new ArrayList<myObject>();
    }

    //Creates a clean object that does not re-initialize the ArrayList. (Because it is not supposed to)
    public myObject(int any){ 
    }

    
    public void populateArrayList(String bug){
        testList.add(new subObject());
    }

    public void populateArrayList(){
        testList.add(new myObject(2));
        System.out.println("Test: " + test);
        System.out.println("Test list: "+testList.size());
    }
}
