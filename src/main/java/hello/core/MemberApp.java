package hello.core;

import hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, Grade.VIP, "홍길동");
        memberService.join(member);

        System.out.println("member >>" + member.getId());

        Member findMember = memberService.findMember(member.getId());
        System.out.println("findMember >>" + findMember.getId());

    }
}
