package Brick;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        double c = 0;
        double x = 0;
        double y = 0;
        try {
            System.out.print("a:");
            a = Double.parseDouble(br.readLine());
        } catch (IOException o) {
            System.out.println("Source doesn't exist");
        } catch (NumberFormatException o) {
            System.out.println("Not a number");
        }
        try {
            System.out.print("b:");
            b = Double.parseDouble(br.readLine());
        } catch (IOException o) {
            System.out.println("Source doesn't exist");
        } catch (NumberFormatException o) {
            System.out.println("Not a number");
        }
        try {
            System.out.print("c:");
            c = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Source doesn't exist");
        } catch (NumberFormatException o) {
            System.out.println("Not a number");
        }
        try {
            System.out.print("x:");
            x = Double.parseDouble(br.readLine());
        } catch (IOException o) {
            System.out.println("Source doesn't exist");
        } catch (NumberFormatException o) {
            System.out.println("Not a number");
        }
        try {
            System.out.print("y:");
            y = Double.parseDouble(br.readLine());
        } catch (IOException o) {
            System.out.println("Source doesn't exist!");
        } catch (NumberFormatException o) {
            System.out.println("Not a number!");
        }

        Brick brick = new Brick(a, b, c);
        Hole hole = new Hole(x, y);

        if ((brick.getA() <= hole.getX() && brick.getB() <= hole.getY()) ||
                (brick.getA() <= hole.getY() && brick.getB() <= hole.getX())) {
            System.out.println("Можна просунути.");
        } else if ((brick.getA() <= hole.getX() && brick.getC() <= hole.getY()) ||
                (brick.getA() <= hole.getY() && brick.getC() <= hole.getX())) {
            System.out.println("Можна просунути.");
        } else if ((brick.getC() <= hole.getX() && brick.getB() <= hole.getY()) ||
                (brick.getC() <= hole.getY() && brick.getB() <= hole.getX())) {
            System.out.println("Можна просунути!");
        } else {
            System.out.println("Не можна просунути!");
        }
    }
}

