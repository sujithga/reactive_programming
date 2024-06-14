package org.sujith.subscriber;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriberImpl implements Subscriber<String> {

    private final static Logger log = LoggerFactory.getLogger(SubscriberImpl.class);

    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    @Override
    public void onSubscribe(Subscription s) {
        this.subscription = s;

    }

    @Override
    public void onNext(String s) {
        System.out.printf( "Received email %s \n",s);

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {

    }
}
