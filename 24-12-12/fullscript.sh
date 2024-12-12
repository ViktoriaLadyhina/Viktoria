#!/bin/bash
echo "Hello Student!"
echo "Введите свое имя"
read NAME
echo "Welcome to terminal" $NAME
touch /tmp/mydate.txt
date +"%H:%M:%S" > /tmp/mydate.txt
echo "Сохраняем данные "
for run in {1..10}
do
sleep 0.5
echo $run
done
echo "Data saved. continue work"
df -h >> /tmp/mydate.txt
cp /tmp/mydate.txt /opt/mydate/newmydate.txt
for run in {1..5}
do
sleep 1
echo $run
done
echo "Well done Boss"
export PATH=/opt/081024_morning/Viktoria/:$PATH 
#Это временно, до перезарузки. Чтобы сделать постоянно, нужно отредактировать файл /.bashrc - добавить в конце строку 9. Но я не рискну делать постоянные изменения на удаленном сервере, тем более с возможными ошибками...
