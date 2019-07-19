package com.akkademy;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.akkademy.messages.SetRequest;

import java.util.HashMap;
import java.util.Map;


/**
 * @Classname: app
 * @Date: 7/17/2019 9:24 AM
 * @Author: ZHENGLA
 * @Description:
 */
public class AkkademyDb extends AbstractActor {

    // Props is a configuration object using in creating an Actor; it is immutable, so it is thread-safe and fully shareable.

    protected final LoggingAdapter log = Logging.getLogger(context().system(), this);
    protected final Map<String, Object> map = new HashMap<>();

    // 对消息做出响应
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(SetRequest.class, message -> {
                    log.info("Receive Set request: {}", message);
                    map.put(message.getKey(), message.getValue());
                })
                .matchAny(o -> log.info(" received unknow message: {}",o))
                .build();
    }

    private AkkademyDb() {
    }
}
