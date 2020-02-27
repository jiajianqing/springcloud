package jia.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JiaRule {
    @Bean
    public IRule myRule() {
        // 默认是轮询，现在是自定义
        return new JiaRandomRule();
    }
}
