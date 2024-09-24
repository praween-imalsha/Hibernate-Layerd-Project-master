package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.CustomerBO;
import lk.ijse.dao.custom.CustomerDAO;
import lk.ijse.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.dto.CustomerDto;
import lk.ijse.entity.Customer;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public boolean save(CustomerDto customerDto) {
       return customerDAO.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getTel(),customerDto.getEmail()));
    }

    @Override
    public boolean update(CustomerDto customerDto) {

        return customerDAO.update(new Customer(customerDto.getName(), customerDto.getAddress(), customerDto.getEmail(), customerDto.getTel(), customerDto.getId()));
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public CustomerDto get(String value) {
        return null;
    }
}
