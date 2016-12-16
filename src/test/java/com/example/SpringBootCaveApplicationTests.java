package com.example;

import java.util.Calendar;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.model.StatusUpdate;
import com.example.model.StatusUpdateDao;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
@Transactional
public class SpringBootCaveApplicationTests {
	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	@Test
	public void contextLoads() {
	StatusUpdate status= new StatusUpdate("This is a test status update");
	
	statusUpdateDao.save(status);
	
	Assert.assertNotNull("not null",status.getId());
	Assert.assertNotNull("not null",status.getAdded());
	
	
	StatusUpdate retrived= statusUpdateDao.findOne(status.getId());
	
	Assert.assertEquals("Matching expected",status, retrived);
	}

	@Test
	public void testFindLatest() {
		
		Calendar calendar = Calendar.getInstance();
		
		StatusUpdate lastStatusUpdate = null;
		
		for(int i=0; i<10; i++) {
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			
			StatusUpdate status = new StatusUpdate("Status update " + i, calendar.getTime());
			
			statusUpdateDao.save(status);
			
			lastStatusUpdate = status;
		}
		
		StatusUpdate retrieved = statusUpdateDao.findFirstByOrderByAddedDesc();
		
		Assert.assertEquals("Latest status update", lastStatusUpdate, retrieved);
	}


}
