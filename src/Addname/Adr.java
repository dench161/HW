package Addname;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adr {
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input address:");
        address = br.readLine();
    }

    public String getName() {
        return name;
    }

    public void setName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input name:");
        name = br.readLine();
    }


}