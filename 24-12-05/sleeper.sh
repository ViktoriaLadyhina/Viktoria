#!/bin/bash

for run in {1..10}
do
date +%T
#sleep 5
done

ps -ef | tail -n +2 | wc -l 

cat /proc/cpuinfo > proces.txt
 
cat /etc/os-release | grep ^NAME > os.txt 

cat /etc/os-release | grep &NAME | awk -F= '{print $2}' | awk '{print $1}' >> os.txt  

touch {50..100}.txt 
