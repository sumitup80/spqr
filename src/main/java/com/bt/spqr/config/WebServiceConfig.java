package com.bt.spqr.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

  @Bean
  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
    MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
    messageDispatcherServlet.setApplicationContext(context);
    messageDispatcherServlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
  }
  
  @Bean(name = "nbiservice")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema nbiSchema) {
    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
    definition.setPortTypeName("nbiResponsePort");
    definition.setTargetNamespace("http://generated.soap.spqr.bt.com");
    definition.setLocationUri("/ws");
    definition.setSchema(nbiSchema);
    return definition;
  }

  @Bean
  public XsdSchema nbiSchema() {
    return new SimpleXsdSchema(new ClassPathResource("xsd/nbi-details.xsd"));
  }
}