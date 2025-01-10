package parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter3 {


    @Test( dataProvider = "getData")
    public void loginTest(String name,String password){
        System.out.println(name+" "+password);
    }

    @DataProvider
    public Object[][] getData(){
        Object [] [] data = {
                {"abc@gmail.com","abc123"},{"def@gmail.com","abc123"}
        };
        return  data;
    }


}
