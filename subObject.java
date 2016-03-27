package testcase;

public class subObject extends myObject {

    public subObject(){
        System.out.println("Test: " + this.test);
        System.out.println("Test list: " + this.testList.size());
        if(this.testList.size()==0)
            System.out.println("Bug verified!");
    }
}
