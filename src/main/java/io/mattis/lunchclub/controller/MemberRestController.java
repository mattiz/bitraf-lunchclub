package io.mattis.lunchclub.controller;


import io.mattis.lunchclub.domain.Member;
import io.mattis.lunchclub.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * @author Mathias Bjerke
 */
@RestController
@RequestMapping( value = "/member" )
public class MemberRestController {
	final MemberRepository memberRepository;


	@Autowired
	public MemberRestController( MemberRepository memberRepository ) {
		this.memberRepository = memberRepository;
	}


	@RequestMapping( method = RequestMethod.GET )
	@ResponseStatus( HttpStatus.CREATED )
	public List<Member> all() {
		return memberRepository.findAll();
	}

}