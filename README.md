# GKM-2
An event based, Global Keyboard and Mouse listener.

Tested on Windows 7, but should work on Linux and Mac OS X as well (untested).

This project is inspired from https://github.com/tomzx/gkm-java

## Build

Make sure you have [Apache Ant](http://ant.apache.org/) in your PATH

```bash
  ant
```

## Run

```bash
  # Track keyboard only
  ./run.sh
  # Track keyboard and mouse
  ./run.sh --mouse
```

![image](https://cloud.githubusercontent.com/assets/4214509/20423149/4bcfc060-ada1-11e6-9765-16e3ebd5a5e5.png)

## Requirements
GKM-Java depends on [JNativeHook](https://code.google.com/p/jnativehook/), which runs on Java. Thus you will need to have a JVM available and more importantly, java availble on your PATH.

## License
The code is licensed under the MIT license (http://opensource.org/licenses/MIT). See license.txt.
