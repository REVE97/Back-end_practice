package org.example.springtest_01.service.member;

import org.example.springtest_01.domain.member.MemberEntity;
import org.example.springtest_01.dto.member.MemberDto;
import org.example.springtest_01.repository.member.MemberRepositoryV1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceV1 {
    private final MemberRepositoryV1 memberRepository;

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
}
