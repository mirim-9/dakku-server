package com.mirim9.dakku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirim9.dakku.entity.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
