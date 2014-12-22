package com.spring.hibernate.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.hibernate.petclinic.entity.Owner;
import com.spring.hibernate.petclinic.service.OwnerService;

@Controller
public class OwnerController {
	
	@Autowired
	public OwnerService ownerService;
	
	@RequestMapping(value="/owner/", method = RequestMethod.GET)
	public ModelAndView viewIndex(){
		String view = "owner/find";
		
		return new ModelAndView(view);
		
	}
	
	@RequestMapping(value="/owner/find", method = RequestMethod.GET)
	public ModelAndView findForm(Model model){
		String view = "owner/find";
		model.addAttribute("owner", new Owner());
		return new ModelAndView(view, "model", model);
	}
	
	@RequestMapping(value="/owners", method = RequestMethod.POST)
	public ModelAndView findOwnerByLastName(Owner owner){
		String view = "owner/index";
		
		//Map<String, Object> model = new HashMap<String, Object>();
		
		//model.put("ownerList", ownerService.findByLastName(owner.getLastName()));
		
		return new ModelAndView(view);
	}
	
	@RequestMapping(value="/owner/{id}", method=RequestMethod.GET)
	public ModelAndView viewOwner(@PathVariable("id") int id){
		ModelAndView mav = new ModelAndView("owner/ownerProfile");
		mav.addObject(ownerService.findById(id));
		return mav;
	}
}
