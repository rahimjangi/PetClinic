package com.raiseup.PetClinic.controller;

import com.raiseup.PetClinic.model.Vet;
import com.raiseup.PetClinic.service.VetService;
import com.raiseup.PetClinic.utils.CompairEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"vets.html","/","index","index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",
                (List<Vet>)vetService.findAll().stream().sorted(new CompairEntity()).collect(Collectors.toList()));
        return "vets/index";
    }
}
