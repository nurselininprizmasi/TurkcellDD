package com.training.turkcell.structure.tests.facede;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.CustomerDAO;
import com.training.turkcell.structure.tests.CustomerProvisionWs;
import com.training.turkcell.structure.tests.Lib1;

public class CustomerProvisionFacade implements ICustomerProvision{

    CustomerProvisionWs provisionWs = new CustomerProvisionWs();
    CustomerDAO customerDAO = new CustomerDAO();
    Lib1 lib1 = new Lib1();

    public void createCustomer(final Customer customer){
        if(this.provisionWs.add(customer)){
            customerDAO.add(customer);
            lib1.doSomething();
        }
        //IPrintSystem printSystem = PrintSystemFactory
        //printSystem.print(customer);
    }
}
