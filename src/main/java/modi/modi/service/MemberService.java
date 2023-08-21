package modi.modi.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import modi.modi.dto.Member;
import modi.modi.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * Member 생성
     * @param member
     * @return
     */

    public Member createMember(Member member){
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }


}
