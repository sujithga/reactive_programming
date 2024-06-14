package org.sujith.subscription;

import com.github.javafaker.Faker;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriptionImpl implements Subscription {
    private static final Logger log = LoggerFactory.getLogger(SubscriptionImpl.class);
    private Subscriber<? super String> subscriber;


    public SubscriptionImpl(Subscriber<? super String> s) {
        this.subscriber = s;
    }

    @Override
    public void request(long n) {

        for(int i=0; i< n; i++) {
            subscriber.onNext(Faker.instance().internet().emailAddress());
        }

    }

    @Override
    public void cancel() {
        log.info("subscriber has cancelled");
        //this.cancel();
    }
}
