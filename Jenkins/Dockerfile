# syntax=docker/dockerfile:1

FROM maven:3.9.9-ibm-semeru-21-jammy

# ENV MAVEN_HOME=/usr/share/maven
# RUN /bin/sh -c ln -s ${MAVEN_HOME}/bin/mvn /usr/bin/mvn
# ARG MAVEN_VERSION=3.9.9
# ARG USER_HOME_DIR=/root
# ENV MAVEN_CONFIG=/root/.m2
ENTRYPOINT ["/usr/local/bin/mvn-entrypoint.sh"]
CMD ["mvn"]

ARG user=jenkins
ARG group=jenkins
ARG uid=111
ARG gid=113
ARG JENKINS_HOME=/var/lib/jenkins

RUN groupadd --gid $gid $user \
    && useradd --uid $uid --gid $gid -m $user

USER jenkins