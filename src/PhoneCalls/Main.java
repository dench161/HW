package PhoneCalls;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Caller caller = new Caller();
        try {
            caller.setC1();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }

        try {
            caller.setC2();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }
        try {
            caller.setC3();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }
        try {
            caller.setT1();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }
        try {
            caller.setT2();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }
        try {
            caller.setT3();
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }

        caller.Counting();


    }
}