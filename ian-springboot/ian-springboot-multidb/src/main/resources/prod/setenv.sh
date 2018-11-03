#!/bin/sh
PRG="$0"
PRGDIR=`dirname "$PRG"`
BASE_HOME=`cd "$PRGDIR/.." >/dev/null; pwd`


#server内存配置
export JAVA_OPTS="$JAVA_OPTS -Dorg.apache.catalina.security.SecurityListener.UMASK=`umask` -server -Xms8G -Xmx8G -XX:NewRatio=50 -XX:PermSize=128M -XX:MaxPermSize=512M -Xss512k"

#gc
#export JAVA_OPTS="$JAVA_OPTS -XX:MaxTenuringThreshold=4 -XX:+UseG1GC -XX:InitiatingHeapOccupancyPercent=35 -XX:ConcGCThreads=12 -XX:+UnlockExperimentalVMOptions -XX:+AggressiveOpts -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:MaxGCPauseMillis=400 -XX:GCPauseIntervalMillis=8000"
export JAVA_OPTS="$JAVA_OPTS -XX:MaxTenuringThreshold=4 -XX:+UseG1GC -XX:InitiatingHeapOccupancyPercent=35 -XX:ConcGCThreads=1 -XX:+UnlockExperimentalVMOptions -XX:+AggressiveOpts -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:MaxGCPauseMillis=400 -XX:GCPauseIntervalMillis=8000"

#gc日志
export JAVA_OPTS="$JAVA_OPTS -Xloggc:$BASE_HOME/logs/gc.log.`date +%Y-%m-%d_%H` -XX:+UseGCLogFileRotation -XX:GCLogFileSize=100M -XX:NumberOfGCLogFiles=20 -XX:+PrintFlagsFinal -XX:+PrintReferenceGC -XX:+PrintGCDateStamps -XX:+PrintAdaptiveSizePolicy -XX:+UnlockDiagnosticVMOptions -XX:+G1SummarizeConcMark -XX:+PrintHeapAtGC -XX:+PrintTenuringDistribution -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCApplicationStoppedTime -XX:+PrintGCApplicationConcurrentTime -XX:PrintFLSStatistics=1"

#内存溢出
export JAVA_OPTS="$JAVA_OPTS -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$BASE_HOME/logs/heapdump.hprof"
