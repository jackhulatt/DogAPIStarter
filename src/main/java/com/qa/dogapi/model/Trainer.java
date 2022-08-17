package com.qa.dogapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainer_id")
	private Integer trainerId;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private float age;
	
	
	@OneToMany(mappedBy = "trainer", fetch = FetchType.EAGER, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Dog> dogList;
	
	
	//Order matters when creating the trainers and dogs 
	// Trainer must exist for a dog to exist [{},{},{}]

	
	

}
