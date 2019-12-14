package laba1;

import java.lang.*;
public class teatsdog {
    public static void main(String[] args) {
        dog d1 = new dog("Pan", 34);
        dog d2 = new dog("Nike", 36);
        dog d3 = new dog("Ran");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
