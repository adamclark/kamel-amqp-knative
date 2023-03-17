// camel-k: language=java
// camel-k: dependency=mvn:org.amqphub.quarkus:quarkus-qpid-jms

import org.apache.camel.builder.RouteBuilder;

public class KamelAMQPToKnative extends RouteBuilder {
  
  @Override
  public void configure() throws Exception {

      from("jms:queue:testAddress1")
          .to("knative:endpoint/event-display-1");

      from("jms:queue:testAddress2")
          .to("knative:endpoint/event-display-2");
  }
}