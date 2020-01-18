package com.taobrother.exercise.web.advice;

import com.taobrother.exercise.web.exception.InvalidUserException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserRestrictAspect {

    @Before("@annotation(com.taobrother.exercise.web.annotation.VerifyName) && args(name, ..)")
    public void validateUserName(String name) {
        if(name == null || name.length()==0){
            throw new InvalidUserException("user name is not valid");
        }
    }
}
