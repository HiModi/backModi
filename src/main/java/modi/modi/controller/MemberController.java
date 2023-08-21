package modi.modi.controller;

import lombok.RequiredArgsConstructor;
import modi.modi.dto.Member;
import modi.modi.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequiredArgsConstructor
@RequestMapping("member")
@RestController
public class MemberController {

    private final MemberService memberservice;

    /**
     * Member 생성
     * @return
     * @throws ParseException
     */

    @PostMapping("create")
    public ResponseEntity<Member> createMember() throws ParseException{

        Member member = Member.builder()
                .id(3L)
                .name("test")
                .build();

        Member savedMember = memberservice.createMember(member);

        return new ResponseEntity<>(savedMember, HttpStatus.OK);
    }





}
