package be.vdab.strips.controllers;

import be.vdab.strips.services.FiguurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    private final FiguurService figuurService;

    public IndexController(FiguurService figuurService) {
        this.figuurService = figuurService;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index", "figuren", figuurService.findAll());
    }
}
