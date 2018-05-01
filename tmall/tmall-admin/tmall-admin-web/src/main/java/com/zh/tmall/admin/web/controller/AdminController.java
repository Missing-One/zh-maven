package com.zh.tmall.admin.web.controller;

import com.zh.tmall.common.util.PageUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/index")
    String index(Model model){


        PageUtils pageUtils = new PageUtils();
        pageUtils.setCount(1);
        pageUtils.setHasNext(true);
        pageUtils.setHasPreviouse(true);
        pageUtils.setIndex(1);
        pageUtils.setLast(5);
        pageUtils.setStart(1);
        pageUtils.setTotalPage(10);
        pageUtils.setParam("as");

        model.addAttribute("page",pageUtils);

        return "admin/index";
    }



    @RequestMapping("/")
    String idex(){
        return "root";
    }

    @RequestMapping("/{page}")
    String data(@PathVariable String page){
        return "admin/" + page;
    }

}
