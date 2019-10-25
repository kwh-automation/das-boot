package com.boot.controller;

import com.boot.model.Character;
import com.boot.repository.CharacterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @RequestMapping(value = "characters", method = RequestMethod.GET)
    public List<Character> list() {
        return characterRepository.findAll();
    }

    @RequestMapping(value = "characters", method = RequestMethod.POST)
    public Character create(@RequestBody Character character) {
        return characterRepository.saveAndFlush(character);
    }

    @RequestMapping(value = "characters/{id}", method = RequestMethod.GET)
    public Character get(@PathVariable Long id) {
        Optional<Character> character = characterRepository.findById(id);
        return character.get();
    }

    @RequestMapping(value = "characters/{id}", method = RequestMethod.PUT)
    public Character update(@PathVariable Long id, @RequestBody Character character) {
        Optional<Character> existingCharacter = characterRepository.findById(id);
        BeanUtils.copyProperties(character, existingCharacter.get());
        return characterRepository.saveAndFlush(existingCharacter.get());
    }

    @RequestMapping(value = "characters/{id}", method = RequestMethod.DELETE)
    public Character delete(@PathVariable Long id) {
        Optional<Character> existingCharacter = characterRepository.findById(id);
        characterRepository.delete(existingCharacter.get());
        return existingCharacter.get();
    }
}
