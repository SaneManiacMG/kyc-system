package com.reverside.workflow.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.workflow.models.Business;
import com.reverside.workflow.models.Status;

@RestController
public class CheckKyc {
    @GetMapping("/checkStatus")
    public Business verifyDetails(@RequestParam("id") String id) {
        System.out.println("Endpoint hit");
        Business business = new Business();
        business.setBusinessId(id);

        Random random = new Random();
        int randomId = random.nextInt(1000000, 10000000);
        int randomKym = random.nextInt(100);
        business.setDirectorIdNumber(Integer.toString(randomId));
        business.setKycScore(randomKym);
        business.setRegistrationStatus(randomEnum(Status.class));

        System.out.println(business.toString());

        return business;
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> values) {
        int i = new Random().nextInt(7);
        return values.getEnumConstants()[i];
    }
}
