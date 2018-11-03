package io.mattis.lunchclub;


import io.mattis.lunchclub.domain.Member;
import io.mattis.lunchclub.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/**
 * @author Mathias Bjerke
 */
@Component
public class DemoData implements ApplicationRunner {
	private final MemberRepository memberRepository;


	@Autowired
	public DemoData( MemberRepository memberRepository ) {
		this.memberRepository = memberRepository;
	}


	@Override
	public void run( ApplicationArguments args ) throws Exception {
		memberRepository.save( new Member("Mathias Bjerke", "mathias@verida.no", "11111111") );
		memberRepository.save( new Member("Trygve Laustøl", "trygvis@inamo.no", "22222222") );
		memberRepository.save( new Member("Geir Ståle Kleppe", "geirstaale.kleppe@getmail.no", "33333333") );
		memberRepository.save( new Member("Jens Christian Brynildsen", "jenschr@gmail.com", "444444444") );
		memberRepository.save( new Member("Torfinn Ingolfsen", "tingox@gmail.com", "555555555") );
	}
}
