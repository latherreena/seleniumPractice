package TestCase;



import Endpoints.userEndpointsExternalFile;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestPostUsingExternalJsonFile {

@Test(priority = 1)
public void postUsingJsonExternalFile() throws FileNotFoundException {
    userEndpointsExternalFile.postUsingExternalJsonFile();

    }
}