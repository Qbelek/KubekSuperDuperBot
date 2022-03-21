package com.kubek.kubeksuperduperbot.engine;

import com.kubek.kubeksuperduperbot.core.entities.ps5.PS5AdditionType;
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
        var type = PS5AdditionType.CONTROLLER;
    }
}
