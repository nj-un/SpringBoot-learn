package com.gx.validate.annotation;

import com.gx.validate.validator.DateTimeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author: gaoxu
 * @date: 2018/9/18
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = DateTimeValidator.class)
public @interface DateTime {

    String message() default "格式错误";

    String format() default "yyyy-MM-dd";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
