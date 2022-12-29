package observer._03_java;

import java.util.concurrent.Flow;

public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new Flow.Publisher<>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("디자인패턴");
                subscriber.onNext("옵저버 패턴");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                subscription.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("완료");
            }
        };

        publisher.subscribe(subscriber);
    }
}
