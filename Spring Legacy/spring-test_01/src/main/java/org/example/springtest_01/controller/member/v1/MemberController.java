package org.example.springtest_01.controller.member.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MemberController {
    @GetMapping("/member")
    public String memberHome(){
        log.info("===================> MemberController /");
        return "member/index";
    }
}
