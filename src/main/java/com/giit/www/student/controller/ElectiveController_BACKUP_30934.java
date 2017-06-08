package com.giit.www.student.controller;

import com.giit.www.student.service.ElectiveBiz;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by c0de8ug on 16-2-16.
 */
@Controller

@RequestMapping("elective.do")
public class ElectiveController {
    @Resource(name = "electiveBizImpl")
    private ElectiveBiz electiveBiz;

    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("elective.view")
    public String electiveView(Model m) {
        m.addAttribute("sectionList", electiveBiz.findAllSection());
        return "/student/elective";
    }

<<<<<<< HEAD
   // @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("add")
    public String add(int secId, HttpSession session) {

       // String stdId = (String) session.getAttribute("username");

        String stdId = "student";
=======
    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("show")
    public String show(Model m,HttpSession session) {
        String stdId = (String) session.getAttribute("username");
        m.addAttribute("sectionList", electiveBiz.findMySection(stdId));
        return "/student/show";
    }



    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("add")
    public String add(int secId, HttpSession session) {
        String stdId = (String) session.getAttribute("username");

>>>>>>> dev
        electiveBiz.add(secId, stdId);

        return "redirect:/elective.do/elective.view";
    }

    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("delete")
    public String delete(int secId, HttpSession session) {
        String stdId = (String) session.getAttribute("username");
        electiveBiz.delete(secId, stdId);
        return "redirect:/elective.do/elective.view";
    }

}
