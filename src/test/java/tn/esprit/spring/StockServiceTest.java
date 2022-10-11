package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.services.IStockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceTest {
	@Autowired
	IStockService stockService; 
	
	@Test
	public void testSaveStock(){
		
		Stock s= stockService.saveStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
		assertNotNull(s);

	}
	/*
	@Test
	public void testDeletetock(){
		
		Stock s= stockService.saveStock(Stock.builder().libelleStock("stock test").qte(100).qteMin(10).build());
	    stockService.deleteStock(s.getIdStock());
		assertNull(s);

	}
	*/
}
