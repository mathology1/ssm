package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.pojo.Account;
import ssm.service.AccountService;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    //保存
    @PostMapping("/add")
    public String add(Account account){
        accountService.add(account);
        return "redirect:/list";
    }

    //查询
    @GetMapping("/list")
    public String getAll(Model model){
        List<Account> accList = accountService.getAll();
        model.addAttribute("accList", accList);
        return "list";
    }

    public void m(){
        System.out.println("test git switch version");
        System.out.println("在hotfix加的代码");
        System.out.println("在hotfix加的代码第二次");
    }
}
