package es.lavanda.lib.common.config;

// import com.amazonaws.services.sns.AmazonSNS;
// import com.amazonaws.services.sns.AmazonSNSAsync;
// import com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder;
// import com.amazonaws.services.sqs.AmazonSQSAsync;
// import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
// import org.springframework.cloud.aws.messaging.config.SimpleMessageListenerContainerFactory;
// import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
// import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
// import org.springframework.cloud.aws.messaging.listener.QueueMessageHandler;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
public class AwsConfig {

	// @Value("${cloud.aws.region.static:eu-west-1}")
	// private String awsRegion;

	// @Bean
	// @ConditionalOnProperty(name = "cloud.aws.sns.enabled", havingValue = "true")
	// public NotificationMessagingTemplate notificationMessagingTemplate(AmazonSNS amazonSNS) {
	// 	return new NotificationMessagingTemplate(amazonSNSAsync());
	// }

	// @Bean
	// @ConditionalOnProperty(name = "cloud.aws.sqs.enabled", havingValue = "true")
	// public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
	// 	return new QueueMessagingTemplate(amazonSQSAsync());
	// }

	// @Bean
	// @ConditionalOnProperty(name = "cloud.aws.sqs.listener.enabled", havingValue = "true")
	// public SimpleMessageListenerContainerFactory simpleMessageListenerContainerFactory() {
	// 	SimpleMessageListenerContainerFactory factory = new SimpleMessageListenerContainerFactory();
	// 	factory.setAmazonSqs(amazonSQSAsync());
	// 	factory.setMaxNumberOfMessages(1);
	// 	factory.setQueueMessageHandler(new QueueMessageHandler());
	// 	factory.setWaitTimeOut(20);
	// 	return factory;
	// }

	// private AmazonSQSAsync amazonSQSAsync() {
	// 	return AmazonSQSAsyncClientBuilder.standard().withRegion(awsRegion).build();
	// }

	// private AmazonSNSAsync amazonSNSAsync() {
	// 	return AmazonSNSAsyncClientBuilder.standard().withRegion(awsRegion).build();
	// }
}
