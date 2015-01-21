# realm-lib-app-failure
Project that demonstrates DEX failure when using Realm.io in both an app and a dependent library. This is realm-java enhancement request [#511](https://github.com/realm/realm-java/issues/511).

```
C:\Users\Ben\workspaces\realm-lib-app-failure>gradlew clean build
:app:clean
:lib:clean
:app:preBuild
:app:compileDebugNdk
:app:preDebugBuild
:app:checkDebugManifest
:app:preReleaseBuild
:lib:compileLint
:lib:copyReleaseLint UP-TO-DATE
:lib:mergeReleaseProguardFiles UP-TO-DATE
:lib:preBuild
:lib:preReleaseBuild
:lib:checkReleaseManifest
:lib:prepareReleaseDependencies
:lib:compileReleaseAidl
:lib:compileReleaseRenderscript
:lib:generateReleaseBuildConfig
:lib:generateReleaseAssets UP-TO-DATE
:lib:mergeReleaseAssets
:lib:generateReleaseResValues UP-TO-DATE
:lib:generateReleaseResources
:lib:packageReleaseResources
:lib:processReleaseManifest
:lib:processReleaseResources
:lib:generateReleaseSources
:lib:compileReleaseJava
Note: Processing class LibraryRealmObject
:lib:processReleaseJavaRes UP-TO-DATE
:lib:packageReleaseJar
:lib:compileReleaseNdk
:lib:packageReleaseJniLibs UP-TO-DATE
:lib:packageReleaseLocalJar UP-TO-DATE
:lib:packageReleaseRenderscript UP-TO-DATE
:lib:bundleRelease
:app:prepareRealmLibAppFailureLibUnspecifiedLibrary
:app:prepareDebugDependencies
:app:compileDebugAidl
:app:compileDebugRenderscript
:app:generateDebugBuildConfig
:app:generateDebugAssets UP-TO-DATE
:app:mergeDebugAssets
:app:generateDebugResValues UP-TO-DATE
:app:generateDebugResources
:app:mergeDebugResources
:app:processDebugManifest
:app:processDebugResources
:app:generateDebugSources
:app:compileDebugJava
Note: Processing class AppRealmObject
:app:preDexDebug
:app:dexDebug

UNEXPECTED TOP-LEVEL EXCEPTION:
com.android.dex.DexException: Multiple dex files define Lio/realm/ValidationList;
        at com.android.dx.merge.DexMerger.readSortableTypes(DexMerger.java:596)
        at com.android.dx.merge.DexMerger.getSortedTypes(DexMerger.java:554)
        at com.android.dx.merge.DexMerger.mergeClassDefs(DexMerger.java:535)
        at com.android.dx.merge.DexMerger.mergeDexes(DexMerger.java:171)
        at com.android.dx.merge.DexMerger.merge(DexMerger.java:189)
        at com.android.dx.command.dexer.Main.mergeLibraryDexBuffers(Main.java:454)
        at com.android.dx.command.dexer.Main.runMonoDex(Main.java:303)
        at com.android.dx.command.dexer.Main.run(Main.java:246)
        at com.android.dx.command.dexer.Main.main(Main.java:215)
        at com.android.dx.command.Main.main(Main.java:106)

:app:dexDebug FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:dexDebug'.
> com.android.ide.common.internal.LoggedErrorException: Failed to run command:
        C:\Users\Ben\AppData\Local\Android\android-sdk\build-tools\21.1.2\dx.bat --dex --output C:\Users\Ben\workspaces\realm-lib-app-failure\app\build\intermediates\dex\debug --input-list=C:\Users\Ben\workspaces\realm-lib-app-failure\app\build\intermediates\tmp\dex\debug\inputList.txt
Error Code:
        2
Output:

        UNEXPECTED TOP-LEVEL EXCEPTION:
        com.android.dex.DexException: Multiple dex files define Lio/realm/ValidationList;
                at com.android.dx.merge.DexMerger.readSortableTypes(DexMerger.java:596)
                at com.android.dx.merge.DexMerger.getSortedTypes(DexMerger.java:554)
                at com.android.dx.merge.DexMerger.mergeClassDefs(DexMerger.java:535)
                at com.android.dx.merge.DexMerger.mergeDexes(DexMerger.java:171)
                at com.android.dx.merge.DexMerger.merge(DexMerger.java:189)
                at com.android.dx.command.dexer.Main.mergeLibraryDexBuffers(Main.java:454)
                at com.android.dx.command.dexer.Main.runMonoDex(Main.java:303)
                at com.android.dx.command.dexer.Main.run(Main.java:246)
                at com.android.dx.command.dexer.Main.main(Main.java:215)
                at com.android.dx.command.Main.main(Main.java:106)



* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 9.093 secs
```
