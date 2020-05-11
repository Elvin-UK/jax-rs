//package com.company.test;
//
//import com.company.ResumerestapiApplication;
//import com.company.dto.ResponseDTO;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.oauth2.client.test.OAuth2ContextConfiguration;
//import org.springframework.security.oauth2.client.test.RestTemplateHolder;
//import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
//import org.springframework.security.oauth2.common.AuthenticationScheme;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestOperations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {ResumerestapiApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@OAuth2ContextConfiguration(UserRestControllerTest.MyDetails.class)
//public class UserRestControllerTest implements RestTemplateHolder {
//
//    @LocalServerPort
//    private int port;
//
//    public int getPort() {
//        return port;
//    }
//
//    @Autowired
//    private TestRestTemplate restTemplate;//imkan verirki oz restful apime sorgu gonderim
//
//    @Test
//    public void greetingShouldReturnDefaultMessage() throws Exception {
//        String url = "http://localhost:" + port + "/";
//        ResponseDTO resp = this.restTemplate.getForObject(url, ResponseDTO.class);
//        System.out.println(resp);
//
//    }
//
//    @Override
//    public void setRestTemplate(RestOperations restOperations) {
//
//    }
//
//    @Override
//    public RestOperations getRestTemplate() {
//        return null;
//    }
//
//    class MyDetails extends ResourceOwnerPasswordResourceDetails {
//        public MyDetails(final Object obj) {
//            UserRestControllerTest it = (UserRestControllerTest) obj;
//            setAccessTokenUri("http://localhost:" + it.getPort() + "/oauth/token");
//            setClientId("alma");
//            setClientSecret("alma");
//
//            List<String> scopes = new ArrayList<>();
//            scopes.add("read");
//
//            setScope(scopes);
//            setUsername("aaa@gmail.com");
//            setPassword("12345");
//            setClientAuthenticationScheme(AuthenticationScheme.header);
//        }
//    }
//}