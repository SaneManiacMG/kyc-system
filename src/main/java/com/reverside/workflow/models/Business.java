package com.reverside.workflow.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Business {
    private String businessId;
    private Status registrationStatus;
    private String directorIdNumber;
    private int kycScore;
}
