# 基础镜像
FROM openjdk:17-jdk-slim

# 拷贝打包好的 jar
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# 启动命令
ENTRYPOINT ["java", "-jar", "/app.jar"]
