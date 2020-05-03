package ent.pks;

import org.springframework.context.annotation.*;

import java.util.Arrays;

@Configuration
@ComponentScan("ent.pks")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(Arrays.asList(rockMusic(), popMusic(), classicalMusic()));
    }
}