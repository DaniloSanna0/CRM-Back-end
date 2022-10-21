package CRM;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import CRM.entity.Clienti;
import CRM.repository.ClientiRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class CrmApplicationTests {

	@Autowired
	ClientiRepository rep;
	
	@Test
	void contextLoads() {
		Clienti c = new Clienti();
		c.setCognome("ciao");
		c.setNome("cddso");
		c.setEmail("dsdf");
		c.setCognome("ciao");
		rep.save(c);
	}

}
