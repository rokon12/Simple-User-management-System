package com.iit.univdhaka.iis.domain.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({})
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" }, inheritLocations = true)
public abstract class AbstractTest extends AbstractJUnit4SpringContextTests {

}
