package cn.speedyframework.cloud.infra.eureka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

/**
 * desc
 * date
 */
@Configuration
@Slf4j
public class EurekaEventListener {

    @EventListener
    public void listenCanceledEvent(EurekaInstanceCanceledEvent event) {
        log.info("服务下线：{} - {}", event.getAppName(), event.getServerId());
    }
}
