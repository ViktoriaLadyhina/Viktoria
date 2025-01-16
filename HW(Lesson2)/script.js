////// ДЗ
// проверить слово на полиндром
let word = "Шалаш"
let reversword = ""
for (let i = word.length-1; i >= 0; i--) {
    reversword += word[i]
}
if(word.toLowerCase() === reversword.toLowerCase()){
    console.log(`Слово ${word} это полиндром`);
}else {
    console.log(`Слово ${word} это не полиндром`);
}
// 1 - в задаче повыше учесть еще и регистр букв.
// Anna !== annA (надо исправить чтобы регистр не вляил на результат)


console.log("----------");
// Средняя задача
// Напишите программу, которая принимает строку из чисел, разделенных запятыми (например, "1,2,3,4,5") и выводит сумму всех чисел.
let str = "1,2,3,4,5";
function sum(str) {
   let tmp = str.split(',');
   let sum = 0;
for (let i = 0; i < tmp.length; i++) {
    sum += Number(tmp[i]);
}
console.log(sum); 
}
sum(str);


console.log("----------");
// Простая задача
// Дан массив из строк. Программа должна подсчитать количество слов, которые содержат больше 5 символов.
let arr = ["apple", "banana", "pear"];
function calculateTheLengthOfWords(arr){
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
        if(arr[i].length > 5){
            count++;
        }
    }
    console.log(count);
}
calculateTheLengthOfWords(arr)

console.log("----------");
// Простая задача
// Создайте массив чисел от 1 до 20. Выведите все четные числа из этого массива.
let arr1 = [];
for (let i = 1; i <= 20; i++) {
    arr1.push(i)
}
for (let i = 0; i < arr1.length; i++) {
    if(arr1[i] % 2 == 0){
        console.log(arr1[i]);
    }
}

console.log("----------");
// Сложная задача
// Дана строка из нескольких слов, разделенных пробелами. Напишите программу, которая переворачивает каждое слово в строке и выводит полученный результат.
let str1 = "apple banana pear";
function rev(str){
    strRev = str1.split("").reverse().join("")
    console.log(strRev);
}
rev(str1);
// Метод split() разбивает строку на более мелкие сегменты. ...
// Функция reverse() изменяет последовательность элементов в массиве, меняя их порядок на противоположный. 
// Метод join() объединяет элементы массива обратно в строку.

console.log("----------");
// Средняя задача
// Сгенерируйте массив из 10 случайных чисел от 1 до 100. Найдите максимальное и минимальное число в массиве, а также их разницу.
let arr2 = [];
for (let i = 0; i < 10; i++) {
    let rand = Math.floor(Math.random() * (100 - 1 + 1)) + 1;;
    arr2.push(rand);
}
let max = arr2[0];
let min =  arr2[0];
for (let i = 0; i < arr2.length; i++) {
    if(arr2[i] > max){
        max = arr2[i]
    }
    if(arr2[i] < min){
        min = arr2[i]
    }
}
console.log(arr2);
console.log(`${max} - ${min} = ${max - min}`);

console.log("----------");
// Сложная задача
// Дан массив чисел, например [10, 15, 3, 7, 20, 8, 25]. Найдите два числа, сумма которых равна 25, и выведите их. Если таких чисел нет, выведите сообщение об этом.
let arr3 = [10, 15, 3, 7, 20, 8, 25];
let a;
let b;
let s = 0;
for (let i = 0; i < arr3.length; i++) {
    for (let j = 0; j < arr3.length; j++) {
        if(arr3[i] + arr3[j] === 25){
            a = arr3[i]
            b = arr3[j]
        }
    }
}
let sum1 = a + b;
if (sum1 == 25) {
    console.log(`${a} + ${b} = 25`);
}else{
    console.log("таких чисел нет");
}


console.log("----------");
// Средняя задача
// Напишите программу, которая принимает строку из букв и цифр (например, "a1b2c3d4"), и создает два массива отдельно с числами и отдельно с буквами из этой строки: [1, 2, 3, 4] [a, b , c, d]
let str2 = "a1b2c3d4";
function makesTwoArrays(str){
let arrStr = [];
let arrInt = [];
str = str.split('');
for (let i = 0; i < str.length; i++) {
    if(isNaN(str[i])){
       arrStr.push(str[i]);
    }else{
        arrInt.push(str[i]);
    }
}
console.log(str);
console.log(arrStr);
console.log(arrInt);
}
makesTwoArrays(str2);


console.log("----------");
// Сложная задача
// Дан массив строк, например ["abcd", "def", "ghiab", "jklaf", "asdgdfhfgh"]. Объедините их в одну строку, добавив между ними символ -, но только между строками, где количество букв совпадает.
let arr4 = ["abcd", "def", "ghiab", "jklaf", "asdgdfhfgh"];
let leng = "";
for (let i = 0; i < arr4.length; i++) {
    for (let j = 0; j < arr4.length; j++) {
        if(arr4[i].length == arr4[j].length && i != j){
            leng = arr4[i] + "-" + arr4[j];
        }
    }
}
console.log(leng);
