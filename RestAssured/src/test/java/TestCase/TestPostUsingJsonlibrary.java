package TestCase;

import Endpoints.userEndpointsusingJSONLibrary;
import org.testng.annotations.Test;

public class TestPostUsingJsonlibrary
{

@Test(priority = 1)
    public void postUsingJsonLibrary()
{
    userEndpointsusingJSONLibrary.postUserList();
}


}
