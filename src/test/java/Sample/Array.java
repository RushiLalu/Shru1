package Sample;

import java.sql.SQLOutput;

public class Array {

    public static void main(String[] args) {


        System.out.println("WorKing on Array:-");
        Array array=new Array();
        array.ArrayRead();
    }

    public void ArrayRead()
    {
        int arr1[]= {3,4,7,8,9,0};

                for (int i=0;i< arr1.length;i++)
                {
                    System.out.println(" "+arr1[i]);
                }

    }
}
