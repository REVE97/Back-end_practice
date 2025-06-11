package org.example.springtest_01.repository.member;

import org.example.springtest_01.domain.member.MemberEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepositoryV1 {
    public List<MemberEntity> getMemberList(){
        List<MemberEntity> memberList = new ArrayList<>();

        memberList.add(new MemberEntity(1L,"ronaldo@example.com","호날두","플래티넘",100000000L));
        memberList.add(new MemberEntity(2L,"sjk@example.com","송중기","골드",1000000L));
        memberList.add(new MemberEntity(3L,"xenosign@example.com","이효석","아이언",100L));

        return memberList;
    }
}
