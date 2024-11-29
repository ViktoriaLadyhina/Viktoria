#!/bin/bash
USER=Vika
date
echo Hello $USER
pwd
ps -ef | tail -n +2 | wc -l
ps aux | grep '[b]ioset' | wc -l
ls -l /etc/passwd | awk '{print $1}'
