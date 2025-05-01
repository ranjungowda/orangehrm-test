package com.orangehrm.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test (priority=1,invocationCount=3)
public void CreateCustomer() {
	Reporter.log("create customer",true);;
}
@Test (priority=2,dependsOnMethods="CreateCustomer")
public void ModifyCustomer() {
	Reporter.log("modify customer",true);
}
@Test (priority=3,dependsOnMethods={"CreateCustomer","ModifyCustomer"})
public void DeleteCustomer() {
	Reporter.log("delete customer",true);
}

}
