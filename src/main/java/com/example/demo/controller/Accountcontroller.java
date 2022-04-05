package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepo;

@CrossOrigin(origins = {"http://localhost:3000"}, allowCredentials = "true")
@Controller
public class Accountcontroller {
	

@Autowired
AccountRepo repoaccount;
	
@RequestMapping("/saveaccount")
public String saveaccount(Account Account) {
repoaccount.save(Account);
return "Account saved successfully.";
} 


@RequestMapping("/getaccount")
@ResponseBody
public List<Account> getlinks(Account account) {
return repoaccount.findByIDSorted();   	
}

@RequestMapping("/deleteaccount")
@ResponseBody
public String deletelinkgroupByviewdataID(@RequestParam int id) {
repoaccount.deleteByviewdataID(id);
return "Data deleted successfully.";
}	

	
}
