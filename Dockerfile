FROM openjdk:17
ADD target/TestDockerSpringBoot.jar  TestDockerSpringBoot.jar
ENTRYPOINT ["java","-jar", "/TestDockerSpringBoot.jar"]