package pl.harpi.janus;

import java.time.ZoneId;
import java.util.TimeZone;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.harpi.lib.core.infrastructure.Profiles;

@SpringBootApplication
class JanusApplication {
  public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Europe/Warsaw")));

    val application = new SpringApplication(JanusApplication.class);
    application.setAdditionalProfiles(Profiles.JPA);
    application.run(args);
  }
}
