package org.example.springtest_01.controller.member;

import lombok.extern.slf4j.Slf4j;
import org.example.springtest_01.domain.member.MemberEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class MemberListControllerV1 {
    @GetMapping("/member/list")
    public String memberList(Model model){
        List<MemberEntity> memberList = new ArrayList<>();

        memberList.add(new MemberEntity(1L,"ronaldo@example.com","호날두","플래티넘",100000000L));
        memberList.add(new MemberEntity(2L,"sjk@example.com","송중기","골드",1000000L));
        memberList.add(new MemberEntity(3L,"xenosign@example.com","이효석","아이언",100L));

        model.addAttribute("memberList", memberList);

        return "member/list";
    }
}
