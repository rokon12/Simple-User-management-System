package com.iit.univdhaka.iis.domain.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({})
@ContextConfiguration(locations = { "/WEB-INF/web-application-config.xml" }, inheritLocations = true)
public class UserControllerTest {

	// @Autowired
	// private RequestMappingHandlerAdapter handlerAdapter;
	//
	// @Autowired
	// private RequestMappingHandlerMapping handlerMapping;

	public void testUserCreateMethod() {

	}
}
