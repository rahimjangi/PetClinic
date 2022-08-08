package com.raiseup.PetClinic.controller;

import com.raiseup.PetClinic.model.Owner;
import com.raiseup.PetClinic.service.OwnerService;
import com.raiseup.PetClinic.utils.CompairEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"owners","owners.html"})
    public String ownerList(Model model){
        List<Owner>owners= (List<Owner>) ownerService.findAll().stream().sorted(new CompairEntity()).collect(Collectors.toList());
        model.addAttribute("owners",owners);
        return "owners/index";
    }

    @RequestMapping("owners/find")
    public String findOwners(){
        return "notimplemented";
    }
    @RequestMapping("/oups")
    public String errorPage(){
        return "notimplemented";
    }
}
