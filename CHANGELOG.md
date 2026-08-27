# Changelog

## [0.12.1] - 2026-08-27
### Fixed
- **Debug Toast and Log removed from `BootBroadcastReceiver`:** every device boot showed a leftover `"Service restarted"` toast (and logged `"Service tried to stop"`) to every end user of apps shipping `awesome_notifications_fcm`. Both debug statements were removed. Thanks to @igordanilovski (#1).

### Updated
- **Native library updated:** AndroidAwnCore updated to 0.12.1.
- **Published artifacts now match the source:** the 0.12.0 artifact on Maven Central was built before the SDK 36/dependency updates were merged; 0.12.1 ships the current source state (compileSdk/targetSdk 36, updated dependencies).

## [0.12.0] - 2026-06-15
### Changed
- **Publishing migrated to Maven Central:** `me.carda:AndroidAwnFcmCore` is now published on Maven Central (via the vanniktech maven-publish plugin) instead of JitPack; the artifactId was corrected from `AwnFcmAndroidCore` to `AndroidAwnFcmCore`.
- **Native library updated:** AndroidAwnCore updated to 0.12.0 (also on Maven Central).

## [0.11.0] - 2025-02-13
### Breaking changes
- **License key validation removed:** The `LicenseManager`, `Crypto`, and `Encoder` classes have been completely removed. The `licenseKeys` parameter was removed from `AwesomeNotificationsFcm.initialize()` and `FcmDefaultsManager.saveDefault()`. Notifications are no longer watermarked with `[DEMO]` prefix on release builds.
- **Build system updated:** AGP 8.1.1 → 8.13.1, Gradle 8.10 → 8.13, compileSdk/targetSdk 34 → 36, dependencies updated (guava 33.5.0, annotation 1.9.1).

### Updated
- **Native library updated:** AndroidAwnCore updated to 0.11.0.
- **Dependencies updated:** play-services-base 18.5.0 → 18.10.0, guava 32.1.3 → 33.5.0, appcompat 1.7.1, material 1.13.0, annotation 1.9.1.

### Fixed
- **Conflicting `compileSdk 36`:** Removed duplicate `compileSdk` inside `defaultConfig` that shadowed the root-level `compileSdkVersion = 36`.
