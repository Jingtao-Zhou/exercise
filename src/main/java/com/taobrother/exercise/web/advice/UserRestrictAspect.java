package com.taobrother.exercise.web.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserRestrictAspect {

    @Before("@annotation(com.taobrother.exercise.web.annotation.VerifyId) && args(userId, ..)")
    public void validateUserId(Long userId) throws Exception {
        if(userId < 0L){
            throw new Exception();
        }
    }
}
