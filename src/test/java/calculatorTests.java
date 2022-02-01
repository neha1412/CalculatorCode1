
import org.testng.Assert;
import org.testng.annotations.Test;

public class calculatorTests {

    @Test
    public void toGetsum(){

        int sum = new calculatorCode().getSum(10, 40);
        Assert.assertEquals(sum, 50);



    }

    @Test
    public void toGetProduct(){
        int product = new calculatorCode().getProduct(2, 30);
        Assert.assertEquals(product, 60);

    }


}

