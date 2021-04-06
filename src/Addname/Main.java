package Addname;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        Adr informationGetter = new Adr();
        try {
            informationGetter.setName();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist");
        }
        try {
            informationGetter.setAddress();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist");
        }

        System.out.print("Name is "+informationGetter.getName()+"\tAddress: "+informationGetter.getAddress());


    }
}