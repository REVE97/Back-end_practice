package org.example.springtest_01.service.member;

import org.example.springtest_01.domain.member.MemberEntity;
import org.example.springtest_01.dto.member.MemberDto;
import org.example.springtest_01.repository.member.MemberRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceV1 {
    private final MemberRepositoryV1 memberRepository;

    @Autowired
    public MemberServiceV1(MemberRepositoryV1 memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberDto> getMemberList(){
        List<MemberEntity> entityList = memberRepository.getMemberList();
        List<MemberDto> dtoList = new ArrayList<>();

        for(MemberEntity entity : entityList){
            MemberDto dto = new MemberDto();
            dto.setEmail(entity.getEmail());
            dto.setName(entity.getName());
            dtoList.add(dto);
        }

        return dtoList;
    }

    public void addMember(String name, String email) {
        MemberEntity member = new MemberEntity();

        member.setName(name);
        member.setEmail(email);

        member.setGrade("아이언");
        member.setAsset(100L);

        memberRepository.save(member);
    }
}
