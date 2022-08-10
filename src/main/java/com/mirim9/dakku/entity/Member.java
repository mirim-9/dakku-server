package com.mirim9.dakku.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
}
