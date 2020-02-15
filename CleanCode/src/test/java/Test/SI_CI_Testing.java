package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Presentation_Layer.SimpleIntrest_CompoundIntrest;
import org.junit.Test;
public class SI_CI_Testing {
		SimpleIntrest_CompoundIntrest obj=new SimpleIntrest_CompoundIntrest();
		
		@SuppressWarnings("deprecation")
		@Test
		public void test() {
			assertEquals(76,obj.Compound_Interest(400,6,3));
		assertEquals(158,obj.Compound_Interest(1000,5,3));
			assertEquals(75,obj.Simple_Interest(250,6,5));
			assertEquals(150,obj.Simple_Interest(1000,5,3));
			assertEquals(270,obj.Simple_Interest(900,5,6));
		}

}
