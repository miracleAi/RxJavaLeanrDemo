package com.example.zhulinping.rxjavalearndemo.operator.utils;


import rx.Observable;
import rx.Subscriber;

/**
 * Created by zhulinping on 17/6/8.
 */

public class CreateUtils {
    /**
     * creare 从头开始创建一个Observable，给这个操作符传递一个接受观察者作为参数的函数，
     * 编写这个函数让它的行为表现为一个Observable--恰当的调用观察者的onNext，onError和onCompleted方法。
     * create 方法默认不在任何调度器上执行
     * */
    public static void create(){
        Observable.create(new Observable.OnSubscribe<Integer>(){

            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if(!subscriber.isUnsubscribed()){
                    for(int i=0;i<5;i++){
                        subscriber.onNext(i);
                    }
                    subscriber.onCompleted();
                }
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.print("create complete!");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.print("create--"+integer);
            }
        });
    }
    /**
     *from 操作符可以转换Future、Iterable和数组。对于Iterable和数组，
     * 产生的Observable会发射Iterable或数组的每一项数据
     *
     * 对于Future，它会发射Future.get()方法返回的单个数据。from方法有一个可接受两个可选参数的版本，
     * 分别指定超时时长和时间单位。如果过了指定的时长Future还没有返回一个值，这个Observable会发射错误通知并终止。
     *
     * from默认不在任何特定的调度器上执行。然而你可以将Scheduler作为可选的第二个参数传递给Observable，
     * 它会在那个调度器上管理这个Future。
     * */
    public static void from(){
        Integer[] items = {1,2,3,4,5};
        Observable.from(items).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.print("from complete!");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.print("from"+integer);
            }
        });
    }
    /**
     * just 它接受一至九个参数，返回一个按参数列表顺序发射这些数据的Observable
     * */
    public static void just(){
        Observable.just(1,2,3,4,5).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.print("just complete");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.print("just"+integer);
            }
        });
    }
    /**
     * Defer操作符会一直等待直到有观察者订阅它，然后它使用Observable工厂方法生成一个Observable。
     * 它对每个观察者都这样做，因此尽管每个订阅者都以为自己订阅的是同一个Observable，
     * 事实上每个订阅者获取的是它们自己的单独的数据序列。
     * */

    /**
     * Empty
     * 创建一个不发射任何数据但是正常终止的Observable
     * Never
     * 创建一个不发射数据也不终止的Observable
     * Throw
     * 创建一个不发射数据以一个错误终止的Observable
     * */
    /**
     * Interval操作符返回一个Observable，它按固定的时间间隔发射一个无限递增的整数序列。
     * */
    /**
     * range 它接受两个参数，一个是范围的起始值，一个是范围的数据的数目。如果你将第二个参数设为0，
     * 将导致Observable不发射任何数据（如果设置为负数，会抛异常）
     * */
}
