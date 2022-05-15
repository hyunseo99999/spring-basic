package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Member member = new Member(1L, Grade.VIP, "memberA");
        memberRepository.save(member);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);
        Assertions.assertEquals(order.getDiscountPrice(), 9000);


    }

}
