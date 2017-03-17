package com.overlord.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lidongdong on 2017/3/7.
 */
@RestController
public class SentenceService {

   /* @Autowired
    DiscoveryClient client;*/

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("/sentence")
    public String getSentence() {
        return
                getWord("words-service") + " "
                        + getWord("words-service-verb") + " "
                        + getWord("words-service-article") + " "
                        + getWord("words-service-adjective") + " "
                        + getWord("sentence-eureka-client-noun") + ".";
    }

    private String getWord(String service) {
        ServiceInstance serviceInstance = loadBalancerClient.choose(service);
        return serviceInstance != null ? (new RestTemplate()).getForObject(serviceInstance.getUri(), String.class) : " ";
    }
    /*private String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }*/
}
