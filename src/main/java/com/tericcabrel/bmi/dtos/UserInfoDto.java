package com.tericcabrel.bmi.dtos;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Accessors(chain = true)
@Data
public class UserInfoDto {
    @Min(value = 2, message = "The code must be equal or greater than 3")
    @Max(value = 800, message = "The code must be equal or lower than 800")
    double weight;

    @Min(value = 40, message = "The code must be equal or greater than 40")
    @Max(value = 300, message = "The code must be equal or lower than 300")
    double height;

    public double getComputedHeight() {
        return this.height / 100;
    };
}
