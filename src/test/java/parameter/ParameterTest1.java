package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {

    @Test
    @Parameters({"val1","val2"})
    public void Diff(int v1,int v2){
        int findDiff=v1-v2;
        System.out.println("the diffrence is "+findDiff);
    }

}
