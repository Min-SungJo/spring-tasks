package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    /** 회원을 저장하면 저장된 회원이 반환돰*/
    Member save(Member member);
    /** id 로 회원을 찾는 기능*/
    Optional<Member> findByName(String name);
    /** name 으로 회원을 찾는 기능*/
    Optional<Member> findById(Long id);
    /** 모든 회원을 반환하는 기능*/
    List<Member> findAll();
}
