package hello.core.xml;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {

    @Test
    void appConfigXml() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        Member member = new Member(1L, Grade.VIP, "memberA");

        memberService.join(member);

        Member findByMember = memberService.findMember(1L);
        System.out.println("findByMember ==> " + findByMember.getName());

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
