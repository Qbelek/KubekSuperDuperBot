package com.kubek.kubeksuperduperbot.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EngineController {



    @Autowired
    public EngineController() {

    }

    @GetMapping("/launch")
    public void launch() {
    }
}
