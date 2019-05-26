package org.smart4j.tory.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.toyr.helper.DatabaseHelper;
import org.smart4j.toyr.model.Customer;
import org.smart4j.toyr.service.CustomerService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author unisk1123
 * @Description CustomerSeriver 单元测试
 * @create 2019/5/26
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() throws Exception {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13512345670");
        boolean customer = customerService.createCustomer(fieldMap);
        Assert.assertTrue(customer);
    }

    @Test
    public void upateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
