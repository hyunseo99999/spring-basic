package hello.core;

import hello.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = context.getBean("memberService", MemberService.class);

        /*MemberService memberService = new MemberServiceImpl(null);*/

        Member member = new Member(1L, Grade.VIP, "홍길동");
        memberService.join(member);

        System.out.println("member >>" + member.getId());

        Member findMember = memberService.findMember(member.getId());
        System.out.println("findMember >>" + findMember.getId());

    }
}
