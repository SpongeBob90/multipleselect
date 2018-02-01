package com.wyw.multipleselect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\2\1 0001 14:50
 */
@Controller
public class MultipleSelectController {

    @GetMapping(value = "/index")
    public String multipleSelect() {
        return "html/multipleSelect.html";
    }

}
