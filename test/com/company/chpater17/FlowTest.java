package com.company.chpater17;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;

import org.junit.jupiter.api.Test;

import com.company.chapter17.TempInfo;
import com.company.chapter17.TempSubscriber;
import com.company.chapter17.TempSubscription;

class FlowTest {

    @Test
    void subscribeTest() {
        // given
        // when
        // then
        getTemperatures("New York").subscribe(new TempSubscriber());
    }

    private static Publisher<TempInfo> getTemperatures(String town) {
        return subscriber -> subscriber.onSubscribe(
                new TempSubscription(subscriber, town)
        );
    }
}
