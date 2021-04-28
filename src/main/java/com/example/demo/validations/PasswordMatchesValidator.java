package com.example.demo.validations;

import com.example.demo.annotations.PasswordMatches;
import com.example.demo.payload.request.SingupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SingupRequest userSingpuRequest = (SingupRequest) obj;
        return userSingpuRequest.getPassword().equals(userSingpuRequest.getConfirmPassword());
    }
}
