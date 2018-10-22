package hackathon2018.multiplayerlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class MultiplayerLifeApplication {

  public static void main(final String[] args) {
    SpringApplication.run(MultiplayerLifeApplication.class, args);
  }

  @Bean
  public ResourceBundleMessageSource messageSource() {
      final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
      messageSource.setBasename("messages");
      return messageSource;
  }

}
