package com.boot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// Basic info
	Long id;
	String name;
	String characterClassType;
	String race;
	String theme;
	Integer level;
	String size;
	String gender;
	String homeWorld;
	Integer speed;
	String alignment;
	String deity;
	String notes;

	//Ability Scores
	Integer strength;
	Integer dexterity;
	Integer constitution;
	Integer intelligence;
	Integer wisdom;
	Integer charisma;

	//Skills
	Integer acrobatics;
	Integer athletics;
	Integer bluff;
	Integer computers;
	Integer culture;
	Integer diplomacy;
	Integer disguise;
	Integer engineering;
	Integer intimidate;
	Integer lifeScience;
	Integer medicine;
	Integer mysticism;
	Integer perception;
	Integer physicalScience;
	Integer piloting;
	Integer profession;
	Integer senseMotive;
	Integer sleightOfHand;
	Integer stealth;
	Integer survival;


	public Character() { }

	public Character(Long id, String name, String characterClassType, String race, String theme, String size,
					 String gender, String homeWorld, Integer speed, String alignment, String deity, String notes,
					 Integer acrobatics, Integer athletics, Integer bluff, Integer computers, Integer culture,
					 Integer diplomacy, Integer disguise, Integer engineering, Integer intimidate, Integer lifeScience,
					 Integer medicine, Integer mysticism, Integer perception, Integer physicalScience, Integer piloting,
					 Integer profession, Integer senseMotive, Integer sleightOfHand, Integer stealth, Integer survival,
					 Integer level, Integer strength, Integer dexterity, Integer constitution, Integer intelligence,
					 Integer wisdom, Integer charisma) {
		this.id = id;
		this.name = name;
		this.characterClassType = characterClassType;
		this.race = race;
		this.level = level;
		this.size = size;
		this.gender = gender;
		this.homeWorld = homeWorld;
		this.speed = speed;
		this.alignment = alignment;
		this.deity = deity;
		this.theme = theme;
		this.notes = notes;

		//Ability Scores
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;

		// Skills
		this.acrobatics = acrobatics;
		this.athletics = athletics;
		this.bluff = bluff;
		this.computers = computers;
		this.culture = culture;
		this.diplomacy = diplomacy;
		this.disguise = disguise;
		this.engineering = engineering;
		this.intimidate = intimidate;
		this.lifeScience = lifeScience;
		this.medicine = medicine;
		this.mysticism = mysticism;
		this.perception = perception;
		this.physicalScience = physicalScience;
		this.piloting = piloting;
		this.profession = profession;
		this.senseMotive = senseMotive;
		this.sleightOfHand = sleightOfHand;
		this.stealth = stealth;
		this.survival = survival;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterClassType() {
		return characterClassType;
	}

	public void setCharacterClassType(String description) {
		this.characterClassType = description;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String condition) {
		this.race = condition;
	}

	public String getTheme() { return theme; }

	public void setTheme(String theme) { this.theme = theme; }

	public Integer getLevel() { return level; }

	public void setLevel(Integer level) { this.level = level; }

	public String getSize() { return size; }

	public void setSize(String size) { this.size = size; }

	public String getGender() { return gender; }

	public void setGender(String gender) { this.gender = gender; }

	public String getHomeWorld() { return homeWorld; }

	public void setHomeWorld(String homeWorld) { this.homeWorld = homeWorld; }

	public Integer getSpeed() { return speed; }

	public void setSpeed(Integer speed) { this.speed = speed; }

	public String getAlignment() { return alignment; }

	public void setAlignment(String alignment) { this.alignment = alignment; }

	public String getDeity() { return deity; }

	public void setDeity(String deity) { this.deity = deity; }

	public Integer getDexterity() { return strength; }

	public void setDexterity(Integer dexterity) { this.dexterity = dexterity; }

	public Integer getConstitution() { return constitution; }

	public void setConstitution(Integer constitution) { this.constitution = constitution; }

	public Integer getIntelligence() { return intelligence; }

	public void setIntelligence(Integer intelligence) { this.intelligence = intelligence; }

	public Integer getWisdom() { return wisdom; }

	public void setWisdom(Integer wisdom) { this.wisdom = wisdom; }

	public Integer getCharisma() { return charisma; }

	public void setCharisma(Integer charisma) { this.charisma = charisma; }

	public Integer getStrength() { return strength; }

	public void setStrength(Integer strength) { this.strength = strength; }

	public String getNotes() { return notes; }

	public void setNotes(String notes) { this.notes = notes; }

	// TODO: Add skills to section

}
