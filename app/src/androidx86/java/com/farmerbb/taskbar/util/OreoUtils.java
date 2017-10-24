/* Copyright 2017 Braden Farmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farmerbb.taskbar.util;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

public class OreoUtils {

    private OreoUtils() {}

    static int TYPE_APPLICATION_OVERLAY = 2038;
    public static String ACTION_APP_NOTIFICATION_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
    public static String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";

    public static void pinAppShortcut(Context context) {}

    @SuppressWarnings("deprecation")
    public static NotificationCompat.Builder getNotificationBuilder(Context context) {
        return new NotificationCompat.Builder(context);
    }

    public static void startForegroundService(Context context, Intent intent) {
        context.startService(intent);
    }
}
