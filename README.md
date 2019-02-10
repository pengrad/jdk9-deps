### Build Android and Dagger with JDK9+

A compile-only dependency to fix building Android projects with Dagger2 and JDK9+  
https://github.com/google/dagger/issues/1339  
```
package javax.annotation.processing does not exist
import javax.annotation.processing.Generated;
```

### Usage
```groovy
dependencies {
    compileOnly 'com.github.pengrad:jdk9-deps:1.0'
}
```
