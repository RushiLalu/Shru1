package Sample;

import io.cucumber.plugin.event.Node;

public class AddCons {

    public AddCons()
    {
        System.out.println("Working on default Cons");
    }

    public AddCons(int a,int b)
    {
        System.out.println("Working on Parametrized Cons" +(a+b));
    }

    public static void main(String[] args) {
        System.out.println("Working on Cons");
        AddCons a1=new AddCons();
        AddCons a2=new AddCons(2,3);
    }
}
