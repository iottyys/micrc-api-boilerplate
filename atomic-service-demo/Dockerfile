FROM openjdk:8-jre-alpine

RUN addgroup -S demo && adduser -S demo -G demo
USER demo:demo
COPY dependency/BOOT-INF/lib /app/lib
COPY dependency/META-INF /app/META-INF
COPY dependency/BOOT-INF/classes /app
ENTRYPOINT ["java","-noverify","-XX:TieredStopAtLevel=1","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-Dspring.backgroundpreinitializer.ignore=true","-cp", "app:app/lib/*","info.ttyy.frame.atomicservicedemo.AtomicServiceDemoApplication"]
