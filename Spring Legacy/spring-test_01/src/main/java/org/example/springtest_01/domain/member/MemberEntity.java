package org.example.springtest_01.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    private Long id;
    private String email;
    private String name;
    private String grade;
    private Long asset;
}
