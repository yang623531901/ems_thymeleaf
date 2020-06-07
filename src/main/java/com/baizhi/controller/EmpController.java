package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;

import java.util.List;

/**
 * @author 杨志远
 * @date 2020-06-06 19:12
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 查询所有员工
     * @param model
     * @return
     */
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps=empService.findAll();
        model.addAttribute("emps",emps);
        return "/ems/emplist";
    }

    /**
     * 保存员工
     * @param emp
     * @return
     */
    @PostMapping("/save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public String delete(Integer id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    /**
     * 根据id查询员工
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/find")
    public String find(Integer id,Model model){
        Emp emp = empService.find(id);
        model.addAttribute("emp",emp);
        return "/ems/updateEmp";
    }

    /**
     * 更新员工信息
     * @param emp
     * @return
     */
    @PostMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }

}
