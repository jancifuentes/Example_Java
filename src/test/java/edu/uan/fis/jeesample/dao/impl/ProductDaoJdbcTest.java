package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Product;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class ProductDaoJdbcTest extends TestCase {
    
    public ProductDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create");
        Product product = new Product();
        product.setProductId(1);
        product.setName("Monitor");
        product.setPrecio(75000);
        
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = product;
        Product result = instance.create(product);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Product product = new Product(9,"MOUSE",12500);
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = product;
        Product result = instance.update(product);       
        assertEquals(expResult, result);  
            
    }

    public void testDelete() {
        System.out.println("delete");
        Product product = new Product(6);
        product.getProductId();
        ProductDaoJdbc instance = new ProductDaoJdbc();
        instance.delete(product);    
    }

    public void testFindById() {
        System.out.println("findById");
        Integer productId = 4;
        ProductDaoJdbc instance = new ProductDaoJdbc();
        Product expResult = null;
        Product result = instance.findById(productId);
        assertEquals(expResult, result);
        
        
    }

    public void testFindAll() {
        System.out.println("findAll");
        ProductDaoJdbc instance = new ProductDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
       
    }
}
