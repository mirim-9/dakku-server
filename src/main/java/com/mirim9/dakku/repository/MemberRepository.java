package com.mirim9.dakku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirim9.dakku.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{


    Optional<Member> findByEmail(String email);
}
