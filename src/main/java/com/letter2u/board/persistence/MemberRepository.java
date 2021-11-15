package com.letter2u.board.persistence;

import org.springframework.data.repository.CrudRepository;

import com.letter2u.board.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
