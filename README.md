# Fitbit-DND-Notification-Fix
Fix for notifications not being sent to your Fitbit device when Do Not Disturb mode is enabled.  

## What?
This is an Xposed module that spoofs the response of the Fitbit app's Do Not Disturb checks, so that you will always get notifications on your Fitbit.

## How?
Install Xposed and then install the most recent release [here](https://github.com/CompletelyGeneric/Fitbit-DND-Notification-Fix/releases/latest).  

## Why?
By default, the Fitbit Android app won't push notifications to your Fitbit if DND is enabled, which means that on AOSP, you can't get notifications unless your phone is set to *at least* vibrate.  
This doesn't make sense to me, because I don't need my phone to vibrate if my Fitbit does. Most Fitbit devices also have their own DND mode, so I don't see why you wouldn't just use that if your device has one. (sorry Alta HR!).  

## It doesn't work
Your bluetooth stack is probably awful then.  Most Android devices seriously mangle bluetooth.


## Disclaimer
This isn't made/endorsed/owned by Fitbit in any way. 

