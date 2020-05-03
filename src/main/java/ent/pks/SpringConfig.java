package ent.pks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ent.pks")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}