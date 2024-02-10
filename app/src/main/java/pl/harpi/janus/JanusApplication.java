package pl.harpi.janus;

import java.time.ZoneId;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class JanusApplication {
  public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Europe/Warsaw")));
    SpringApplication.run(JanusApplication.class, args);
  }
}
