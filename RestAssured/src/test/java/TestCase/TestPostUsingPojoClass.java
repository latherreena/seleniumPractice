package TestCase;

import Endpoints.userEndpointsUsingPojoClass;
import org.testng.annotations.Test;

public class TestPostUsingPojoClass {



    @Test(priority = 1)
    void GetUserList()
    {
    userEndpointsUsingPojoClass.getUserList();
    }

    @Test(priority = 2)
    void postUserList()
    {
        userEndpointsUsingPojoClass.postUserList();
    }

    @Test(priority = 3)
    void UpdateUserList()
    {
        userEndpointsUsingPojoClass.updateUserList();
    }
    @Test(priority = 4)
    void deleteUserList()
    {
        userEndpointsUsingPojoClass.deleteUserList();
    }

}
