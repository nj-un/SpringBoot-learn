package com.gx.validate.controller;

import com.gx.validate.annotation.DateTime;
import com.gx.validate.entity.Book;
import com.gx.validate.entity.Greens;
import com.gx.validate.groups.Groups;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * @author: gaoxu
 * @date: 2018/9/18
 */
@RestController
@Validated
public class ValidateController {

    @GetMapping("/test")
    public String test(@DateTime(message = "您输入的格式错误，正确的格式为：{format}", format = "yyyy-MM-dd HH:mm") String date) {
        return "success";
    }

    @GetMapping("/test2")
    public String test2(@NotBlank(message = "name 不能为空") @Length(min = 2, max = 10, message = "name 长度必须在 {min} - {max} 之间") String name) {
        return "success";
    }

    @GetMapping("/test3")
    public String test3(@Validated Book book) {
        return "success";
    }

    @GetMapping("/insert")
    public String insert(@Validated(value = Groups.Default.class) Greens greens) {
        return "insert";
    }

    @GetMapping("/update")
    public String update(@Validated(value = {Groups.Default.class, Groups.Update.class}) Greens greens) {
        return "update";
    }

}
