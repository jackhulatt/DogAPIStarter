package com.qa.dogapi.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Dog {
	
	//So at this point in time - this is no different to normal object
	//Beans -- functions that are managed by the Framework 
	//Components --
	
	//Javax - Java Extension -- java 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer dogId;
	
	@NotNull
	@Size(min = 2, max = 20)
	String name;
	
	@Min(0)
	@Max(28)
	float age;

	
	//One to retrive data
	
	
	public Integer getDogId() {
		return dogId;
	}

	public Dog() {
		
	}
	
	public Dog(Integer dogId,  String name, float age) {
		this.dogId = dogId;
		this.name = name;
		this.age = age;
	}
	
	public Dog(String name,float age) {
		this.name = name;
		this.age = age;
	}
	
	// So when passing in JSON -- must be in above format

	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Float.floatToIntBits(age) == Float.floatToIntBits(other.age) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
//	String colour;
//	int noOfLegs;
//	boolean hasTail;
	
	
	
	
	

}
