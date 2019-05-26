package org.smart4j.toyr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.toyr.helper.DatabaseHelper;
import org.smart4j.toyr.model.Customer;
import org.smart4j.toyr.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author unisk1123
 * @Description 提供客户数据服务
 * @create 2019/5/26
 */
public class CustomerService {



    /**
     *  提供客户数据服务
     * @return
     */
    public List<Customer> getCustomerList() {
        Connection conn = DatabaseHelper.getConnection();
        try {
            String sql = "SELECT * FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class, conn, sql);
        } finally {
            DatabaseHelper.closeConnection(conn);
        }

    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        // TODO
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        // TODO
        return false;
    }
}
