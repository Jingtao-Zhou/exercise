package com.taobrother.exercise.web.advice;

import com.taobrother.exercise.web.exception.InvalidUserException;
import com.taobrother.exercise.web.request.SignUpRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserRestrictAspect {

    @Before("@annotation(com.taobrother.exercise.web.annotation.VerifyName) && args(request, ..)")
    public void validateUserName(SignUpRequest request) {
        if(request.getName() == null || request.getName().length()==0){
            throw new InvalidUserException("user name is not valid");
        }
    }
}
