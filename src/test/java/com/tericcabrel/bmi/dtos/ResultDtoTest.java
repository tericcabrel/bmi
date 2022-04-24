package com.tericcabrel.bmi.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.tericcabrel.bmi.utils.Constants.*;

public class ResultDtoTest {
    @Test
    public void bmiUnderweight() {
        ResultDto resultDto = new ResultDto(10);

        assertEquals(resultDto.getDescription(), BMI_UNDERWEIGHT);
    }

    @Test
    public void bmiNormal() {
        ResultDto resultDto = new ResultDto(22);

        assertEquals(resultDto.getDescription(), BMI_NORMAL);
    }

    @Test
    public void bmiOverweight() {
        ResultDto resultDto = new ResultDto(28.5);

        assertEquals(resultDto.getDescription(), BMI_OVERWEIGHT);
    }

    @Test
    public void bmiObesityClassOne() {
        ResultDto resultDto = new ResultDto(33);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_ONE);
    }

    @Test
    public void bmiObesityClassTwo() {
        ResultDto resultDto = new ResultDto(37.7);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_TWO);
    }

    @Test
    public void bmiObesityClassThree() {
        ResultDto resultDto = new ResultDto(44.3);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_THREE);
    }

    @Test
    public void bmiObesityClassThreeBis() {
        ResultDto resultDto = new ResultDto(78);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_THREE);
    }
}
