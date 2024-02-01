package TestCase;
import Endpoints.userEndpoints;
import org.testng.annotations.Test;

public class RestAssuredHTTPMethod {


    @Test(priority = 1)
    void GetUserList()
    {
        userEndpoints.getUserList();
    }

    @Test(priority = 2)
    void postUserList()
    {
            userEndpoints.postUserList();
    }

    @Test(priority = 3)
    void UpdateUserList()
    {
                userEndpoints.updateUserList();
    }
    @Test(priority = 4)
    void deleteUserList()
    {
      userEndpoints .deleteUserList();
    }

}
