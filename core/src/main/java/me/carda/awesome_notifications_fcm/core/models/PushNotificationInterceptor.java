package me.carda.awesome_notifications_fcm.core.models;

import com.google.firebase.messaging.RemoteMessage;

public interface PushNotificationInterceptor {
    RemoteMessage intercept(RemoteMessage message);
}
