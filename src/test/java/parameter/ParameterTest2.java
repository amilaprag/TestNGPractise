package parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest2 {
    @Test
    @Parameters({"val1","val2"})
    public void Add(int v1,int v2){
        int findDiff=v1+v2;
        System.out.println("the summary is "+findDiff);
    }

    @Test
    @Parameters({"val1","val2"})
    public void Add1(@Optional("45") int v1,@Optional("55")  int v2){
        int findDiff=v1+v2;
        System.out.println("the summary is "+findDiff);
    }

}
