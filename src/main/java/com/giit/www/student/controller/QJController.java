package com.giit.www.student.controller;

import com.giit.www.student.service.QJBiz;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.giit.www.entity.QJ;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
/**
 * Created by luoki on 2017/6/8.
 */
@Controller

@RequestMapping("QJ.do")
public class QJController {
    @Resource(name = "QJBizImpl")
    private QJBiz QJBiz;

    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("showQJ")
    public String QJView(Model m) {
        m.addAttribute("qjList", QJBiz.findAllQJ());
        return "/student/human/showQJ";
    }

    @RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("add")
    public String add(QJ qj, HttpSession session) {
        QJBiz.add(qj);
        return "/student/human/addQJ";
    }

    /*@RequiresRoles(value = {"admin", "student"}, logical = Logical.OR)
    @RequestMapping("delete")
    public String delete(int id, HttpSession session){
        QJBiz.delete(id);
        return "redirect:/QJ.do/QJ.view";
    }*/
}
