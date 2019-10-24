package com.boot.controller;

import com.boot.model.Character;
import com.boot.service.DiceRollService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/diceRoll/")
public class DiceRollController {

    @RequestMapping(value = "dice", method = RequestMethod.GET)
    public Integer diceRollService() {
        return new DiceRollService().diceRollSix();
    }
}
