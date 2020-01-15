
# Created by https://www.gitignore.io/api/macos,android,androidstudio
# Edit at https://www.gitignore.io/?templates=macos,android,androidstudio

### Android ###
# Built application files
*.apk
*.ap_
*.aab

# Files for the ART/Dalvik VM
*.dex

# Java class files
*.class

# Generated files
bin/
gen/
out/
release/

# Gradle files
.gradle/
build/

# Local configuration file (sdk path, etc)
local.properties

# Proguard folder generated by Eclipse
proguard/

# Log Files
*.log

# Android Studio Navigation editor temp files
.navigation/

# Android Studio captures folder
captures/

# IntelliJ
*.iml
.idea/workspace.xml
.idea/tasks.xml
.idea/gradle.xml
.idea/assetWizardSettings.xml
.idea/dictionaries
.idea/libraries
# Android Studio 3 in .gitignore file.
.idea/caches
.idea/modules.xml
# Comment next line if keeping position of elements in Navigation Editor is relevant for you
.idea/navEditor.xml

# Keystore files
# Uncomment the following lines if you do not want to check your keystore files in.
#*.jks
#*.keystore

# External native build folder generated in Android Studio 2.2 and later
.externalNativeBuild

# Google Services (e.g. APIs or Firebase)
# google-services.json

# Freeline
freeline.py
freeline/
freeline_project_description.json

# fastlane
fastlane/report.xml
fastlane/Preview.html
fastlane/screenshots
fastlane/test_output
fastlane/readme.md

# Version control
vcs.xml

# lint
lint/intermediates/
lint/generated/
lint/outputs/
lint/tmp/
# lint/reports/

### Android Patch ###
gen-external-apklibs
output.json

# Replacement of .externalNativeBuild directories introduced
# with Android Studio 3.5.
.cxx/

### macOS ###
# General
.DS_Store
.AppleDouble
.LSOverride

# Icon must end with two \r
Icon

# Thumbnails
._*

# Files that might appear in the root of a volume
.DocumentRevisions-V100
.fseventsd
.Spotlight-V100
.TemporaryItems
.Trashes
.VolumeIcon.icns
.com.apple.timemachine.donotpresent

# Directories potentially created on remote AFP share
.AppleDB
.AppleDesktop
Network Trash Folder
Temporary Items
.apdisk

### AndroidStudio ###
# Covers files to be ignored for android development using Android Studio.

# Built application files

# Files for the ART/Dalvik VM

# Java class files

# Generated files

# Gradle files
.gradle

# Signing files
.signing/

# Local configuration file (sdk path, etc)

# Proguard folder generated by Eclipse

# Log Files

# Android Studio
/*/build/
/*/local.properties
/*/out
/*/*/build
/*/*/production
*.ipr
*~
*.swp

# Android Patch

# External native build folder generated in Android Studio 2.2 and later

# NDK
obj/

# IntelliJ IDEA
*.iws
/out/

# User-specific configurations
.idea/caches/
.idea/libraries/
.idea/shelf/
.idea/.name
.idea/compiler.xml
.idea/copyright/profiles_settings.xml
.idea/encodings.xml
.idea/misc.xml
.idea/scopes/scope_settings.xml
.idea/vcs.xml
.idea/jsLibraryMappings.xml
.idea/datasources.xml
.idea/dataSources.ids
.idea/sqlDataSources.xml
.idea/dynamic.xml
.idea/uiDesigner.xml

# OS-specific files
.DS_Store?
ehthumbs.db
Thumbs.db

# Legacy Eclipse project files
.classpath
.project
.cproject
.settings/

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.war
*.ear

# virtual machine crash logs (Reference: http://www.java.com/en/download/help/error_hotspot.xml)
hs_err_pid*

## Plugin-specific files:

# mpeltonen/sbt-idea plugin
.idea_modules/

# JIRA plugin
atlassian-ide-plugin.xml

# Mongo Explorer plugin
.idea/mongoSettings.xml

# Crashlytics plugin (for Android Studio and IntelliJ)
com_crashlytics_export_strings.xml
crashlytics.properties
crashlytics-build.properties
fabric.properties

### AndroidStudio Patch ###

!/gradle/wrapper/gradle-wrapper.jar

# End of https://www.gitignore.io/api/macos,android,androidstudio