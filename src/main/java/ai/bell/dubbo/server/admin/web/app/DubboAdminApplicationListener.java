package ai.bell.dubbo.server.admin.web.app;

import ai.bell.dubbo.server.admin.common.zookeeper.ZkClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * @author Mabowen
 * @date 2020-07-01 12:48
 */
@Service
public class DubboAdminApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private ZkClient zkClient;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        zkClient.buildZookeeperClient();
    }
}
