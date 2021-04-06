import org.testng.Assert;
import org.testng.annotations.Test;

public class PeginationHelperUnitTest {
	
	
	@Test
	public void test() {
	
		PaginationHelper helper =new  PaginationHelper(new Object[]{'a','b','c','d','e','f'}, 4);
		
		Assert.assertEquals(helper.pageCount(), 2);	; // should == 2
		Assert.assertEquals(helper.itemCount(),6); // should == 6
		Assert.assertEquals(helper.pageItemCount(0),4); // should == 4
		Assert.assertEquals(helper.pageItemCount(1),2); // last page - should == 2
		Assert.assertEquals(helper.pageItemCount(2),-1);	 // should == -1 since the page is invalid
			// page_index takes an item index and returns the page that it belongs on
		Assert.assertEquals(helper.pageIndex(5),1) ;// should == 1 (zero based index)
		Assert.assertEquals(helper.pageIndex(2),0); // should == 0
		Assert.assertEquals(helper.pageIndex(20),-1); // should == -1
		Assert.assertEquals(helper.pageIndex(-10),-1); 

}
}