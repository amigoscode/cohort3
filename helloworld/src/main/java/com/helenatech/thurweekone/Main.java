package com.helenatech.thurweekone;

import com.helenatech.thurweekone.email.EmailService;
import com.helenatech.thurweekone.footballmanager.FootballPlayer;
import com.helenatech.thurweekone.footballmanager.FootballPlayerService;
import com.helenatech.thurweekone.medical.MedicalCheckService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MedicalCheckService medicalCheckService = new MedicalCheckService();
        EmailService emailService = new EmailService();

        FootballPlayerService footballPlayerService = new FootballPlayerService(
                medicalCheckService, emailService
        );
        footballPlayerService.addPlayer(
                new FootballPlayer("Drogba", 15)
        );

    }

    private static void dates() {
        LocalDate date = LocalDate.now();
        System.out.println(date.minusDays(20));

        LocalDate dob = LocalDate.of(2000, Month.JULY, 20);
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
