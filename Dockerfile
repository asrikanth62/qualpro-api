# Dockerfile (runtime-only)
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
# Add the AI Java agent
#ADD https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.5.4/applicationinsights-agent-3.5.4.jar /opt/ai/ai.jar

# Set the agent at runtime
#ENV JAVA_TOOL_OPTIONS="-javaagent:/opt/ai/ai.jar ${JAVA_TOOL_OPTIONS}"