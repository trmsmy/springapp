#!/bin/sh
PORT="7002"
OPTARG="9878"
GOALS="compile war:inplace tomcat:run -Dmaven.test.skip=true"
OPTIONS="-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8086 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"
MAVEN_OPTS="${MAVEN_OPTS} -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=${OPTARG},server=y,suspend=n"
MAVEN_OPTS="${MAVEN_OPTS} -Xmx1024m"
export MAVEN_OPTS
OPTIONS="${OPTIONS} -Dmaven.tomcat.port=${PORT} -Dlog4j.configuration=file:${basedir}src/test/resources/log4j.xml -Ptomcat "

mvn ${OPTIONS} ${GOALS}