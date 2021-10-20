package com.helenatech.wedweekone;

import com.helenatech.wedweekone.foo.Nationality;
import com.helenatech.wedweekone.foo.Passport;

public class Main {
    public static void main(String[] args) {
//        Bar bar = new Bar();
//        bar.doSomethingPublic();
//
//        Person anand = new Person("anand", Nationality.ITALIAN);
//        Person darania = new Person("darania", Nationality.ITALIAN);
//
//        Calculator calculator = new Calculator();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.hasNextShort();
//
//        String gender = "FEMALE";

        Passport anandPassport = new Passport();
        anandPassport.setColor("BLUE");
        System.out.println(anandPassport.getColor());

        Person person = new Person();
        Passport rosePassport = new Passport(20121, "BLUE", Nationality.BRITISH, person);
        rosePassport.setColor("RED");
//        rosePassport.setNationlity(Nationality.BRITISH);
//        rosePassport.setNumber(113131);
        System.out.println(rosePassport.getColor());
        System.out.println(rosePassport.getNationlity());
        System.out.println(rosePassport.getNumber());

    }


}
