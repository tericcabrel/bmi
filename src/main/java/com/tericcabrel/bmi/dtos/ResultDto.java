package com.tericcabrel.bmi.dtos;

import lombok.Data;

import static com.tericcabrel.bmi.utils.Constants.*;

@Data
public class ResultDto {
    double bmi;

    String description;

    public ResultDto(double bmi) {
        this.bmi = bmi;
        this.description = getBmiRange(this.bmi);
    }

    private String getBmiRange(double bmi) {
        if (bmi < 19) {
            return BMI_UNDERWEIGHT;
        }

        if (bmi >= 19 && bmi < 25) {
            return BMI_NORMAL;
        }

        if (bmi >= 25 && bmi < 30) {
            return BMI_OVERWEIGHT;
        }

        if (bmi >= 30 && bmi < 35) {
            return BMI_OBESITY_CLASS_ONE;
        }

        if (bmi >= 35 && bmi < 40) {
            return BMI_OBESITY_CLASS_TWO;
        }

        return BMI_OBESITY_CLASS_THREE;
    }
}
