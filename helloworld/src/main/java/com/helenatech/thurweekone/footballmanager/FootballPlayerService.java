package com.helenatech.thurweekone.footballmanager;

import com.helenatech.thurweekone.email.Email;
import com.helenatech.thurweekone.email.EmailService;
import com.helenatech.thurweekone.medical.MedicalCheckService;

public class FootballPlayerService {

    private MedicalCheckService medicalCheckService;
    private EmailService emailService;

    public FootballPlayerService(MedicalCheckService medicalCheckService,
                                 EmailService emailService) {
        this.medicalCheckService = medicalCheckService;
        this.emailService = emailService;
    }

    public void addPlayer(FootballPlayer player) {
        boolean ok = medicalCheckService.checkHealth(player);
        if (ok) {
            // add to db
        } else {
            // send email
            emailService.sendEmail(new Email(
                    "player failed medical check",
                    "blha",
                    "info@chelseafc.com"
            ));
        }
    }

    public void deletePlayer(FootballPlayer player) {

    }
}
