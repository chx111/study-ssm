package top.whq6.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author whq
 * @version 1.0  date: 2019-07-30
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
