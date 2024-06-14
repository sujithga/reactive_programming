package org.sujith.publisher;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.sujith.subscription.SubscriptionImpl;

public class PublisherImpl implements Publisher<String> {
    @Override
    public void subscribe(Subscriber<? super String> s) {
        Subscription subscription = new SubscriptionImpl( s);
        s.onSubscribe(subscription);
    }
}
