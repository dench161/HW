package PhoneCalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caller {
    private double c1;
    private double c2;
    private double c3;

    private double t1;
    private double t2;
    private double t3;

    public double getT3() {
        return t3;
    }

    public void setT3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input time of the third talk:");
        t3 = Double.parseDouble(br.readLine());
    }

    public double getT2() {
        return t2;
    }

    public void setT2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input time of the second talk:");
        t2 = Double.parseDouble(br.readLine());
    }

    public double getT1() {
        return t1;
    }

    public void setT1()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input time of the first talk:");
        t1 = Double.parseDouble(br.readLine());
    }

    public double getC3() {
        return c3;
    }

    public void setC3()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input tariff for the third country:");
        c3 = Double.parseDouble(br.readLine());
    }

    public double getC2() {
        return c2;
    }

    public void setC2()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input tariff for the second country:");
        c2 = Double.parseDouble(br.readLine());
    }

    public double getC1() {
        return c1;
    }

    public void setC1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input tariff for the first country:");
        c1 = Double.parseDouble(br.readLine());
    }

    public void  Counting(){
        double firstTalk = getC1()*getT1();
        double secondTalk = getC2()*getT2();
        double thirdTalk = getC3()*getT3();

        double countForAllTalks = firstTalk+secondTalk+thirdTalk;

        System.out.println("First talk: "+firstTalk);
        System.out.println("Second talk: "+secondTalk);
        System.out.println("Third task: "+thirdTalk);

        System.out.println("Count for all talks: "+countForAllTalks);
    }
}