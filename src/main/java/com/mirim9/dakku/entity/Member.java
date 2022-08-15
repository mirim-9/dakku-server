package com.mirim9.dakku.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long memberId;

	@NotBlank
	private String nickname;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	private String password;

	@OneToMany(
			mappedBy = "member",
			fetch = FetchType.LAZY
	)
	private List<Diary> diaryList;
}
