package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.Card;
import com.example.demo.repo.CardRepo;

@CrossOrigin(origins = {"http://localhost:3000"}, allowCredentials = "true")
@Controller
public class Cardcontroller {
	

@Autowired
CardRepo repocard;
	
@RequestMapping("/savecard")
public String saveaccount(Card card) {
repocard.save(card);
return "Account saved successfully.";
} 


@RequestMapping("/getcard")
@ResponseBody
public List<Card> getlinks(Card card) {
return repocard.findByIDSorted();   	
}

@RequestMapping("/deletecard")
@ResponseBody
public String deletelinkgroupByviewdataID(@RequestParam int id) {
repocard.deleteByviewdataID(id);
return "Data deleted successfully.";
}	

	
}
