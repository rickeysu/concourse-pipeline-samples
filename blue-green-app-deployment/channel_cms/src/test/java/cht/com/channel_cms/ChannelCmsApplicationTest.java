package cht.com.channel_cms;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import cht.com.cms.ChannelCmsApplication;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChannelCmsApplication.class)
public class ChannelCmsApplicationTest {
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Test
	public void test_max_1_2_3() {
		assertEquals(3, ChannelCmsApplication.max(1, 2, 3));
	}

	@Test
	public void test_max_1_3_2() {
		assertEquals(3, ChannelCmsApplication.max(1, 3, 2));
	}

	@Test
	public void test_max_3_2_1() {
		assertEquals(3, ChannelCmsApplication.max(3, 2, 1));
	}

	@Test
	public void test_max_2_1_3() {
		assertEquals(3, ChannelCmsApplication.max(2, 1, 3));
	}

	MockMvc mvc; // 創建MockMvc類的物件

	@Before
	public void setup() {
//		Memberaccount memberaccount = new Memberaccount();
//		memberaccount.setId(1);
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() throws Exception {
		String uri = "";
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
		int status = result.getResponse().getStatus();
		System.out.println(status);
		Assert.assertEquals("錯誤", 200, status);
	}

	@Test
	public void main() {
		ChannelCmsApplication.main(new String[] {});
	}

}
