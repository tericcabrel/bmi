package com.tericcabrel.bmi.controllers;

import com.tericcabrel.bmi.dtos.ResultDto;
import com.tericcabrel.bmi.dtos.UserInfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class IndexController {
    @GetMapping("/")
    public String indexPage(Model model) {
        UserInfoDto userInfoDto = new UserInfoDto();

        userInfoDto.setHeight(40d).setWeight(2d);

        model.addAttribute("userInfo", userInfoDto);

        return "index";
    }

    @PostMapping("/")
    public String calculateBMI(
            @ModelAttribute("userInfo") @Valid UserInfoDto userInfoDto,
            BindingResult inputValidationResult,
            Model model
    ) {
        if (inputValidationResult.hasErrors()) {
            return "index";
        }

        double bmi = calculateBodyMassIndex(userInfoDto.getComputedHeight(), userInfoDto.getWeight());
        ResultDto resultDto = new ResultDto(bmi);

        model.addAttribute("result", resultDto);

        return "index";
    }

    private double calculateBodyMassIndex(double height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        double bmiRounded = Math.round(bmi * 10);

        return  bmiRounded / 10;
    }
}