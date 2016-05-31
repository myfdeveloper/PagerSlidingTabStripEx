# PagerSlidingTabStripEx
extend PagerSlidingTabStrip  
[参考](https://github.com/astuetz/PagerSlidingTabStrip)
# Usage
Step 1. Add the JitPack repository to your build file

gradle

Add it in your root build.gradle at the end of repositories:
```	
buildscript {
		...
	    dependencies {
	        ...
	        classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'
	    }
	}
```

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.myfdeveloper:PagerSlidingTabStripEx:v0.1'
	}
# additional Customization
- ```pstsTextColor``` color of tab text
- ```pstsTextSize``` size of tab text
- ```pstsTextSelectColor``` color of current tab text
